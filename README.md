# Expense Manager System

A robust, professional-grade Expense Tracker built with Java. This project demonstrates clean code practices, 3-tier software architecture, and database persistency using SQLite.

## Overview
This application allows users to manage financial expenses efficiently. It is designed to be scalable, maintainable, and decoupled, making it a perfect example of professional software engineering practices.

## Technical Architecture
This project implements the **3-Tier Architecture** pattern to ensure separation of concerns:

1. **Presentation Layer (`main`):** Handles user interaction. It has no knowledge of how data is stored.
2. **Business Logic Layer (`service`):** Contains the core logic and manages the application state.
3. **Data Access Layer (`dao`):** Encapsulates all database operations. It uses the **DAO (Data Access Object) Pattern** to interact with the database, ensuring the rest of the application remains independent of the database technology.

## Key Features
- **Data Persistence:** Uses SQLite with JDBC for reliable data storage.
- **Dependency Injection:** The `ExpenseTracker` receives its dependencies (DAO) via the constructor, allowing for better modularity and testability.
- **Professional Structure:** Organized using Java packages (`model`, `dao`, `service`, `main`) for high maintainability.

## Technologies Used
- **Language:** Java
- **Database:** SQLite
- **Connectivity:** JDBC (Java Database Connectivity)
- **Tooling:** IntelliJ IDEA, Git/GitHub

## Getting Started
### Prerequisites
- Java JDK 11 or higher
- IntelliJ IDEA (or any Java IDE)

### Installation
1. Clone the repository:
   ```bash
   git clone [https://github.com/m-laanzalco/gestione-libreria.git](https://github.com/m-laanzalco/gestione-libreria.git)