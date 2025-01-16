# Java Payroll System

This is a simple Java payroll system that manages employees and calculates their salaries. The system supports both full-time and part-time employees.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Class Structure](#class-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [License](#license)

## Introduction
The Java Payroll System is designed to manage employees' information and calculate their salaries based on their employment type. It uses object-oriented principles such as inheritance and polymorphism to achieve this functionality.

## Features
- Add full-time and part-time employees
- Calculate and display employee salaries
- Remove employees from the system
- Display employee details

## Class Structure
- **Employee**: An abstract class representing a general employee with attributes like `id`, `name`, and an abstract method `calculateSalary()`.
- **FullTimeEmployee**: A subclass of `Employee` for full-time employees with an attribute `monthlySalary`.
- **PartTimeEmployee**: A subclass of `Employee` for part-time employees with attributes `hoursWorked` and `rate`.
- **PayRollSystem**: A class that manages a list of employees and provides methods to add, remove, and display employees.
- **Main**: The main class that contains the entry point of the application.

## Getting Started
To get started with the project, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/payroll-system.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd payroll-system
   ```

3. **Compile the Java files**:
   ```bash
   javac Main.java
   ```

4. **Run the application**:
   ```bash
   java Main
   ```

## Usage
The application allows you to add full-time and part-time employees, calculate their salaries, and display their details. Below is a sample usage:

1. **Add Employees**:
   ```java
   PayRollSystem PS = new PayRollSystem();
   FullTimeEmployee FE = new FullTimeEmployee("Sarfaraz Essa", 9, 100000);
   PartTimeEmployee PE = new PartTimeEmployee("Amir Essa", 8, 6, 500);
   PS.addEmployee(FE);
   PS.addEmployee(PE);
   ```

2. **Display Employees**:
   ```java
   PS.displayEmployee();
   ```

3. **Remove Employees**:
   ```java
   PS.removeEmployee(9);
   PS.displayEmployee();
