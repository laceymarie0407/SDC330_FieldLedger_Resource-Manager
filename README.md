# FieldLedger Resource Manager

**Java Console Application | Construction Resource Tracking and Cost Estimating**

## Overview

FieldLedger Resource Manager is a Java application developed to organize the equipment, labor, and materials used in construction estimating. It is a separate learning project based on the larger FieldLedger construction management concept, which tracks jobs, estimates, daily reports, and progress.

Construction estimators need a convenient way to reference equipment rates, labor costs, and material prices. This application models those resources and supports basic resource-management operations and draft cost calculations without changing live job estimates.

## Project Features

The Java implementation includes methods to:

- Add and display equipment, labor, and material resources.
- Search for a resource by its ID.
- Update or remove a resource from the in-memory collection.
- Calculate a draft cost by multiplying a resource's unit cost by a quantity or number of hours.

The initial application uses sample resources to demonstrate these methods. **An interactive user menu and persistent SQLite database CRUD were part of the project design but are not confirmed as completed in this version.** The in-memory resource list does not retain changes between application runs.

## Java Class Design

| Class | Purpose |
| --- | --- |
| `Resource` | Abstract parent class with shared resource ID, name, unit, unit cost, and active status |
| `Equipment` | Resource subclass for equipment |
| `Labor` | Resource subclass for labor |
| `Material` | Resource subclass for materials |
| `ResourceOperations` | Interface defining add, view, search, update, and remove operations |
| `ResourceManager` | Implements resource operations and calculates estimated costs |
| `App` | Main application used to demonstrate resource functionality |
| `DatabaseManager` | Database-support component described in the design; not verified as implemented |

## Object-Oriented Programming Concepts

- **Abstraction:** `Resource` defines the common properties and behaviors of all resource types.
- **Inheritance:** `Equipment`, `Labor`, and `Material` extend `Resource`.
- **Polymorphism:** Each resource type overrides `toString()`, allowing resource-specific output through a `Resource` reference.
- **Encapsulation:** Resource fields are private and accessed through public getters and setters.
- **Interfaces:** `ResourceOperations` defines the resource-management methods implemented by `ResourceManager`.
- **Composition:** `ResourceManager` maintains a collection of `Resource` objects.
- **Constructors and access specifiers:** Constructors initialize resources; public and private members separate accessible operations from internal data.

## Running the Application

1. Open the repository as a Java project in Visual Studio Code or another Java IDE.
2. Open `App.java` in the `src` folder, if that is where the source files are stored.
3. Run the `App` class.
4. Review the terminal output for resource records, searches, updates, removals, and cost calculations supported by the current `App.java`.

No database configuration is needed for the in-memory version. If a database-backed version is later added, its JDBC dependency and setup instructions should be documented here.

## Example Cost Calculation

An excavator costing **$145 per hour** for **8 hours** has a draft resource cost of **$1,160** (`145 × 8`). This is an example of the calculation the application is designed to perform, not a complete job estimate.

## Current Limitations and Next Steps

The initial design called for an interactive terminal menu and SQLite-based create, read, update, and delete operations. Those features still need to be completed or verified in the final code. Future development could add persistent storage, input validation, an interactive menu, and integration with the broader FieldLedger web application.

## Project Summary

FieldLedger Resource Manager addresses a practical challenge in construction estimating: organizing resource information and calculating draft costs consistently. The project demonstrates how object-oriented Java classes can represent equipment, labor, and materials without duplicating shared attributes. An abstract superclass, subclasses, an interface, and a manager class separate resource data from the operations performed on it.

The strongest part of this implementation is its object-oriented structure. The main remaining challenge is completing the transition from temporary in-memory data to persistent SQLite storage and an interactive user experience. The project reinforced the value of designing reusable classes and testing features incrementally, and it provides a foundation for further FieldLedger development.
