# spring-boot-microservices example 🔗⚙️

## Description : validation-storage-services 📋 
This Spring Boot microservices project demonstrates integration of a `validation-service` and a `storage-service`.  
- **Validation Service**: Validates user input before processing.
- **Storage Service**: Stores validated data in a MySQL database with full CRUD functionality.
- Services communicate via RESTful APIs.  
- Built with Spring Boot, Spring Web, Spring Data JPA.

---

##  What Are Microservices? 📌

**Microservices** is an architectural style where an application is structured as a collection of small, independent services. Each service is self-contained and performs a single business capability. They communicate over lightweight protocols like **HTTP/REST**.

### Why Microservices?

- **Separation of concerns** – smaller services are easier to manage and maintain.
- **Scalability** – individual services can be scaled independently.
- **Faster development** – teams can work in parallel on different services.
- **Technology flexibility** – each service can use different tech stacks or databases.

---

## Microservice Details

### 1️⃣ Validation Service (Port: 8081)

- **Receives** user data via API
- **Validates** fields like name, email, mobile, department, etc.
- If valid, **forwards** request to Storage Service

### 2️⃣ Storage Service (Port: 8082)

- Stores validated data in a MySQL database
- Provides full **CRUD** operations for `User` entity
