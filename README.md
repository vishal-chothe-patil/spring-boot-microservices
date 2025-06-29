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

## 🧱 Microservice Architecture Overview

`Client → Validation Service → (calls REST) → Storage Service → MySQL`


📦 Services:
- `validation-service`: Input validation and forwarding
- `storage-service`: Data persistence

Communication between services is done using `RestTemplate` over HTTP.

---

## 🧾 Entity Fields & Validations (User)

| Field    | Type    | Validation                               |
|----------|---------|-------------------------------------------|
| name     | String  | Required, alphabets only (A–Z, a–z)       |
| email    | String  | Valid email format                        |
| age      | Integer | Required, numeric                         |
| mobile   | String  | 10-digit numeric only                     |
| rollNo   | String  | Optional                                  |
| dept     | Enum    | Must be one of: HR, IT, FINANCE, SALES    |

---

## Microservice Details

### 1. Validation Service (Port: `8081`)

- Validates user input using `javax.validation`
- Uses `@Valid` and `@Pattern`, `@Email`, etc.
- Forwards validated data to the Storage Service using `RestTemplate`

**Endpoints:**

  -   POST /validate → Validate & forward to storage
  -   PUT /validate/{id} → Validate update & forward
  -   DELETE /validate/{id} → Forward delete
  -   GET /validate/{id} → Retrieve user from storage
      
---

### 2. Storage Service (Port: `8082`)

- Persists validated user data into MySQL
- Uses Spring Data JPA for full CRUD
- Responds to forwarded requests from validation-service

**Endpoints:**

  -  POST /store → Save new user
  -  PUT /store/{id} → Update user
  -  DELETE /store/{id} → Delete user
  -  GET /store/{id} → Get user by ID
 


