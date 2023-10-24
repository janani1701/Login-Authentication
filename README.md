# Login-Authentication


This Java application provides a simple user registration and sign-in system with an SQLite database backend. Users can register, sign in, and reset their passwords.

## Table of Contents
- [Prerequisites](#prerequisites)
- [How to Use](#how-to-use)
- [Project Structure](#project-structure)
- [Class Descriptions](#class-descriptions)
- [Database](#database)
- [Main](#main)
- [Registration](#registration)
- [SignIn](#signin)
- [User](#user)
- [License](#license)

## Prerequisites
- Java Development Kit (JDK)
- SQLite JDBC Driver
- An IDE or compiler for Java (e.g., IntelliJ IDEA, Eclipse, or javac)

## How to Use
1. Clone or download this repository.
2. Open the project in your preferred Java development environment.
3. Add the SQLite JDBC driver library to your project (usually a JAR file).
4. Run the `Main` class to start the user registration and sign-in system.

## Project Structure
The project consists of several Java classes and follows a simple console-based interaction. Below is a brief overview of each class:

## Class Descriptions

### Database
- This class is responsible for managing the SQLite database.
- It creates a `users` table if it doesn't exist, with columns for email, username, and password.
- Provides methods to add a user, retrieve a user by email, and perform other database-related operations.

### Main
- The entry point of the application.
- Provides a simple command-line menu for users to register, sign in, reset passwords, or exit the system.
- Creates instances of `Database`, `Registration`, and `SignIn` classes to handle user interactions.

### Registration
- Manages user registration.
- Checks if a user with the given email already exists in the database and handles registration accordingly.
- Provides feedback to the user about the registration process.

### SignIn
- Manages user sign-in and password reset.
- Validates user credentials and allows users to sign in.
- Also allows users to reset their passwords, provided they exist in the database.
- Provides feedback to the user about the sign-in and password reset processes.

### User
- A simple data class representing a user.
- Contains fields for email, username, and password.
- Used for data storage and retrieval.
