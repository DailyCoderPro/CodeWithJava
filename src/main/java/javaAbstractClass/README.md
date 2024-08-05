## **Abstract Classes in Java**

An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed. It provides a partial implementation of its functionality and allows subclasses to complete or override specific aspects of its behavior. Abstract classes can contain both abstract methods (methods without a body) and concrete methods (methods with a body).

### **Key Concepts**

1. **Definition**: An abstract class is defined using the `abstract` keyword. It can have abstract methods (methods without implementation) and non-abstract methods (methods with implementation).

2. **Instantiation**: You cannot create an instance of an abstract class directly. It must be subclassed by a concrete class (a class with an implementation) that provides implementations for the abstract methods.

3. **Abstract Methods**: These are methods declared in the abstract class without a body. Subclasses must provide concrete implementations for these methods.

4. **Concrete Methods**: These are methods in an abstract class that have a complete implementation. Subclasses can use these methods as-is or override them.

5. **Constructors**: Abstract classes can have constructors, which can be called by the constructors of concrete subclasses.

6. **Fields**: Abstract classes can have fields (variables) just like any other class, including static and instance variables.

7. **Access Modifiers**: Abstract classes can have different access modifiers for their methods and fields (public, protected, private).

### **Use Cases of Abstract Classes**

1. **Providing a Common Base**: Abstract classes provide a common base for related classes, defining common methods and properties while allowing specific classes to implement or override behaviors.

2. **Code Reusability**: Abstract classes allow code reusability by providing default implementations for certain methods, which can be shared by all subclasses.

3. **Defining a Template**: Abstract classes can define a template for a group of related classes. Subclasses can follow this template while providing their own specific implementations.

4. **Implementing Partial Functionality**: Abstract classes can implement partial functionality, allowing subclasses to extend or complete the functionality as needed.

### **Example of Abstract Class**

Let's go through an example of how to use an abstract class in Java.

#### **1. Define the Abstract Class**

Create an abstract class `Vehicle` with both abstract and concrete methods.

```java
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();
    
    // Concrete method (has a body)
    void stop() {
        System.out.println("Vehicle stopped.");
    }
    
    // Constructor
    Vehicle() {
        System.out.println("Vehicle created.");
    }
}
```

#### **2. Subclass the Abstract Class**

Create concrete subclasses `Car` and `Bike` that extend `Vehicle` and provide implementations for the abstract methods.

**Car.java**

```java
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
    
    // Optionally override the stop method
    @Override
    void stop() {
        System.out.println("Car stopped.");
    }
}
```

**Bike.java**

```java
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started.");
    }
    
    // Use the default implementation of stop
}
```

#### **3. Use the Concrete Subclasses**

Create instances of `Car` and `Bike` and use their methods.

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        
        car.start(); // Calls Car's implementation of start
        car.stop();  // Calls Vehicle's implementation of stop
        
        bike.start(); // Calls Bike's implementation of start
        bike.stop();  // Calls Vehicle's implementation of stop
    }
}
```

### **Detailed Breakdown**

1. **Abstract Class Definition**: The `Vehicle` class is abstract and cannot be instantiated. It defines an abstract method `start` which must be implemented by subclasses. It also provides a concrete method `stop` with a default implementation.

2. **Subclass Implementation**: Both `Car` and `Bike` extend the `Vehicle` class. They provide specific implementations for the `start` method, demonstrating how different vehicle types might start differently. `Bike` uses the default implementation of `stop`, while `Car` overrides it.

3. **Constructor**: The `Vehicle` constructor is called when instances of `Car` or `Bike` are created, demonstrating that abstract classes can have constructors to initialize common aspects.

### **When to Use Abstract Classes**

- **When you have a common base**: Use an abstract class when you want to define a common base class for a group of related classes that share common functionality.
- **When you want to provide default behavior**: Abstract classes are useful when you want to provide a common implementation for some methods and force subclasses to implement other methods.
- **When you want to prevent instantiation**: Use an abstract class to prevent direct instantiation and ensure that only subclasses can be instantiated.

### **Summary**

Abstract classes in Java provide a powerful way to define common behavior for a group of related classes while allowing subclasses to implement or extend that behavior. They help in designing flexible and maintainable systems by enforcing a common structure and promoting code reuse.

---

## Mini Project 

Here are four mini projects that use abstract classes to help you understand their concepts and applications in different scenarios:

### **1. Shape Area Calculator**

**Objective**: Create a system to calculate the area of different shapes using an abstract class.

#### **Project Outline**

1. **Define the Abstract Class**
   ```java
   abstract class Shape {
       abstract double calculateArea();
       abstract void display();
   }
   ```

2. **Implement Concrete Shapes**
    - **Circle.java**
      ```java
      class Circle extends Shape {
          private double radius;
 
          public Circle(double radius) {
              this.radius = radius;
          }
 
          @Override
          double calculateArea() {
              return Math.PI * radius * radius;
          }
 
          @Override
          void display() {
              System.out.println("Circle with radius: " + radius);
          }
      }
      ```

    - **Rectangle.java**
      ```java
      class Rectangle extends Shape {
          private double width;
          private double height;
 
          public Rectangle(double width, double height) {
              this.width = width;
              this.height = height;
          }
 
          @Override
          double calculateArea() {
              return width * height;
          }
 
          @Override
          void display() {
              System.out.println("Rectangle with width: " + width + " and height: " + height);
          }
      }
      ```

3. **Use the Shapes**
   ```java
   public class Main {
       public static void main(String[] args) {
           Shape circle = new Circle(5);
           Shape rectangle = new Rectangle(4, 6);

           circle.display();
           System.out.println("Area: " + circle.calculateArea());

           rectangle.display();
           System.out.println("Area: " + rectangle.calculateArea());
       }
   }
   ```

### **2. Employee Payroll System**

**Objective**: Develop a system to calculate the payroll for different types of employees.

#### **Project Outline**

1. **Define the Abstract Class**
   ```java
   abstract class Employee {
       String name;
       double baseSalary;

       Employee(String name, double baseSalary) {
           this.name = name;
           this.baseSalary = baseSalary;
       }

       abstract double calculateSalary();
       void displayInfo() {
           System.out.println("Name: " + name);
           System.out.println("Base Salary: $" + baseSalary);
           System.out.println("Total Salary: $" + calculateSalary());
       }
   }
   ```

2. **Implement Concrete Employee Types**
    - **FullTimeEmployee.java**
      ```java
      class FullTimeEmployee extends Employee {
          private double bonus;
 
          FullTimeEmployee(String name, double baseSalary, double bonus) {
              super(name, baseSalary);
              this.bonus = bonus;
          }
 
          @Override
          double calculateSalary() {
              return baseSalary + bonus;
          }
      }
      ```

    - **PartTimeEmployee.java**
      ```java
      class PartTimeEmployee extends Employee {
          private double hourlyRate;
          private int hoursWorked;
 
          PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
              super(name, hourlyRate * hoursWorked);
              this.hourlyRate = hourlyRate;
              this.hoursWorked = hoursWorked;
          }
 
          @Override
          double calculateSalary() {
              return hourlyRate * hoursWorked;
          }
      }
      ```

3. **Use the Employees**
   ```java
   public class Main {
       public static void main(String[] args) {
           Employee fullTimeEmp = new FullTimeEmployee("Alice", 5000, 1000);
           Employee partTimeEmp = new PartTimeEmployee("Bob", 20, 80);

           fullTimeEmp.displayInfo();
           partTimeEmp.displayInfo();
       }
   }
   ```

### **3. Vehicle Management System**

**Objective**: Create a system to manage different types of vehicles and their fuel efficiency.

#### **Project Outline**

1. **Define the Abstract Class**
   ```java
   abstract class Vehicle {
       abstract double calculateFuelEfficiency();
       abstract void displayDetails();
   }
   ```

2. **Implement Concrete Vehicle Types**
    - **Car.java**
      ```java
      class Car extends Vehicle {
          private double distance;
          private double fuelConsumed;
 
          Car(double distance, double fuelConsumed) {
              this.distance = distance;
              this.fuelConsumed = fuelConsumed;
          }
 
          @Override
          double calculateFuelEfficiency() {
              return distance / fuelConsumed;
          }
 
          @Override
          void displayDetails() {
              System.out.println("Car");
              System.out.println("Distance: " + distance + " km");
              System.out.println("Fuel Consumed: " + fuelConsumed + " liters");
          }
      }
      ```

    - **Bike.java**
      ```java
      class Bike extends Vehicle {
          private double distance;
          private double fuelConsumed;
 
          Bike(double distance, double fuelConsumed) {
              this.distance = distance;
              this.fuelConsumed = fuelConsumed;
          }
 
          @Override
          double calculateFuelEfficiency() {
              return distance / fuelConsumed;
          }
 
          @Override
          void displayDetails() {
              System.out.println("Bike");
              System.out.println("Distance: " + distance + " km");
              System.out.println("Fuel Consumed: " + fuelConsumed + " liters");
          }
      }
      ```

3. **Use the Vehicles**
   ```java
   public class Main {
       public static void main(String[] args) {
           Vehicle car = new Car(500, 25);
           Vehicle bike = new Bike(300, 10);

           car.displayDetails();
           System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");

           bike.displayDetails();
           System.out.println("Fuel Efficiency: " + bike.calculateFuelEfficiency() + " km/l");
       }
   }
   ```

### **4. Document Management System**

**Objective**: Create a system to manage different types of documents (Reports, Invoices, Letters) and provide functionalities like printing and saving.

#### **Project Outline**

1. **Define the Abstract Class**
   ```java
   abstract class Document {
       abstract void print();
       abstract void save();
   }
   ```

2. **Implement Concrete Document Types**
    - **Report.java**
      ```java
      class Report extends Document {
          private String content;
 
          Report(String content) {
              this.content = content;
          }
 
          @Override
          void print() {
              System.out.println("Printing Report:");
              System.out.println(content);
          }
 
          @Override
          void save() {
              System.out.println("Saving Report.");
          }
      }
      ```

    - **Invoice.java**
      ```java
      class Invoice extends Document {
          private String details;
 
          Invoice(String details) {
              this.details = details;
          }
 
          @Override
          void print() {
              System.out.println("Printing Invoice:");
              System.out.println(details);
          }
 
          @Override
          void save() {
              System.out.println("Saving Invoice.");
          }
      }
      ```

3. **Use the Documents**
   ```java
   public class Main {
       public static void main(String[] args) {
           Document report = new Report("Annual Financial Report 2024");
           Document invoice = new Invoice("Invoice #12345 - $500");

           report.print();
           report.save();

           invoice.print();
           invoice.save();
       }
   }
   ```

### **Summary**

These projects illustrate how to use abstract classes to define a common contract for various concrete implementations:

1. **Shape Area Calculator**: Defines an abstract `Shape` class for calculating the area of different shapes.
2. **Employee Payroll System**: Defines an abstract `Employee` class to handle salary calculations for different employee types.
3. **Vehicle Management System**: Defines an abstract `Vehicle` class to calculate and display fuel efficiency for different vehicles.
4. **Document Management System**: Defines an abstract `Document` class to handle printing and saving different types of documents.

By working on these projects, you will gain a solid understanding of abstract classes, their use cases, and how they can be applied to solve real-world problems.

## Project 

### **Project: Smart Home System**

**Objective**: Develop a Smart Home System to manage various smart devices (Lights, Thermostats, and Security Cameras) in a house. Each device will be represented by a class that extends an abstract class `SmartDevice`, which provides a common interface for managing these devices.

### **Project Outline**

#### **1. Define the Abstract Class**

Create an abstract class `SmartDevice` with common methods that all smart devices should implement.

```java
abstract class SmartDevice {
    protected String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    // Abstract methods
    abstract void turnOn();
    abstract void turnOff();
    abstract void displayStatus();

    // Concrete method
    void displayDeviceName() {
        System.out.println("Device Name: " + deviceName);
    }
}
```

#### **2. Implement Concrete Device Types**

Create classes for different types of smart devices, each implementing the abstract methods.

**Light.java**

```java
class Light extends SmartDevice {
    private boolean isOn;

    Light(String deviceName) {
        super(deviceName);
        this.isOn = false;
    }

    @Override
    void turnOn() {
        isOn = true;
        System.out.println(deviceName + " light is now ON.");
    }

    @Override
    void turnOff() {
        isOn = false;
        System.out.println(deviceName + " light is now OFF.");
    }

    @Override
    void displayStatus() {
        System.out.println(deviceName + " light is " + (isOn ? "ON" : "OFF"));
    }
}
```

**Thermostat.java**

```java
class Thermostat extends SmartDevice {
    private int temperature;

    Thermostat(String deviceName) {
        super(deviceName);
        this.temperature = 22; // Default temperature
    }

    @Override
    void turnOn() {
        System.out.println(deviceName + " thermostat is now ON.");
    }

    @Override
    void turnOff() {
        System.out.println(deviceName + " thermostat is now OFF.");
    }

    @Override
    void displayStatus() {
        System.out.println(deviceName + " thermostat is set to " + temperature + "°C");
    }

    // Method to set temperature
    void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + "°C");
    }
}
```

**SecurityCamera.java**

```java
class SecurityCamera extends SmartDevice {
    private boolean isRecording;

    SecurityCamera(String deviceName) {
        super(deviceName);
        this.isRecording = false;
    }

    @Override
    void turnOn() {
        isRecording = true;
        System.out.println(deviceName + " security camera is now recording.");
    }

    @Override
    void turnOff() {
        isRecording = false;
        System.out.println(deviceName + " security camera is no longer recording.");
    }

    @Override
    void displayStatus() {
        System.out.println(deviceName + " security camera is " + (isRecording ? "recording" : "not recording"));
    }
}
```

#### **3. Implement the Smart Home Controller**

Create a class to manage the smart devices, including turning them on/off and displaying their status.

**SmartHomeController.java**

```java
import java.util.ArrayList;
import java.util.List;

class SmartHomeController {
    private List<SmartDevice> devices;

    SmartHomeController() {
        devices = new ArrayList<>();
    }

    void addDevice(SmartDevice device) {
        devices.add(device);
    }

    void turnOnAllDevices() {
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    void turnOffAllDevices() {
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    void displayAllDeviceStatuses() {
        for (SmartDevice device : devices) {
            device.displayDeviceName();
            device.displayStatus();
            System.out.println();
        }
    }
}
```

#### **4. Create the Main Class**

Use the main class to test the functionality of the Smart Home System.

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();

        Light livingRoomLight = new Light("Living Room");
        Thermostat homeThermostat = new Thermostat("Home");
        SecurityCamera frontDoorCamera = new SecurityCamera("Front Door");

        controller.addDevice(livingRoomLight);
        controller.addDevice(homeThermostat);
        controller.addDevice(frontDoorCamera);

        System.out.println("Turning on all devices:");
        controller.turnOnAllDevices();

        System.out.println("\nDisplaying all device statuses:");
        controller.displayAllDeviceStatuses();

        System.out.println("Setting thermostat temperature:");
        homeThermostat.setTemperature(25);

        System.out.println("\nTurning off all devices:");
        controller.turnOffAllDevices();
    }
}
```

### **Detailed Breakdown**

1. **Abstract Class Definition**: The `SmartDevice` abstract class defines the common behavior for all smart devices, including abstract methods (`turnOn`, `turnOff`, `displayStatus`) and a concrete method (`displayDeviceName`).

2. **Concrete Implementations**: Each smart device (Light, Thermostat, SecurityCamera) extends the `SmartDevice` class and provides specific implementations for the abstract methods. This demonstrates how different devices can have their own unique behaviors while adhering to a common interface.

3. **Smart Home Controller**: The `SmartHomeController` class manages a collection of smart devices, allowing you to turn all devices on or off and display their statuses. This shows how you can interact with a collection of objects through a common interface.

4. **Main Class**: The `Main` class demonstrates how to create and manage various smart devices, turn them on/off, set specific properties, and display their statuses.

### **Summary**

This project demonstrates the use of abstract classes to define common behavior for different types of smart devices in a smart home system. By implementing concrete classes for each device type and using a controller to manage these devices, you can see how abstract classes can help in designing flexible and extensible systems. This project also shows how to leverage polymorphism and abstraction to handle various types of objects through a common interface.

---

### **Project: Library Management System**

**Objective**: Develop a Library Management System to manage different types of library items (Books, Magazines, and DVDs). Each item will be represented by a class that extends an abstract class `LibraryItem`, which provides common functionalities for managing these items.

### **Project Outline**

#### **1. Define the Abstract Class**

Create an abstract class `LibraryItem` with methods that all library items should implement.

```java
abstract class LibraryItem {
    protected String title;
    protected String id;

    LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    // Abstract methods
    abstract void checkOut();
    abstract void returnItem();
    abstract void displayDetails();

    // Concrete method
    void displayTitle() {
        System.out.println("Title: " + title);
    }
}
```

#### **2. Implement Concrete Item Types**

Create classes for different types of library items, each implementing the abstract methods.

**Book.java**

```java
class Book extends LibraryItem {
    private String author;

    Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    void checkOut() {
        System.out.println("Book \"" + title + "\" is checked out.");
    }

    @Override
    void returnItem() {
        System.out.println("Book \"" + title + "\" is returned.");
    }

    @Override
    void displayDetails() {
        displayTitle();
        System.out.println("ID: " + id);
        System.out.println("Author: " + author);
    }
}
```

**Magazine.java**

```java
class Magazine extends LibraryItem {
    private String issue;

    Magazine(String title, String id, String issue) {
        super(title, id);
        this.issue = issue;
    }

    @Override
    void checkOut() {
        System.out.println("Magazine \"" + title + "\" (Issue: " + issue + ") is checked out.");
    }

    @Override
    void returnItem() {
        System.out.println("Magazine \"" + title + "\" (Issue: " + issue + ") is returned.");
    }

    @Override
    void displayDetails() {
        displayTitle();
        System.out.println("ID: " + id);
        System.out.println("Issue: " + issue);
    }
}
```

**DVD.java**

```java
class DVD extends LibraryItem {
    private int duration; // Duration in minutes

    DVD(String title, String id, int duration) {
        super(title, id);
        this.duration = duration;
    }

    @Override
    void checkOut() {
        System.out.println("DVD \"" + title + "\" is checked out.");
    }

    @Override
    void returnItem() {
        System.out.println("DVD \"" + title + "\" is returned.");
    }

    @Override
    void displayDetails() {
        displayTitle();
        System.out.println("ID: " + id);
        System.out.println("Duration: " + duration + " minutes");
    }
}
```

#### **3. Implement the Library Manager**

Create a class to manage the library items, including checking them out, returning them, and displaying their details.

**LibraryManager.java**

```java
import java.util.ArrayList;
import java.util.List;

class LibraryManager {
    private List<LibraryItem> items;

    LibraryManager() {
        items = new ArrayList<>();
    }

    void addItem(LibraryItem item) {
        items.add(item);
    }

    void checkOutItem(String id) {
        for (LibraryItem item : items) {
            if (item.id.equals(id)) {
                item.checkOut();
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    void returnItem(String id) {
        for (LibraryItem item : items) {
            if (item.id.equals(id)) {
                item.returnItem();
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println();
        }
    }
}
```

#### **4. Create the Main Class**

Use the main class to test the functionality of the Library Management System.

**Main.java**

```java
public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book book1 = new Book("To Kill a Mockingbird", "B001", "Harper Lee");
        Magazine magazine1 = new Magazine("National Geographic", "M001", "August 2024");
        DVD dvd1 = new DVD("Inception", "D001", 148);

        manager.addItem(book1);
        manager.addItem(magazine1);
        manager.addItem(dvd1);

        System.out.println("Displaying all items:");
        manager.displayAllItems();

        System.out.println("Checking out item with ID B001:");
        manager.checkOutItem("B001");

        System.out.println("Returning item with ID B001:");
        manager.returnItem("B001");

        System.out.println("Displaying all items:");
        manager.displayAllItems();
    }
}
```

### **Detailed Breakdown**

1. **Abstract Class Definition**: The `LibraryItem` abstract class defines common behavior for all library items, including abstract methods (`checkOut`, `returnItem`, `displayDetails`) and a concrete method (`displayTitle`).

2. **Concrete Implementations**: Each library item (Book, Magazine, DVD) extends the `LibraryItem` class and provides specific implementations for the abstract methods. This demonstrates how different items can have their own unique behaviors while adhering to a common interface.

3. **Library Manager**: The `LibraryManager` class manages a collection of library items, allowing you to check out, return, and display items. This shows how you can interact with a collection of objects through a common interface.

4. **Main Class**: The `Main` class demonstrates how to create and manage various library items, check them out and return them, and display their details.

### **Summary**

This project illustrates the use of abstract classes to define a common interface for managing different types of library items in a library management system. By implementing concrete classes for each item type and using a manager to handle these items, you can see how abstract classes help in designing flexible and extensible systems. This project also highlights how to use polymorphism and abstraction to manage different types of objects through a common interface.