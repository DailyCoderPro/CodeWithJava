### **Output in Java**

To print output to the console in Java, you can use the `System.out.print()` and `System.out.println()` methods.

- **`System.out.print()`**: Prints the text on the console without adding a new line.
- **`System.out.println()`**: Prints the text on the console and moves the cursor to a new line.

#### **Examples:**

```java
public class Main {
    public static void main(String[] args) {
        // Using System.out.print
        System.out.print("Hello, ");
        System.out.print("World!");
        // Output: Hello, World!

        // Using System.out.println
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java.");
        // Output:
        // Hello, World!
        // Welcome to Java.
    }
}
```

### **Input in Java**

Java provides multiple ways to take input from the user. The most common method is using the `Scanner` class from the `java.util` package.

#### **Using the `Scanner` Class**

- **Import the Scanner Class**: Before you can use `Scanner`, you need to import it:
  ```java
  import java.util.Scanner;
  ```

- **Creating a Scanner Object**: To read input, create a `Scanner` object associated with `System.in`:
  ```java
  Scanner scanner = new Scanner(System.in);
  ```

- **Reading Different Types of Input**:
    - **String Input**: `scanner.nextLine()`
    - **Integer Input**: `scanner.nextInt()`
    - **Double Input**: `scanner.nextDouble()`
    - **Boolean Input**: `scanner.nextBoolean()`

#### **Example:**

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Read a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Read an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Read a double input
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Read a boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Output the collected data
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);
        
        // Close the scanner
        scanner.close();
    }
}
```

### **Advanced Input/Output**

- **BufferedReader and InputStreamReader**: Used for reading text from a character input stream, providing efficient reading of characters, arrays, and lines.
- **PrintWriter**: Used to print formatted representations of objects to a text-output stream.

#### **Example using `BufferedReader`**:

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Create BufferedReader object
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Reading input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Output the input
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### **Important Points**
- Always close your `Scanner` or other input streams when they are no longer needed to free up resources.
- Be aware of the differences between `next()`, `nextLine()`, and other `Scanner` methods, as they handle input differently.
