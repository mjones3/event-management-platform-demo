#!/bin/bash
set -e

DB_NAME=${1:-"registration_analytics_service_db"}
DB_USER=${2:-"postgres"}
DB_PASSWORD=${3:-"password"}
DB_HOST=${4:-"localhost"}
DB_PORT=${5:-"5432"}

echo "🗄️  Initializing database: $DB_NAME"

# Wait for PostgreSQL to be ready
until PGPASSWORD=$DB_PASSWORD psql -h $DB_HOST -p $DB_PORT -U $DB_USER -c '\q'; do
  echo "⏳ Waiting for PostgreSQL..."
  sleep 2
done

# Create database if it doesn't exist
PGPASSWORD=$DB_PASSWORD psql -h $DB_HOST -p $DB_PORT -U $DB_USER -tc "SELECT 1 FROM pg_database WHERE datname = '$DB_NAME'" | grep -q 1 || \
PGPASSWORD=$DB_PASSWORD psql -h $DB_HOST -p $DB_PORT -U $DB_USER -c "CREATE DATABASE \"$DB_NAME\""

# Run schema script
echo "📋 Running schema migrations..."
PGPASSWORD=$DB_PASSWORD psql -h $DB_HOST -p $DB_PORT -U $DB_USER -d $DB_NAME -f 001_initial_schema.sql

echo "✅ Database initialization completed!"
