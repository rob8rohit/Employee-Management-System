# 👨‍💼 Employee Management System

A Spring Boot-based web application that provides CRUD operations to manage employee data. It supports functionalities like adding new employees, updating existing details, and viewing a list of all employees in a user-friendly web interface.

## 🚀 Features

- Add new employee records
- Update employee details
- Delete employees
- View all employees in a tabular format
- Web interface with forms and data views

## 🛠️ Technologies Used

- Java 8+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf (HTML/CSS)
- MySQL
- Maven

## 🗂️ Project Structure

src/
└── main/
├── java/
│ └── com.example.employeemanagement/
│ ├── controller/
│ ├── entity/
│ ├── repository/
│ ├── service/
│ └── EmployeeManagementSystemApplication.java
└── resources/
├── templates/ # HTML pages
├── static/ # CSS files
└── application.properties


## 🧑‍💻 Endpoints Overview

| Page            | URL Path           | Function                        |
|-----------------|--------------------|---------------------------------|
| Employee List   | `/employees`       | View all employees              |
| Add Employee    | `/employees/new`   | Form to add a new employee      |
| Edit Employee   | `/employees/edit/{id}` | Update existing employee    |
| Delete Employee | `/employees/delete/{id}` | Delete an employee         |


