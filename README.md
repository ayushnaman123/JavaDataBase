JDBC CRUD Operations Utility
This repository contains a Java application designed to perform Create, Read, Update, and Delete (CRUD) operations on a relational database using JDBC (Java Database Connectivity).

Key Features
Unified Connection Management: Centralized utility class for managing database connections, including opening and closing connections.
Configuration via Properties File: Uses an external properties file (db.properties) to manage database connection settings (URL, username, password), allowing dynamic updates without code modifications.
JDBC 4.x Compatibility: Utilizes JDBC 4.x autoloading features to automatically load the appropriate database driver based on the JDBC URL.

Components
DatabaseUtil.java: Provides methods for establishing database connections and closing resources.
db.properties: Configuration file for database connection details.
CRUD Operations: Example code demonstrating how to perform CRUD operations using the utility class.

Usage
Configure Database:

Update the db.properties file with your database connection information.
Run the Application:

Use the provided utility methods to connect to the database and execute CRUD operations.
This setup ensures that database connection details can be updated seamlessly without stopping the application, leveraging JDBC 4.x features for improved driver management.
