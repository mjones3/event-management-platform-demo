#!/bin/bash
set -e

echo "🚀 Starting pet-store..."

# Check if Docker is available
if command -v docker &> /dev/null; then
    echo "🐳 Starting with Docker Compose..."
    docker-compose up --build -d
    
    echo "⏳ Waiting for services to be healthy..."
    sleep 30
    
    echo "🔍 Checking service health..."
    curl -f http://localhost:8080/actuator/health || echo "❌ Health check failed"
    
    echo "📖 API Documentation: http://localhost:8080/swagger-ui.html"
    echo "❤️  Health Endpoint: http://localhost:8080/actuator/health"
    echo "🏠 Service Root: http://localhost:8080/"
else
    echo "📦 Building with Maven..."
    mvn clean package -DskipTests
    
    echo "☕ Starting Spring Boot application..."
    java -jar target/*.jar
fi
