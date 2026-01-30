# Cloud File Storage System ☁️

A distributed cloud-native file storage backend (Mini Google Drive architecture) built using Spring Boot microservices.

## Architecture
Client → API Gateway → Load Balancer → Storage Nodes  
Client → API Gateway → Metadata Service → PostgreSQL

## Features
- API Gateway routing
- Proxy Load Balancer
- Multi-node distributed storage
- Metadata management service
- PostgreSQL integration
- Multipart file upload
- Microservices architecture
- Cloud-native design
- Docker-ready
- Scalable architecture

## Tech Stack
- Java 17
- Spring Boot
- Spring Cloud Gateway
- PostgreSQL
- Docker
- Maven
- REST APIs

## Services
- api-gateway (8080)
- load-balancer (8084)
- storage-node-1 (8081)
- storage-node-2 (8082)
- metadata-service (8083)
- postgres (5432)

## How to Run (Local Dev)

Start services in order:

1. PostgreSQL  
2. metadata-service  
3. storage-node-1  
4. storage-node-2  
5. load-balancer  
6. api-gateway  

Upload test:
```bash
curl -F "file=@test.txt" http://localhost:8080/storage/upload

