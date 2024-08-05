### Functions in Java

In Java, a **function** (also called a method) is a block of code that performs a specific task and can be called whenever that task is needed. Functions help to make code more modular, reusable, and easier to understand.

#### **Syntax of a Function in Java**:

```java
returnType functionName(parameters) {
    // body of the function
    // return statement (if returnType is not void)
}
```

- **returnType**: The type of value that the function returns (e.g., `int`, `double`, `void` if it doesn't return anything).
- **functionName**: The name of the function, used to call it.
- **parameters**: A list of input values (also called arguments) that the function uses. It's enclosed in parentheses.

#### **Example**: Simple Function to Add Two Numbers

```java
public class Main {
    // Function to add two numbers
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int result = addNumbers(5, 10); // Calling the function
        System.out.println("Sum: " + result); // Output: Sum: 15
    }
}
```

### Application of Functions

Functions have several applications in Java:

1. **Code Reusability**: Functions allow you to write code once and reuse it as many times as needed without rewriting it.

2. **Modularity**: Functions make the code more organized by dividing complex problems into smaller, manageable tasks.

3. **Abstraction**: They provide a way to encapsulate the complexity of code. The user of the function does not need to know the details of its implementation.

4. **Maintenance**: Changes or updates to the code can be made in a single place, rather than in multiple places.

### Command-Line Arguments

Command-line arguments are a way to provide input to a Java program when you run it from the command line or terminal. These arguments are passed to the `main` method as an array of `String` objects.

#### **Syntax**:

```java
public static void main(String[] args) {
    // args is an array of strings
}
```

- `args`: An array of `String` values that contains the command-line arguments passed to the program.

#### **Example**: Using Command-Line Arguments

```java
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments passed.");
        }
    }
}
```

**Running the Program**:
```sh
java Main Hello World 123
```

**Output**:
```
Command-line arguments:
Hello
World
123
```

### **Important Points**:
- **args.length** gives the number of command-line arguments.
- Each command-line argument is accessed using `args[index]`.

### **Summary**

- **Functions** in Java help to modularize code, making it reusable and maintainable.
- **Command-Line Arguments** provide a way to pass information into a program at runtime from the terminal or command line.
- Understanding how to define, use, and pass data to functions is crucial for writing efficient and organized Java programs.

Functions and command-line arguments are fundamental concepts that form the basis of more advanced Java programming techniques.

## Problems

Here are 20 basic coding problems designed to help you understand and practice functions in Java:

### 1. **Sum of Two Numbers**

Write a function that takes two integers as arguments and returns their sum.

```java
public static int add(int a, int b) {
    // Your code here
}
```

### 2. **Difference of Two Numbers**

Write a function that takes two integers as arguments and returns their difference (first minus second).

```java
public static int subtract(int a, int b) {
    // Your code here
}
```

### 3. **Product of Two Numbers**

Write a function that takes two integers as arguments and returns their product.

```java
public static int multiply(int a, int b) {
    // Your code here
}
```

### 4. **Division of Two Numbers**

Write a function that takes two integers as arguments and returns the result of the division (first divided by second). Handle the case where the second number is zero.

```java
public static double divide(int a, int b) {
    // Your code here
}
```

### 5. **Factorial of a Number**

Write a function that takes an integer as an argument and returns its factorial.

```java
public static int factorial(int n) {
    // Your code here
}
```

### 6. **Check Even or Odd**

Write a function that takes an integer as an argument and returns `true` if the number is even and `false` if it is odd.

```java
public static boolean isEven(int n) {
    // Your code here
}
```

### 7. **Find Maximum of Three Numbers**

Write a function that takes three integers as arguments and returns the maximum of the three.

```java
public static int maxOfThree(int a, int b, int c) {
    // Your code here
}
```

### 8. **Calculate the Power of a Number**

Write a function that takes a base and an exponent as arguments and returns the result of raising the base to the power of the exponent.

```java
public static double power(double base, int exponent) {
    // Your code here
}
```

### 9. **Check if a Number is Prime**

Write a function that takes an integer as an argument and returns `true` if the number is prime and `false` otherwise.

```java
public static boolean isPrime(int n) {
    // Your code here
}
```

### 10. **Generate Fibonacci Sequence**

Write a function that takes an integer `n` and returns the `n`-th Fibonacci number.

```java
public static int fibonacci(int n) {
    // Your code here
}
```

### 11. **Reverse a String**

Write a function that takes a string as an argument and returns the string reversed.

```java
public static String reverseString(String str) {
    // Your code here
}
```

### 12. **Count Vowels in a String**

Write a function that takes a string as an argument and returns the number of vowels in the string.

```java
public static int countVowels(String str) {
    // Your code here
}
```

### 13. **Check Palindrome**

Write a function that takes a string as an argument and returns `true` if the string is a palindrome and `false` otherwise.

```java
public static boolean isPalindrome(String str) {
    // Your code here
}
```

### 14. **Find the Greatest Common Divisor (GCD)**

Write a function that takes two integers and returns their GCD.

```java
public static int gcd(int a, int b) {
    // Your code here
}
```

### 15. **Calculate Average of an Array**

Write a function that takes an array of integers and returns the average of the elements.

```java
public static double average(int[] numbers) {
    // Your code here
}
```

### 16. **Find the Largest Element in an Array**

Write a function that takes an array of integers and returns the largest element.

```java
public static int largestElement(int[] numbers) {
    // Your code here
}
```

### 17. **Print a Multiplication Table**

Write a function that takes an integer `n` and prints the multiplication table for `n`.

```java
public static void multiplicationTable(int n) {
    // Your code here
}
```

### 18. **Find Sum of Digits**

Write a function that takes an integer and returns the sum of its digits.

```java
public static int sumOfDigits(int number) {
    // Your code here
}
```

### 19. **Generate a Sequence of Prime Numbers**

Write a function that takes an integer `n` and returns an array containing the first `n` prime numbers.

```java
public static int[] generatePrimes(int n) {
    // Your code here
}
```

### 20. **Check if a Number is a Perfect Number**

Write a function that takes an integer as an argument and returns `true` if the number is a perfect number (a number equal to the sum of its proper divisors) and `false` otherwise.

```java
public static boolean isPerfectNumber(int number) {
    // Your code here
}
```

### **Tips for Solving These Problems**:

1. **Understand the Problem**: Make sure you understand what the function should accomplish before writing any code.
2. **Define Function Parameters**: Clearly identify what inputs the function will need and what it should return.
3. **Implement the Logic**: Write the code inside the function to achieve the desired result.
4. **Test the Function**: Call the function from `main` or another function and verify that it produces the expected output.

Practicing these problems will help you get comfortable with defining and using functions in Java.