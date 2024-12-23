# Homework #10
Add 7 collection streaming in the hierarchy with terminal and non-terminal operations:

Non-Terminal

**`filter()`**
**`collect()`**
**`mapToInt()`**
**`sorted()`**
**`distinct()`**
**`limit()`**
**`map()`**

Terminal

**`forEach()`**
**`average()`**

Extracting information using reflection

For class

**`Class<?> movieClass = Class.forName("movieshop.Movie");`**

For fields

**`Field field : movieClass.getDeclaredFields()`**

Fot methods

**`Method method : movieClass.getDeclaredMethods()`**

For constructor

**`Constructor<?> constructor : movieClass.getDeclaredConstructors()`**


Creating an instance

**`Constructor<?> movieConstructor = movieClass.getConstructor(String.class, String.class, String.class, int.class, int.class);`**

**`Object movieInstance = movieConstructor.newInstance("The Matrix", "Sci-Fi", "The Wachowskis", 1999, 136);`**

Invoking a method

**`Method getTitleMethod = movieClass.getMethod("getTitle");`**

**`Object title = getTitleMethod.invoke(movieInstance);`**

# Homework #9
Lambda functions from the java.util.function package used in `MovieShop` class:

**`Predicate<Client>`** 

**`Function<Client, String>`**

**`Consumer<Client>`** 

**`Supplier<String>`**

**`UnaryOperator<Client>`**

Custom Lambda functions used in `MovieShop` class and defined in `customlambda.movieshop` package:

**`GenericCheck<String, Boolean>`** - Used to check if birthdate of a client is >= 18

**`ListCounter<Staff>`** - Used to count Staff

**`ListParameterCounter <Staff, String>`** - Used to count Staff based on a given parameter i.e Position

Enums created: `WorkDepartment`, `TransactionType`, `PaymentMethod`, `MovieGenre`, `MovieAvailability`


# Homework #8
Created class `UniqueWordsCount` that takes an input file and returns an output file with number of words and number of unique words

Location of `UniqueWordsCount` - `wordscounter/UniqueWordsCount`

inputFIle.txt and outputFile.txt are located in a root directory


# Homework #7
Moved project to Maven, Added plugins, Ran different phases, Built Jar file

# Homework #6

## Hierarchy and Collections

### Added Collections to the Hierarchy:
1. **`HashSet<Staff> femaleStaff`** in the `StaffGenderSet` class  
2. **`HashSet<Staff> maleStaff`** in the `StaffGenderSet` class  
3. **`ArrayList<Staff> staffList`** in the `MovieShop` class  
4. **`ArrayList<Membership> membershipList`** in the `MovieShop` class  
5. **`LinkedHashMap<Staff, String> staffByDepartment`** in the `StaffDepartment` class  

---

## Custom LinkedList with Generics

### Created in:
**`Cart<T>`** class


# Homework #5

## Create 5 custom exceptions

The following custom exceptions are defined in the `exceptions/movieshop` package:

- `ClientNotFoundException`
- `InvalidCharactersException`
- `InvalidMovieYearException`
- `MovieNotFoundException`
- `NegativePriceException`

## Handle exceptions in 2 ways

### Exceptions Handled with `throws` Declaration
- `InvalidMovieYearException`
- `NegativePriceException`
- `MovieNotFoundException`

### Exceptions Handled with `try-catch`
- `ClientNotFoundException`
- `InvalidCharactersException`

## Use try-catch with resources
- Exceptions are handled using try-catch with resources when working with `BufferedWriter` to write error messages to a log file
  
## Log messages to the console, file
  - To the console using `System.out.println()` and `System.err.println()`.
  - To a file named `error.log` using `BufferedWriter` with `FileWriter`.


# Homework #4

- **Add 5 interfaces to the existing hierarchy.**  
  Added: `ITitle`, `IGenre`, `IDirector`, `IYear`, `IDuration`  

- **Use polymorphism with the abstract class and interface from the hierarchy.**  
  Used in `Movie` class  

- **Create final class, method, variable.**  
  - Final class: `RentMovie`, `BuyMovie`, `SellMovie`, `MovieShop`  
  - Final method: `processTransaction()`  
  - Final variable: `SHOP_NAME`  

- **Create a static block, method, variable.**  
  - Static block in `MovieShop`: Printing shop open info and welcome message with shop name  
  - Static method in `MovieShop`: `shopName()` - Returning welcome message with shop name  
  - Static variable in `MovieShop`: `SHOP_NAME`  


# Homework #3:

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
