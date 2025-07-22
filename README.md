✅ S — Single Responsibility Principle (SRP):
Definition: A class should have only one reason to change.

Use Case in Project:

Report.java: handles report data

ReportPrinter.java: handles printing

ReportSaver.java: handles file saving

Each class is focused and maintains one responsibility.


✅ O — Open/Closed Principle (OCP)

Definition: Classes should be open for extension but closed for modification.

Use Case in Project:
- `Shape` interface defines behavior
- `Circle`, `Rectangle`, and `Triangle` implement `Shape`
- `AreaCalculator` uses polymorphism (no `if-else`)

New shapes can be added **without modifying** `AreaCalculator`.


✅ L - Liskov Substitution Principle (LSP)

Definition: 
Objects of a superclass should be replaceable with objects of its subclasses without breaking the functionality of the program.

**Violation Example:**  
If a subclass throws an exception or changes the behavior when substituted in place of a parent class, it violates LSP.

**Use Case in Code:**  
We model birds where all birds lay eggs, but not all can fly. By separating flying birds and non-flying birds into different abstractions, we adhere to LSP and avoid runtime errors.

✅ I - Interface Segregation Principle (ISP)

Definition: 
Clients should not be forced to depend on interfaces they do not use.

**Violation Example:**  
If an interface has many methods, and implementing classes only need a few of them (like RobotWorker being forced to implement eat()), it violates ISP.

**Use Case in Code:**  
We separate `Workable` and `Eatable` interfaces. Now, HumanWorker implements both, but RobotWorker only implements what it needs — avoiding unnecessary code or exceptions.


✅ D - Dependency Inversion Principle (DIP)

Definition:  
High-level modules should not depend on low-level modules. Both should depend on abstractions.  
Abstractions should not depend on details. Details should depend on abstractions.

**Violation Example:** 
If a `Computer` class directly depends on a `MechanicalKeyboard`, changing the keyboard type (e.g., to a `WirelessKeyboard`) requires modifying the `Computer` class — making it tightly coupled.

**Use Case in Code:**
We introduce a `Keyboard` interface. Both `MechanicalKeyboard` and `WirelessKeyboard` implement it.  
Now, the `Computer` class depends only on the `Keyboard` abstraction — making it flexible, extendable, and loosely coupled.
