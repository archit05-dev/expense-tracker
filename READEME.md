# Expense Tracker

A Java-based console application for managing personal expenses. This project was built to practice Object-Oriented Programming (OOP), file handling, data persistence, and Git/GitHub workflows.

## Features

* Add a new expense
* View all expenses
* Delete an expense by ID
* Filter expenses by category
* Calculate total expenses
* Automatic data persistence using file handling
* Automatic loading of saved expenses when the application starts
* Unique expense ID validation
* Menu-driven console interface
* Input validation and exception handling

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* File Handling (`BufferedReader`, `BufferedWriter`, `FileReader`, `FileWriter`)
* Git and GitHub

## Project Structure

```text
src/
├── Main.java
└── model/
    ├── Expense.java
    └── ExpenseManager.java
```

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/archit05-dev/expense-tracker.git
```

2. Open the project in your preferred IDE.

3. Compile and run `Main.java`.

4. Use the menu to manage expenses.

## Data Storage

Expense data is stored locally in `expenses.txt`.

This file is generated automatically when expenses are added and is excluded from version control using `.gitignore`.

## Future Improvements

* Automatic expense ID generation
* Edit existing expenses
* Date validation
* Monthly and category-wise reports
* Database integration
* Graphical user interface (GUI)

```
```
