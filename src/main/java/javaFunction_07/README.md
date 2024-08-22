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

## Recursion and Backtracking

Recursion is a fundamental programming concept where a method or function calls itself to solve a smaller instance of the same problem. This approach can simplify complex problems by breaking them down into more manageable subproblems.

### Key Concepts of Recursion

1. **Base Case**: The condition under which the recursion terminates. It prevents the recursive function from calling itself indefinitely.

2. **Recursive Case**: The part of the function where it calls itself with a modified argument that moves towards the base case.

### Example: Factorial Calculation

The factorial of a number \( n \) (denoted as \( n! \)) is the product of all positive integers up to \( n \). For example, \( 5! = 5 \times 4 \times 3 \times 2 \times 1 = 120 \).

Using recursion, the factorial can be defined as:
- Base Case: \( 0! = 1 \)
- Recursive Case: \( n! = n \times (n-1)! \)

Here’s how it would look in Java:

```java
public class Factorial {
    public static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
```

### How Recursion Works (Step-by-Step)
For \( n = 5 \):
1. `factorial(5)` calls `factorial(4)`
2. `factorial(4)` calls `factorial(3)`
3. `factorial(3)` calls `factorial(2)`
4. `factorial(2)` calls `factorial(1)`
5. `factorial(1)` calls `factorial(0)`
6. `factorial(0)` returns `1` (Base Case)
7. Now, `factorial(1)` returns `1 * 1 = 1`
8. `factorial(2)` returns `2 * 1 = 2`
9. `factorial(3)` returns `3 * 2 = 6`
10. `factorial(4)` returns `4 * 6 = 24`
11. `factorial(5)` returns `5 * 24 = 120`

### Common Problems Solved Using Recursion

1. **Fibonacci Sequence**: The nth Fibonacci number is the sum of the (n-1)th and (n-2)th Fibonacci numbers. Base cases: `F(0) = 0`, `F(1) = 1`.

2. **Sum of Natural Numbers**: The sum of the first n natural numbers can be computed recursively. Base case: `sum(0) = 0`.

3. **Towers of Hanoi**: A classic problem where the goal is to move a set of disks from one rod to another, with the help of an auxiliary rod, while following specific rules.

4. **Binary Search**: Recursively divides the array into halves to find a target value.

5. **Tree Traversals**: Recursive methods are used to traverse trees (e.g., pre-order, in-order, post-order traversals).

### Advantages of Recursion

- **Simplicity**: Some problems are naturally recursive, and using recursion can make the code simpler and more intuitive.
- **Elegant Solution**: For problems like tree traversals and certain mathematical computations, recursion provides a clean and elegant solution.

### Disadvantages of Recursion

- **Performance**: Recursion can be less efficient in terms of memory and speed compared to iterative solutions due to function call overhead and stack usage.
- **Stack Overflow**: Deep recursive calls can cause stack overflow errors if the recursion depth exceeds the limit.

### Optimizing Recursion

1. **Tail Recursion**: A special case of recursion where the recursive call is the last operation in the function. Some languages optimize tail recursion to avoid adding new stack frames.

2. **Memoization**: Storing the results of expensive function calls and returning the cached result when the same inputs occur again. This is useful in problems like Fibonacci to avoid redundant calculations.

### Example: Fibonacci with Memoization

```java
import java.util.HashMap;

public class FibonacciMemoization {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Check if the result is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Recursive call with memoization
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Fibonacci of " + number + " is: " + fibonacci(number));
    }
}
```

### Tips for Working with Recursion

1. **Always define the base case clearly**: Without a base case, recursion will lead to infinite calls and eventually crash the program.
2. **Test with small inputs**: Start with smaller test cases to ensure the recursion is working correctly.
3. **Consider iterative solutions**: In some cases, an iterative approach may be more efficient and easier to understand.

Recursion is a powerful tool in programming, and mastering it will help you solve complex problems in a clean and efficient way.

Here are 20 coding problems designed to help you understand and practice recursion:

### Basic Problems

1. **Factorial Calculation**:
    - Write a recursive function to calculate the factorial of a given number \( n \).
    - Example: `factorial(5)` should return `120`.

2. **Fibonacci Sequence**:
    - Implement a recursive function to find the nth Fibonacci number.
    - Example: `fibonacci(6)` should return `8`.

3. **Sum of Natural Numbers**:
    - Write a recursive function to calculate the sum of the first \( n \) natural numbers.
    - Example: `sum(5)` should return `15`.

4. **Reverse a String**:
    - Create a recursive function to reverse a string.
    - Example: `reverse("hello")` should return `"olleh"`.

5. **Count Digits in a Number**:
    - Write a recursive function to count the number of digits in a given number.
    - Example: `countDigits(12345)` should return `5`.

### Intermediate Problems

6. **Power Calculation**:
    - Implement a recursive function to calculate \( x \) raised to the power \( n \).
    - Example: `power(2, 3)` should return `8`.

7. **Greatest Common Divisor (GCD)**:
    - Write a recursive function to find the GCD of two numbers.
    - Example: `gcd(48, 18)` should return `6`.

8. **Palindrome Check**:
    - Create a recursive function to check if a given string is a palindrome.
    - Example: `isPalindrome("madam")` should return `true`.

9. **Binary Search**:
    - Implement binary search using recursion to find an element in a sorted array.
    - Example: `binarySearch([1, 2, 3, 4, 5], 3)` should return the index `2`.

10. **Sum of Digits**:
    - Write a recursive function to calculate the sum of the digits of a given number.
    - Example: `sumOfDigits(123)` should return `6`.

### Advanced Problems

11. **Tower of Hanoi**:
    - Implement the Tower of Hanoi problem for \( n \) disks.
    - Example: `towerOfHanoi(3, 'A', 'C', 'B')` should print the steps to move disks from rod A to rod C using rod B as an auxiliary.

12. **Generate All Subsets of a Set**:
    - Write a recursive function to generate all subsets of a given set.
    - Example: `subsets([1, 2, 3])` should return `[[], [1], [2], [3], [1,2], [1,3], [2,3], [1,2,3]]`.

13. **Permutations of a String**:
    - Create a recursive function to generate all permutations of a given string.
    - Example: `permutations("abc")` should return `["abc", "acb", "bac", "bca", "cab", "cba"]`.

14. **Nth Triangular Number**:
    - Write a recursive function to find the nth triangular number.
    - Example: `triangularNumber(5)` should return `15`.

15. **Print All Paths in a Matrix**:
    - Create a recursive function to print all paths from the top-left corner to the bottom-right corner of a \( m \times n \) matrix.
    - Example: For a 2x2 matrix, the paths could be "Down, Right" and "Right, Down".

### Challenging Problems

16. **Sudoku Solver**:
    - Implement a recursive backtracking solution to solve a given Sudoku puzzle.

17. **N-Queens Problem**:
    - Write a recursive function to place \( n \) queens on an \( n \times n \) chessboard such that no two queens threaten each other.

18. **String to Integer Conversion**:
    - Create a recursive function to convert a string of digits into its integer equivalent.
    - Example: `stringToInt("1234")` should return `1234`.

19. **Longest Common Subsequence (LCS)**:
    - Write a recursive function to find the longest common subsequence between two strings.
    - Example: `lcs("abcde", "ace")` should return `3`.

20. **Generate All Binary Strings of Length n**:
    - Implement a recursive function to generate all binary strings of length \( n \).
    - Example: `generateBinaryStrings(3)` should return `["000", "001", "010", "011", "100", "101", "110", "111"]`.

### Tips for Solving These Problems:
- **Understand the base case**: Clearly define the stopping condition for the recursion.
- **Break down the problem**: Think of how you can divide the problem into smaller subproblems.
- **Think about recursion depth**: Ensure that your recursive function doesn’t go too deep, causing a stack overflow.
- **Test with simple cases**: Start with small inputs to ensure correctness.

These problems will give you a deep understanding of recursion and help you recognize where and how to apply it effectively.