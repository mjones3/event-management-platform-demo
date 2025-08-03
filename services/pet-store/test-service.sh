#!/bin/bash
set -e

SERVICE_URL="http://localhost:8080"

echo "🧪 Testing pet-store..."

# Test root endpoint
echo "Testing root endpoint..."
curl -s "$SERVICE_URL/" | jq . || echo "Root endpoint test failed"

# Test health endpoint
echo "Testing health endpoint..."
curl -s "$SERVICE_URL/actuator/health" | jq . || echo "Health endpoint test failed"

# Test API health endpoint
echo "Testing API health endpoint..."
curl -s "$SERVICE_URL/api/v1/health" | jq . || echo "API health endpoint test failed"

echo "✅ Service tests completed!"
