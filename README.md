# Spring Boot CRUD Example

This is a simple Spring Boot application that demonstrates CRUD (Create, Read, Update, Delete) operations using a Student class. The application uses a DAO layer to manage students and a configuration class to initialize the DAO bean.

## Getting Started

To run the application, follow these steps:

1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Run the `Application` class located in the `com.example` package.

The application will create, read, update, and delete students, showcasing the CRUD operations.

## Components

### `Student` Class

This class defines the structure of a student, with fields for `id`, `name`, and `age`.

### `StudentDAO` Interface and `StudentDAOImpl` Implementation

The DAO (Data Access Object) layer provides methods for CRUD operations on students. The `StudentDAO` interface defines the contract, and the `StudentDAOImpl` class implements these methods using a `Map` to simulate database interactions.

### `StudentDaoConfig` Configuration Class

This class is responsible for creating the `StudentDAO` bean using the `@Bean` annotation.

### `Application` Class

The main class of the application. It retrieves the `StudentDAO` bean from the Spring context and demonstrates the CRUD operations on students.

## Conclusion

This example demonstrates how to create a Spring Boot application with a simple CRUD system using a DAO layer. It's a starting point for building more complex applications with database interactions.
