# User Management System (Spring Boot)

## 🚀 Project Overview
This is a simple User Management REST API built using Spring Boot.

It supports basic CRUD operations:
- Create User
- Get All Users
- Get User by ID
- Update User
- Delete User

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## 📌 API Endpoints

### Create User
POST /users

### Get All Users
GET /users

### Get User by ID
GET /users/{id}

### Update User
PUT /users/{id}

### Delete User
DELETE /users/{id}

## ▶️ How to Run

1. Clone the repository:
2. Run the application:
3. open H2 Console:   http://localhost:8080/h2-console


## 📊 Sample JSON

```json
{
  "name": "Sankar",
  "email": "Sankar@gmail.com",
  "city": "Dallas"
}
