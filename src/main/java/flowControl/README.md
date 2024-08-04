### Flow Control in Java

Flow control in Java determines the order in which statements are executed in a program. The main flow control statements are:

- **Conditional Statements**: `if`, `else if`, `else`
- **Switch Statement**: Allows multi-way branching based on the value of a variable.
- **Loops**: (not covered here but important for flow control) like `for`, `while`, and `do-while`.

### 1. **`if`, `else if`, and `else` Statements**

These statements allow you to execute different blocks of code based on certain conditions.

#### **Syntax**:
```java
if (condition1) {
    // code block executes if condition1 is true
} else if (condition2) {
    // code block executes if condition1 is false and condition2 is true
} else {
    // code block executes if neither condition1 nor condition2 is true
}
```

#### **Example**: Determine if a number is positive, negative, or zero.

```java
public class Main {
    public static void main(String[] args) {
        int number = 5;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
```

### 2. **Switch Statement**

The `switch` statement allows you to execute one block of code among many options based on the value of a variable.

#### **Syntax**:
```java
switch (expression) {
    case value1:
        // code block executes if expression equals value1
        break;
    case value2:
        // code block executes if expression equals value2
        break;
    // more cases...
    default:
        // code block executes if no cases match
}
```

#### **Example**: Print the name of the day based on a number.

```java
public class Main {
    public static void main(String[] args) {
        int day = 3; // Example: 1 for Monday, 2 for Tuesday, etc.

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
```

### 3. **Even or Odd Number**

To determine if a number is even or odd, you use the modulus operator (`%`).

#### **Example**:

```java
public class Main {
    public static void main(String[] args) {
        int number = 7;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
```

### 4. **Largest of Three Numbers**

To find the largest of three numbers, use nested `if-else` statements.

#### **Example**:

```java
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    }
}
```

### 5. **Leap Year**

A year is a leap year if it is divisible by 4 but not divisible by 100, except if it is also divisible by 400.

#### **Example**:

```java
public class Main {
    public static void main(String[] args) {
        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
```

### 6. **Calculator Program**

Create a simple calculator that performs addition, subtraction, multiplication, and division based on user input.

#### **Example**:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Sum: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Difference: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Product: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Quotient: " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

        scanner.close();
    }
}
```
