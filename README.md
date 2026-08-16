# Furniture Management System

A desktop furniture management system built with Java, Java Swing, and MySQL,
using core OOP principles (encapsulation, inheritance, polymorphism, abstraction).

## Features
- Role-based dashboards (Admin, Store Manager, Inventory Clerk, Warehouse Staff, Customer)
- Product, category, and order management
- Customer and user management
- Invoicing
- MySQL-backed persistent storage (schema in `fms_database.sql`)

## Running it
Open the project in NetBeans (it's a standard NetBeans Ant project — see `nbproject/`
and `build.xml`), import `fms_database.sql` into MySQL, update the DB credentials in
`JDBC.java`, then build and run.
