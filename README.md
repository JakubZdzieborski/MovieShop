Homework #3:

- Use polymorphism with at least one abstract class  
    Created abstract `Transaction` class, abstract method, and implemented it in `SellMovie`, `RentMovie`, `BuyMovie` classes.  

- Create and override at least one abstract method  
    Created `processTransaction` method in `Transaction` abstract class and overridden it in `SellMovie`, `RentMovie`, `BuyMovie` classes.  

- Use protected modifier at least 5 times  
    Used `protected` modifier for variables 5 times in `Transaction` abstract class and once for the `processTransaction` method (as well as in subclasses).  

- Override methods from class Object (`toString()`, `hashCode()`, `equals()`) for at least 3 classes from the hierarchy.  
    Overridden:  
    - `toString()` 6 times (`Client`, `Movie`, `RentMovie`, `BuyMovie`, `SellMovie`, `Transaction`).  
    - `hashCode()` 3 times (`Client`, `Movie`, `Transaction`).  
    - `equals()` 3 times (`Client`, `Movie`, `Transaction`).  
