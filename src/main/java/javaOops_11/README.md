## OOPS IN JAVA

Object-Oriented Programming (OOP) in Java is a fundamental paradigm that organizes code around objects and classes. The core concepts of OOP are essential for structuring and managing complex programs effectively. Here's a detailed overview of OOP principles in Java:

### **1. Basic Concepts**

#### **Class and Object**

- **Class**: A blueprint for creating objects. It defines attributes (fields) and behaviors (methods) that the objects created from the class will have.
- **Object**: An instance of a class. It represents a specific realization of the class with actual values for its attributes.

**Example**:
```java
public class Car {
    // Attributes (fields)
    String color;
    String model;
    int year;

    // Method
    void displayInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

// Creating an object of the Car class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Create an object
        myCar.color = "Red";
        myCar.model = "Toyota Corolla";
        myCar.year = 2022;
        myCar.displayInfo(); // Call method
    }
}
```

#### **Encapsulation**

Encapsulation is the concept of wrapping data (attributes) and code (methods) together as a single unit and restricting access to some of the object's components. This is achieved using access modifiers.

- **Public**: The member is accessible from any other class.
- **Private**: The member is accessible only within its own class.
- **Protected**: The member is accessible within its own package and by subclasses.

**Example**:
```java
public class Person {
    private String name; // Private field
    private int age;     // Private field

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        }
    }
}
```

#### **Inheritance**

Inheritance allows a new class to inherit attributes and methods from an existing class. The new class is called a subclass, and the class it inherits from is called a superclass.

- **extends**: Keyword used to declare inheritance.

**Example**:
```java
// Superclass
public class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
public class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Using inheritance
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method
        myDog.bark(); // Subclass method
    }
}
```

#### **Polymorphism**

Polymorphism means "many shapes" and allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation.

- **Method Overloading**: Multiple methods with the same name but different parameters in the same class.
- **Method Overriding**: Redefining a method in a subclass that already exists in its superclass.

**Example**:
```java
// Method Overloading
public class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Method Overriding
public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Using polymorphism
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Upcasting

        myAnimal.makeSound(); // Calls Animal's method
        myDog.makeSound(); // Calls Dog's method (overridden)
    }
}
```

#### **Abstraction**

Abstraction is the concept of hiding the complex implementation details and showing only the essential features of an object. It can be achieved using abstract classes and interfaces.

- **Abstract Class**: A class that cannot be instantiated and may contain abstract methods (methods without a body).

**Example**:
```java
abstract class Shape {
    abstract void draw(); // Abstract method
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Using abstraction
public class Main {
    public static void main(String[] args) {
        Shape myShape = new Circle();
        myShape.draw(); // Calls Circle's method
    }
}
```

- **Interface**: A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors.

**Example**:
```java
interface Drawable {
    void draw(); // Abstract method
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Using interface
public class Main {
    public static void main(String[] args) {
        Drawable myDrawable = new Rectangle();
        myDrawable.draw(); // Calls Rectangle's method
    }
}
```

### Summary of OOP Concepts

1. **Class and Object**: Basic building blocks of OOP, where classes define the structure and objects are instances of these classes.
2. **Encapsulation**: Bundling of data and methods with restricted access using access modifiers.
3. **Inheritance**: Mechanism to create a new class based on an existing class, promoting code reusability.
4. **Polymorphism**: Ability to perform different actions using a common interface, achieved through method overloading and overriding.
5. **Abstraction**: Hiding implementation details and showing only the necessary features using abstract classes and interfaces.

These principles provide a robust framework for designing and developing Java applications, promoting code reuse, scalability, and maintainability.

---

## Encapsulation

Encapsulation is a fundamental concept in Object-Oriented Programming (OOP) that involves bundling data (attributes) and methods (functions) that operate on the data into a single unit called a class. It also restricts direct access to some of the object's components, which can help prevent unintended interference and misuse of the object's state.

### **Key Concepts of Encapsulation**

1. **Private Attributes**: Data (attributes) within a class should be marked as private. This prevents external code from directly accessing or modifying the data.

2. **Public Methods**: Provide public methods (getters and setters) to allow controlled access and modification of the private data. These methods act as an interface for interacting with the data.

3. **Access Modifiers**: Use access modifiers to control the visibility of class members.
    - **`private`**: Accessible only within the class.
    - **`public`**: Accessible from any other class.
    - **`protected`**: Accessible within its own package and by subclasses.
    - **`default` (no modifier)**: Accessible only within its own package.

### **Example of Encapsulation in Java**

#### **1. Define a Class with Private Attributes and Public Methods**

```java
public class Person {
    // Private attributes
    private String name;
    private int age;

    // Public constructor to initialize the attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Public method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

#### **2. Use the Encapsulated Class in Main Application**

```java
public class Main {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("Alice", 30);

        // Access and modify attributes using public methods
        System.out.println("Initial Info:");
        person.displayInfo();

        // Modify name and age using setters
        person.setName("Bob");
        person.setAge(35);

        // Display updated information
        System.out.println("\nUpdated Info:");
        person.displayInfo();

        // Attempt to set invalid age
        person.setAge(-5); // Should display validation message
    }
}
```

### **Benefits of Encapsulation**

1. **Control**: It provides control over the data by restricting direct access and allowing modification only through public methods.

2. **Flexibility**: You can change the internal implementation of a class without affecting other classes that use it, as long as the public interface remains the same.

3. **Maintainability**: Encapsulation helps in organizing code better and makes it easier to maintain and understand.

4. **Increased Security**: By hiding the internal state of an object and requiring all interactions to be performed through methods, encapsulation helps protect the integrity of the object's data.

### **Summary**

Encapsulation is a key principle in Java that enhances data hiding and provides a clear structure for class design. By using private fields and public methods (getters and setters), you can control how data is accessed and modified, improving the robustness and security of your application.

---

## Inheritance

Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows one class to inherit the attributes and methods of another class. It promotes code reusability and establishes a natural hierarchy between classes.

### **Key Concepts of Inheritance**

1. **Superclass (Parent Class)**: The class whose properties and methods are inherited. It is the base class from which other classes derive.

2. **Subclass (Child Class)**: The class that inherits from another class. It extends the functionality of the superclass and can also have additional attributes and methods.

3. **`extends` Keyword**: In Java, the `extends` keyword is used to create a subclass from a superclass.

4. **Method Overriding**: Subclasses can provide a specific implementation of a method that is already defined in its superclass. This is known as overriding.

5. **`super` Keyword**: Used to refer to the immediate parent class object and call its methods or constructor.

### **Types of Inheritance**

1. **Single Inheritance**: A class inherits from one superclass.
2. **Multilevel Inheritance**: A class inherits from another class, which in turn inherits from another class.
3. **Hierarchical Inheritance**: Multiple classes inherit from a single superclass.
4. **Multiple Inheritance** (Java does not support this directly but can be achieved using interfaces): A class inherits from more than one class. Java achieves this through interfaces.

### **Example of Inheritance in Java**

#### **1. Basic Single Inheritance**

```java
// Superclass
public class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
public class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Using inheritance
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Method from Animal class
        myDog.bark(); // Method from Dog class
    }
}
```

#### **2. Method Overriding**

```java
// Superclass
public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass
public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Using overriding
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Upcasting

        myAnimal.makeSound(); // Calls Animal's method
        myDog.makeSound(); // Calls Dog's overridden method
    }
}
```

#### **3. `super` Keyword**

```java
// Superclass
public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass
public class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound(); // Call the superclass method
        System.out.println("Dog barks.");
    }
}

// Using `super`
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls Dog's method
    }
}
```

#### **4. Constructor Inheritance**

```java
// Superclass
public class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

// Subclass
public class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }
}

// Using constructors
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Outputs both constructors
    }
}
```

### **Benefits of Inheritance**

1. **Code Reusability**: Common functionality can be defined in a superclass and inherited by subclasses, reducing code duplication.

2. **Extensibility**: New functionality can be added to existing classes by creating new subclasses.

3. **Hierarchy Representation**: Inheritance naturally represents a hierarchical relationship between classes, which can be useful for organizing and structuring code.

4. **Method Overriding**: Allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

### **Summary**

Inheritance in Java allows you to create a new class that is based on an existing class, inheriting its attributes and methods while also adding new features. It promotes code reuse, facilitates easier maintenance, and helps to model hierarchical relationships between classes.

---

## Polymorphism

Polymorphism is a core concept in Object-Oriented Programming (OOP) that allows objects of different classes to be treated as objects of a common superclass. It provides a way to perform a single action in different forms. Polymorphism helps to implement a method that can act differently based on the object that invokes it.

### **Types of Polymorphism in Java**

1. **Compile-Time Polymorphism (Method Overloading)**
2. **Runtime Polymorphism (Method Overriding)**

### **1. Compile-Time Polymorphism (Method Overloading)**

**Method Overloading** allows multiple methods with the same name but different parameters within the same class. The method signature (name and parameters) determines which method is called.

#### **Example of Method Overloading**

```java
public class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Calls the method with two integer parameters
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        
        // Calls the method with three integer parameters
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15));
        
        // Calls the method with two double parameters
        System.out.println("Sum of 5.5 and 10.5: " + calc.add(5.5, 10.5));
    }
}
```

### **2. Runtime Polymorphism (Method Overriding)**

**Method Overriding** occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass.

#### **Example of Method Overriding**

```java
// Superclass
public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass
public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Subclass
public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal;
        
        // Reference of Animal type but object of Dog
        myAnimal = new Dog();
        myAnimal.makeSound(); // Calls Dog's makeSound()

        // Reference of Animal type but object of Cat
        myAnimal = new Cat();
        myAnimal.makeSound(); // Calls Cat's makeSound()
    }
}
```

### **Key Points**

1. **Dynamic Method Dispatch**: Runtime polymorphism is achieved through dynamic method dispatch. The method call is resolved at runtime based on the actual object type that is being referenced.

2. **Virtual Method**: In Java, all non-static and non-final methods are virtual by default, which means they can be overridden in derived classes.

3. **Type Casting**: When using polymorphism, it is common to use type casting to refer to different subclasses, especially when invoking subclass-specific methods.

### **Benefits of Polymorphism**

1. **Flexibility**: Allows you to write more flexible and reusable code. The same method can work differently based on the object that calls it.

2. **Code Reusability**: Promotes reusability and maintains consistency in code, making it easier to add new functionalities.

3. **Maintainability**: Simplifies code maintenance by reducing the need for multiple method names and allowing a unified interface for different implementations.

### **Summary**

Polymorphism in Java allows objects of different classes to be treated as objects of a common superclass, providing a way to perform a single action in various forms. It enhances flexibility and code reusability through method overloading (compile-time polymorphism) and method overriding (runtime polymorphism). This concept helps to write more general and adaptable code.

---

## Abstraction

Abstraction in Java is a fundamental principle of Object-Oriented Programming (OOP) that focuses on hiding the complex implementation details and showing only the essential features of an object. It allows you to define the structure of a system while leaving out the specifics of how it works internally. This helps in reducing complexity and increasing efficiency.

### **Key Concepts of Abstraction**

1. **Abstract Class**: An abstract class is a class that cannot be instantiated on its own and can include both abstract methods (methods without a body) and concrete methods (methods with a body). Abstract classes provide a base for subclasses to extend and implement abstract methods.

2. **Abstract Method**: An abstract method is a method that is declared without an implementation. Subclasses of the abstract class must provide implementations for all abstract methods.

3. **Interface**: An interface is a reference type that can contain only method signatures, default methods, static methods, and constants. Interfaces allow you to define methods that must be implemented by any class that chooses to implement the interface. Java uses interfaces to achieve abstraction and multiple inheritance.

### **1. Abstract Class**

An abstract class allows you to define methods that must be implemented by derived classes while providing some methods with default implementations.

#### **Example of Abstract Class**

```java
// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    abstract void draw();

    // Regular method
    void display() {
        System.out.println("Displaying the shape.");
    }
}

// Subclass that extends abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Using the abstract class and subclass
public class Main {
    public static void main(String[] args) {
        // Shape shape = new Shape(); // This line would cause an error because Shape is abstract
        
        Circle circle = new Circle(); // Creating an instance of subclass
        circle.draw();   // Calls Circle's draw() method
        circle.display(); // Calls Shape's display() method
    }
}
```

### **2. Interface**

An interface provides a way to achieve abstraction by defining a contract for classes. A class that implements an interface must provide implementations for all the methods defined in the interface.

#### **Example of Interface**

```java
// Interface
interface Drawable {
    // Abstract method (does not have a body)
    void draw();
    
    // Default method (has a body)
    default void display() {
        System.out.println("Displaying the drawable object.");
    }
}

// Class implementing the interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

// Using the interface and implementing class
public class Main {
    public static void main(String[] args) {
        Drawable drawable = new Rectangle(); // Creating an instance of Rectangle
        drawable.draw();  // Calls Rectangle's draw() method
        drawable.display(); // Calls Drawable's default display() method
    }
}
```

### **Key Points**

1. **Purpose**: Abstraction helps in simplifying complex systems by focusing on high-level operations and hiding low-level implementation details. It provides a clear separation between what a system does and how it does it.

2. **Abstract Class vs. Interface**:
    - **Abstract Class**: Can contain both abstract and concrete methods, and can have state (fields).
    - **Interface**: Can only contain method signatures and static final variables. With Java 8 and later, interfaces can also contain default and static methods.

3. **When to Use**:
    - **Abstract Class**: Use when you have a base class with some default behavior that should be shared across multiple derived classes.
    - **Interface**: Use when you want to define a contract that can be implemented by classes across different class hierarchies, especially when multiple inheritance is needed.

### **Benefits of Abstraction**

1. **Reduces Complexity**: By hiding the implementation details and exposing only necessary functionalities, abstraction makes the system easier to understand and use.

2. **Promotes Code Reusability**: Allows the creation of a base implementation that can be extended or modified by subclasses, reducing code duplication.

3. **Enhances Maintainability**: Changes to the implementation can be made without affecting the code that relies on the abstract class or interface, making the system more adaptable to change.

### **Summary**

Abstraction in Java helps in designing a system by focusing on what an object does rather than how it does it. By using abstract classes and interfaces, you can hide complex details and provide a clear and simplified view of the system, improving code clarity, reusability, and maintainability.