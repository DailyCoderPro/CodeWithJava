### Classes and Objects in Java

#### **1. Introduction to Classes and Objects**

- **Class**: A class is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that the objects created from the class will have.
- **Object**: An object is an instance of a class. It is created based on the structure defined by the class and represents a real-world entity with attributes and behaviors.

#### **2. Defining a Class**

In Java, a class is defined using the `class` keyword followed by the class name. The class body is enclosed within curly braces `{}`.

Example:
```java
class Car {
    // Attributes (properties) of the class
    String brand;
    String model;
    int year;
    
    // Method (behavior) of the class
    void startEngine() {
        System.out.println("The engine is starting...");
    }
}
```

#### **3. Creating Objects**

Objects are created using the `new` keyword followed by the class constructor. The constructor has the same name as the class.

Example:
```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();
        
        // Accessing object properties and methods
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        myCar.startEngine();
    }
}
```

#### **4. Understanding Constructors**

- **Constructor**: A constructor is a special method used to initialize objects. It is called when an object is created and has the same name as the class. If no constructor is defined, Java provides a default no-argument constructor.

Example of a constructor:
```java
class Car {
    String brand;
    String model;
    int year;

    // Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
```

Creating an object with a constructor:
```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        System.out.println(myCar.brand + " " + myCar.model + " " + myCar.year);
    }
}
```

#### **5. Instance Variables and Methods**

- **Instance Variables**: These are the attributes of a class, and each object has its own copy of these variables.
- **Instance Methods**: These methods define the behaviors of the objects and can access and modify the instance variables.

Example:
```java
class Car {
    String brand;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
```

#### **6. `this` Keyword**

The `this` keyword refers to the current object instance. It is used to resolve ambiguity between instance variables and parameters with the same name.

Example:
```java
class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand; // 'this' refers to the instance variable
        this.model = model;
        this.year = year;
    }
}
```

#### **7. Access Modifiers**

- **Public**: The class, method, or variable is accessible from any other class.
- **Private**: The method or variable is accessible only within the class it is defined.
- **Protected**: The method or variable is accessible within its own package and by subclasses.

Example:
```java
class Car {
    private String brand;
    private String model;
    private int year;

    public void setDetails(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
```

#### **8. Static Variables and Methods**

- **Static Variables**: Belong to the class rather than any specific object. Only one copy of a static variable exists, regardless of how many instances of the class are created.
- **Static Methods**: Can be called without creating an object of the class. They cannot access instance variables or methods directly.

Example:
```java
class Car {
    static int numberOfCars = 0;

    Car() {
        numberOfCars++;
    }

    static void displayNumberOfCars() {
        System.out.println("Number of cars: " + numberOfCars);
    }
}
```

#### **9. `toString()` Method**

The `toString()` method returns a string representation of an object. It is often overridden to provide meaningful output.

Example:
```java
class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car[Brand=" + brand + ", Model=" + model + ", Year=" + year + "]";
    }
}
```

#### **10. Example Program**

Here is a complete example program using the concepts discussed:

```java
class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    @Override
    public String toString() {
        return "Car[Brand=" + brand + ", Model=" + model + ", Year=" + year + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayDetails();
        System.out.println(myCar.toString());
    }
}
```

### Summary

- **Class**: Blueprint for creating objects.
- **Object**: Instance of a class.
- **Constructor**: Initializes an object when it is created.
- **Instance Variables and Methods**: Define the properties and behaviors of objects.
- **`this` Keyword**: Refers to the current object.
- **Access Modifiers**: Control the visibility of class members.
- **Static Variables and Methods**: Belong to the class rather than any specific object.
- **`toString()` Method**: Provides a string representation of an object.

---
## Mini Project to understand Class and Object

### **Project 1: Bank Account Management System**

**Objective**: Create a simple system to manage bank accounts with basic functionalities like depositing, withdrawing, and checking balance.

#### **1. Define the `BankAccount` Class**

```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Balance: $" + balance);
    }
    
    // Method to display account details
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Holder: " + accountHolderName + "\n" +
               "Balance: $" + balance;
    }
}
```

#### **2. Create a Main Class to Test `BankAccount`**

```java
public class Main {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount myAccount = new BankAccount("12345678", "John Doe", 500.00);

        // Display account details
        System.out.println(myAccount);
        
        // Deposit money
        myAccount.deposit(150.00);

        // Withdraw money
        myAccount.withdraw(200.00);

        // Check balance
        myAccount.checkBalance();
        
        // Display account details again
        System.out.println(myAccount);
    }
}
```

### **Project 2: Library System**

**Objective**: Create a simple library system to manage books with functionalities to add and display books.

#### **1. Define the `Book` Class**

```java
public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    
    // Method to get book information as a string
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
```

#### **2. Define the `Library` Class**

```java
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to display all books
    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }
    }
}
```

#### **3. Create a Main Class to Test `Library` and `Book`**

```java
public class Main {
    public static void main(String[] args) {
        // Create Library object
        Library myLibrary = new Library();

        // Create Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book2 = new Book("1984", "George Orwell", "978-0451524935");

        // Add books to the library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        // Display all books
        myLibrary.displayBooks();
    }
}
```

### Summary

- **Bank Account Management System**: Helps understand class properties (attributes), methods, constructors, and object interaction with operations related to account management.
- **Library System**: Demonstrates class creation, object management in collections, and basic operations related to book handling.

These projects will provide practical experience in using classes and objects in Java, giving you a clearer understanding of object-oriented programming concepts.

## Project Again

Here are two additional small projects to further your understanding of classes and objects in Java:

### **Project 3: Student Management System**

**Objective**: Create a simple system to manage student information with functionalities to add students, display student details, and calculate average grades.

#### **1. Define the `Student` Class**

```java
public class Student {
    private String name;
    private int age;
    private double[] grades;

    // Constructor
    public Student(String name, int age, double[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    // Method to calculate average grade
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Grade: " + calculateAverage());
    }
    
    // Method to get student information as a string
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Average Grade: " + calculateAverage();
    }
}
```

#### **2. Define the `StudentManager` Class**

```java
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    // Method to display all students
    public void displayStudents() {
        System.out.println("Student List:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }
}
```

#### **3. Create a Main Class to Test `Student` and `StudentManager`**

```java
public class Main {
    public static void main(String[] args) {
        // Create StudentManager object
        StudentManager manager = new StudentManager();

        // Create Student objects
        double[] grades1 = {85.5, 90.0, 78.0};
        double[] grades2 = {88.0, 92.5, 80.0};
        Student student1 = new Student("Alice", 20, grades1);
        Student student2 = new Student("Bob", 22, grades2);

        // Add students to the manager
        manager.addStudent(student1);
        manager.addStudent(student2);

        // Display all students
        manager.displayStudents();
    }
}
```

### **Project 4: To-Do List Application**

**Objective**: Create a simple application to manage tasks with functionalities to add, remove, and display tasks.

#### **1. Define the `Task` Class**

```java
public class Task {
    private String description;
    private boolean isCompleted;

    // Constructor
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    // Method to mark task as completed
    public void markAsCompleted() {
        isCompleted = true;
    }

    // Method to display task details
    public void displayTask() {
        String status = isCompleted ? "Completed" : "Not Completed";
        System.out.println("Task: " + description + " - Status: " + status);
    }
    
    // Method to get task information as a string
    @Override
    public String toString() {
        return "Task: " + description + " - Status: " + (isCompleted ? "Completed" : "Not Completed");
    }
}
```

#### **2. Define the `TaskManager` Class**

```java
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    // Constructor
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    // Method to remove a task
    public void removeTask(Task task) {
        tasks.remove(task);
        System.out.println("Task removed: " + task);
    }

    // Method to display all tasks
    public void displayTasks() {
        System.out.println("To-Do List:");
        for (Task task : tasks) {
            task.displayTask();
            System.out.println();
        }
    }
}
```

#### **3. Create a Main Class to Test `Task` and `TaskManager`**

```java
public class Main {
    public static void main(String[] args) {
        // Create TaskManager object
        TaskManager manager = new TaskManager();

        // Create Task objects
        Task task1 = new Task("Buy groceries");
        Task task2 = new Task("Read a book");

        // Add tasks to the manager
        manager.addTask(task1);
        manager.addTask(task2);

        // Display all tasks
        manager.displayTasks();

        // Mark a task as completed and display tasks again
        task1.markAsCompleted();
        manager.displayTasks();

        // Remove a task and display tasks again
        manager.removeTask(task2);
        manager.displayTasks();
    }
}
```

### Summary

- **Student Management System**: Demonstrates working with attributes, methods, constructors, and collections. It also involves calculations (average) and display logic.
- **To-Do List Application**: Shows how to manage a list of tasks with operations such as adding, removing, and updating tasks. It also highlights managing task states (completed or not).

These projects will help reinforce your understanding of how to design classes and manage objects in Java, including operations on collections and object states.

---
### Low-Level Design for the Projects

Low-level design focuses on the detailed structure of the system and involves defining classes, their methods, and interactions at a more granular level. Here’s a detailed low-level design for each of the four projects:

---

### **1. Bank Account Management System**

#### **Classes and Their Responsibilities**

1. **BankAccount**
    - **Attributes**:
        - `String accountNumber`
        - `String accountHolderName`
        - `double balance`
    - **Methods**:
        - `void deposit(double amount)`: Adds money to the account.
        - `void withdraw(double amount)`: Withdraws money from the account.
        - `void checkBalance()`: Displays the current balance.
        - `String toString()`: Provides a string representation of the account.

2. **Main**
    - **Responsibilities**:
        - Create instances of `BankAccount`.
        - Demonstrate the use of methods like `deposit`, `withdraw`, and `checkBalance`.

---

### **2. Library System**

#### **Classes and Their Responsibilities**

1. **Book**
    - **Attributes**:
        - `String title`
        - `String author`
        - `String isbn`
    - **Methods**:
        - `void displayInfo()`: Displays details about the book.
        - `String toString()`: Provides a string representation of the book.

2. **Library**
    - **Attributes**:
        - `ArrayList<Book> books`
    - **Methods**:
        - `void addBook(Book book)`: Adds a book to the library.
        - `void displayBooks()`: Displays information about all books in the library.

3. **Main**
    - **Responsibilities**:
        - Create instances of `Book` and `Library`.
        - Demonstrate adding books and displaying the list of books.

---

### **3. Student Management System**

#### **Classes and Their Responsibilities**

1. **Student**
    - **Attributes**:
        - `String name`
        - `int age`
        - `double[] grades`
    - **Methods**:
        - `double calculateAverage()`: Calculates and returns the average of grades.
        - `void displayInfo()`: Displays student information and average grade.
        - `String toString()`: Provides a string representation of the student.

2. **StudentManager**
    - **Attributes**:
        - `ArrayList<Student> students`
    - **Methods**:
        - `void addStudent(Student student)`: Adds a student to the list.
        - `void displayStudents()`: Displays information about all students.

3. **Main**
    - **Responsibilities**:
        - Create instances of `Student` and `StudentManager`.
        - Demonstrate adding students and displaying their details.

---

### **4. To-Do List Application**

#### **Classes and Their Responsibilities**

1. **Task**
    - **Attributes**:
        - `String description`
        - `boolean isCompleted`
    - **Methods**:
        - `void markAsCompleted()`: Marks the task as completed.
        - `void displayTask()`: Displays task description and status.
        - `String toString()`: Provides a string representation of the task.

2. **TaskManager**
    - **Attributes**:
        - `ArrayList<Task> tasks`
    - **Methods**:
        - `void addTask(Task task)`: Adds a task to the list.
        - `void removeTask(Task task)`: Removes a task from the list.
        - `void displayTasks()`: Displays information about all tasks.

3. **Main**
    - **Responsibilities**:
        - Create instances of `Task` and `TaskManager`.
        - Demonstrate adding, removing, and updating tasks.

---

### Summary of Low-Level Design

1. **Bank Account Management System**
    - **Key Classes**: `BankAccount`, `Main`
    - **Main Interactions**: Creating accounts, depositing/withdrawing money, checking balance.

2. **Library System**
    - **Key Classes**: `Book`, `Library`, `Main`
    - **Main Interactions**: Adding books, displaying book details.

3. **Student Management System**
    - **Key Classes**: `Student`, `StudentManager`, `Main`
    - **Main Interactions**: Adding students, calculating average grades, displaying student details.

4. **To-Do List Application**
    - **Key Classes**: `Task`, `TaskManager`, `Main`
    - **Main Interactions**: Adding, removing, updating tasks, displaying task list.

These designs cover the detailed class structures and interactions needed to build each project, ensuring a clear understanding of how classes and objects will interact in each system.

---
### High-Level Design for the Projects

High-level design focuses on the overall architecture and structure of the system, including the relationships between major components, modules, or subsystems. Here’s the high-level design for each of the four projects:

---

### **1. Bank Account Management System**

#### **High-Level Components**

1. **User Interface (UI)**
    - **Responsibility**: Allows users to interact with the system.
    - **Components**: Command-line interface or graphical user interface (GUI) with options to deposit, withdraw, check balance, and view account details.

2. **BankAccount Class**
    - **Responsibility**: Manages individual bank accounts, including attributes like account number, holder name, and balance.
    - **Operations**:
        - Deposit funds.
        - Withdraw funds.
        - Check current balance.
        - Display account details.

3. **Main Application**
    - **Responsibility**: Coordinates interactions between the UI and `BankAccount` class.
    - **Operations**:
        - Create `BankAccount` instances.
        - Handle user inputs and invoke appropriate methods on `BankAccount`.

#### **Interaction Diagram**
```
User Interface --> Main Application --> BankAccount
```

---

### **2. Library System**

#### **High-Level Components**

1. **User Interface (UI)**
    - **Responsibility**: Provides a means for users to add books, view book details, and manage the library.
    - **Components**: Command-line interface or GUI for book management.

2. **Book Class**
    - **Responsibility**: Represents individual books with attributes like title, author, and ISBN.
    - **Operations**:
        - Display book information.

3. **Library Class**
    - **Responsibility**: Manages a collection of `Book` objects.
    - **Operations**:
        - Add a book to the library.
        - Display all books.

4. **Main Application**
    - **Responsibility**: Manages interactions between the UI, `Book`, and `Library` classes.
    - **Operations**:
        - Create and manage `Book` and `Library` instances.
        - Handle user inputs and perform operations on `Library`.

#### **Interaction Diagram**
```
User Interface --> Main Application --> Library --> Book
```

---

### **3. Student Management System**

#### **High-Level Components**

1. **User Interface (UI)**
    - **Responsibility**: Allows users to add students, view student details, and calculate averages.
    - **Components**: Command-line interface or GUI for student management.

2. **Student Class**
    - **Responsibility**: Manages individual student information including grades.
    - **Operations**:
        - Calculate average grades.
        - Display student details.

3. **StudentManager Class**
    - **Responsibility**: Manages a collection of `Student` objects.
    - **Operations**:
        - Add a student to the list.
        - Display details of all students.

4. **Main Application**
    - **Responsibility**: Coordinates interactions between the UI, `Student`, and `StudentManager` classes.
    - **Operations**:
        - Create and manage `Student` and `StudentManager` instances.
        - Handle user inputs and perform operations on `StudentManager`.

#### **Interaction Diagram**
```
User Interface --> Main Application --> StudentManager --> Student
```

---

### **4. To-Do List Application**

#### **High-Level Components**

1. **User Interface (UI)**
    - **Responsibility**: Allows users to add, remove, and update tasks in the to-do list.
    - **Components**: Command-line interface or GUI for task management.

2. **Task Class**
    - **Responsibility**: Represents individual tasks with description and completion status.
    - **Operations**:
        - Mark task as completed.
        - Display task details.

3. **TaskManager Class**
    - **Responsibility**: Manages a collection of `Task` objects.
    - **Operations**:
        - Add a task.
        - Remove a task.
        - Display all tasks.

4. **Main Application**
    - **Responsibility**: Handles interactions between the UI, `Task`, and `TaskManager` classes.
    - **Operations**:
        - Create and manage `Task` and `TaskManager` instances.
        - Handle user inputs and perform operations on `TaskManager`.

#### **Interaction Diagram**
```
User Interface --> Main Application --> TaskManager --> Task
```

---

### Summary

- **Bank Account Management System**: High-level design includes a UI for user interaction, `BankAccount` class for account management, and `Main Application` to coordinate operations.
- **Library System**: Consists of a UI, `Book` class for book details, `Library` class for managing books, and a `Main Application` to manage interactions.
- **Student Management System**: Includes a UI for managing students, `Student` class for individual details, `StudentManager` for managing the list, and `Main Application` for coordination.
- **To-Do List Application**: Features a UI, `Task` class for individual tasks, `TaskManager` for managing tasks, and `Main Application` for handling user interactions.

These high-level designs provide a clear structure of the system components and their interactions, guiding the development process and ensuring cohesive functionality.