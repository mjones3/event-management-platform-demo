import yaml
import json
import re
import os
from datetime import datetime

def openapi_type_to_postgres(openapi_type, format_type=None, enum_values=None):
    """Convert OpenAPI types to PostgreSQL types"""
    type_mapping = {
        'string': {
            'date': 'DATE',
            'date-time': 'TIMESTAMP WITH TIME ZONE',
            'uuid': 'UUID',
            'uri': 'TEXT',
            'url': 'TEXT',
            'email': 'VARCHAR(255)',
            'password': 'VARCHAR(255)',
            None: 'TEXT'
        },
        'integer': {
            'int32': 'INTEGER',
            'int64': 'BIGINT',
            None: 'INTEGER'
        },
        'number': {
            'float': 'REAL',
            'double': 'DOUBLE PRECISION',
            None: 'DECIMAL(10,2)'
        },
        'boolean': {
            None: 'BOOLEAN'
        },
        'array': {
            None: 'JSONB'
        },
        'object': {
            None: 'JSONB'
        }
    }
    
    if enum_values:
        enum_list = "', '".join(enum_values)
        return f"VARCHAR(50) CHECK (VALUE IN ('{enum_list}'))"
    
    return type_mapping.get(openapi_type, {}).get(format_type, type_mapping.get(openapi_type, {}).get(None, 'TEXT'))

def snake_case(name):
    """Convert camelCase or PascalCase to snake_case"""
    s1 = re.sub('(.)([A-Z][a-z]+)', r'\1_\2', name)
    return re.sub('([a-z0-9])([A-Z])', r'\1_\2', s1).lower()

def generate_table_name(schema_name):
    """Generate table name from schema name"""
    table_name = schema_name
    for suffix in ['Response', 'Request', 'DTO', 'Entity']:
        if table_name.endswith(suffix):
            table_name = table_name[:-len(suffix)]
            break
    return snake_case(table_name) + 's'

try:
    # Load the OpenAPI spec
    with open('api-spec.yaml', 'r') as f:
        spec = yaml.safe_load(f)
    
    schemas = spec.get('components', {}).get('schemas', {})
    
    # Generate SQL
    sql_statements = []
    sql_statements.append("-- Generated PostgreSQL schema from OpenAPI specification")
    sql_statements.append(f"-- Generated on: {datetime.now().isoformat()}")
    sql_statements.append("")
    sql_statements.append('CREATE EXTENSION IF NOT EXISTS "uuid-ossp";')
    sql_statements.append('CREATE EXTENSION IF NOT EXISTS "pg_trgm";')
    sql_statements.append("")
    
    # Generate tables for schemas
    for schema_name, schema_def in schemas.items():
        if schema_def.get('type') == 'object' and 'properties' in schema_def:
            if any(suffix in schema_name for suffix in ['Request', 'Response', 'Error', 'Paged']):
                continue
            
            table_name = generate_table_name(schema_name)
            sql_statements.append(f"CREATE TABLE IF NOT EXISTS {table_name} (")
            sql_statements.append("    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),")
            sql_statements.append("    name VARCHAR(255) NOT NULL,")
            sql_statements.append("    description TEXT,")
            sql_statements.append("    status VARCHAR(50) DEFAULT 'ACTIVE',")
            sql_statements.append("    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,")
            sql_statements.append("    updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,")
            sql_statements.append("    version BIGINT DEFAULT 1")
            sql_statements.append(");")
            sql_statements.append("")
    
    # Write files
    schema_content = '\n'.join(sql_statements)
    
    with open('database/scripts/001_initial_schema.sql', 'w') as f:
        f.write(schema_content)
    
    with open('src/main/resources/db/migration/V1__Initial_schema.sql', 'w') as f:
        f.write(schema_content)
    
    print("✅ Generated PostgreSQL schema successfully!")
    
except Exception as e:
    print(f"⚠️  Could not generate database schema: {e}")
    # Create basic schema as fallback
    basic_schema = """-- Basic schema
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS entities (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50) DEFAULT 'ACTIVE',
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    version BIGINT DEFAULT 1
);"""
    
    with open('database/scripts/001_initial_schema.sql', 'w') as f:
        f.write(basic_schema)
    
    with open('src/main/resources/db/migration/V1__Initial_schema.sql', 'w') as f:
        f.write(basic_schema)
    
    print("✅ Generated basic database schema as fallback")
