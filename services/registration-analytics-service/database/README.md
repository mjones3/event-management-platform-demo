# Database Schema for registration-analytics-service

This directory contains the PostgreSQL database schema and related scripts for the registration-analytics-service.

## 📁 Structure

- `scripts/` - Database scripts and migrations
  - `001_initial_schema.sql` - Initial database schema
  - `002_sample_data.sql` - Sample data for development
  - `init-database.sh` - Database initialization script

## 🚀 Quick Start

### Using Docker Compose (Recommended)
The database is automatically set up when you run:
```bash
docker-compose up -d
```

### Manual Setup
1. **Start PostgreSQL:**
   ```bash
   docker run -d --name postgres \
     -e POSTGRES_DB=registration_analytics_service_db \
     -e POSTGRES_USER=postgres \
     -e POSTGRES_PASSWORD=password \
     -p 5432:5432 postgres:15
   ```

2. **Initialize the database:**
   ```bash
   cd database/scripts
   ./init-database.sh
   ```

3. **Connect to the database:**
   ```bash
   psql -h localhost -U postgres -d registration_analytics_service_db
   ```

## 📋 Connection Details

- **Host:** localhost
- **Port:** 5432
- **Database:** registration_analytics_service_db
- **Username:** postgres
- **Password:** password
