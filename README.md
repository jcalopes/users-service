# User Service

## Overview
The User Service is a Quarkus application designed to manage user-related operations. It is built using Kotlin and Java, and uses Maven for dependency management.

## Features
- User registration
- User authentication
- User profile management
- RESTful API endpoints

## Technologies
- **Languages**: Kotlin, Java
- **Frameworks**: Quarkus
- **Build Tool**: Maven

## Prerequisites
- JDK 11 or higher
- Maven 3.6.0 or higher

## Getting Started

### Clone the repository
```bash
git clone https://github.com/jcalopes/user_service.git
cd user_service
```

### Running the application in dev mode
You can run your application in dev mode that enables live coding using:
```bash
./mvnw quarkus:dev
```
> **_NOTE:_** Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

### Packaging and running the application
The application can be packaged using:
```bash
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory. Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using:
```bash
java -jar target/quarkus-app/quarkus-run.jar
```

If you want to build an _über-jar_, execute the following command:
```bash
./mvnw package -Dquarkus.package.jar.type=uber-jar
```
The application, packaged as an _über-jar_, is now runnable using:
```bash
java -jar target/*-runner.jar
```

### Running Tests
```bash
./mvnw test
```

## API Endpoints
- **POST** `/api/v1/user` - Register a new user
- **GET** `/api/v1/user/{username}` - Get user details by username
- **PUT** `/api/v1/user` - Update user details
- **DELETE** `/api/v1/user` - Delete a user

## Accessing Swagger UI
You can access the Swagger UI by running the application and navigating to:
<http://localhost:8080/q/swagger-ui/>

## Contributing
1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a new Pull Request
