### Loops in Java

Loops in Java allow you to execute a block of code repeatedly based on a condition. Java provides several types of loops:

1. **While Loops**
2. **For Loops**
3. **ForEach Loops**
4. **Break Statement**
5. **Continue Statement**
6. **Nested Loops**

### 1. **While Loops in Java**

A `while` loop repeatedly executes a block of code as long as a specified condition is `true`.

#### **Syntax**:
```java
while (condition) {
    // code block to be executed
}
```

#### **Example**: Print numbers from 1 to 5 using a `while` loop.

```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

### 2. **For Loops in Java**

A `for` loop is used when you know in advance how many times you want to execute a statement or a block of statements.

#### **Syntax**:
```java
for (initialization; condition; update) {
    // code block to be executed
}
```

#### **Example**: Print numbers from 1 to 5 using a `for` loop.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

### 3. **ForEach Loop in Java**

The `for-each` loop, or enhanced `for` loop, is used to iterate over elements of arrays and collections.

#### **Syntax**:
```java
for (type element : array/collection) {
    // code block to be executed
}
```

#### **Example**: Print all elements of an array using a `for-each` loop.

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```

### 4. **Break Statement in Java**

The `break` statement is used to exit a loop prematurely when a certain condition is met.

#### **Example**: Use a `break` statement to stop a loop when a specific condition is met.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // exit the loop
            }
            System.out.println(i);
        }
    }
}
```

### 5. **Continue Statement in Java**

The `continue` statement skips the current iteration of a loop and proceeds to the next iteration.

#### **Example**: Use a `continue` statement to skip printing the number 4.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue; // skip this iteration
            }
            System.out.println(i);
        }
    }
}
```

### 6. **Nested Loops in Java**

Nested loops are loops inside other loops. They are often used for multi-dimensional data structures.

#### **Example**: Print a multiplication table using nested loops.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
```

### 7. **While Loops with Condition**

`While` loops are useful when the number of iterations is not known beforehand and is determined by a condition.

#### **Example**: Print even numbers less than 10 using a `while` loop.

```java
public class Main {
    public static void main(String[] args) {
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
    }
}
```

### Summary
- **While Loops**: Repeat code as long as a condition is true.
- **For Loops**: Used when the number of iterations is known.
- **ForEach Loops**: Simplified loop for iterating over arrays and collections.
- **Break Statement**: Exits a loop prematurely.
- **Continue Statement**: Skips the current iteration and moves to the next.
- **Nested Loops**: Loops inside other loops, useful for multi-dimensional data.

Understanding these constructs allows you to control the flow of your Java programs effectively, enabling complex logic and operations.

## Problems

### **Basic Looping Problems**

1. **Print Numbers from 1 to 10**
    - Write a program that prints numbers from 1 to 10 using a `for` loop.

2. **Sum of First N Natural Numbers**
    - Write a program to calculate the sum of the first `N` natural numbers using a `for` loop.

3. **Factorial of a Number**
    - Write a program to calculate the factorial of a given number using a `while` loop.

4. **Print Even Numbers from 1 to 20**
    - Write a program that prints all even numbers from 1 to 20 using a `for` loop.

5. **Sum of Digits of a Number**
    - Write a program to calculate the sum of digits of a given number using a `while` loop.

6. **Reverse a Number**
    - Write a program to reverse a given number using a `while` loop.

7. **Print Multiplication Table**
    - Write a program to print the multiplication table of a given number using a `for` loop.

8. **Print Numbers from 10 to 1**
    - Write a program that prints numbers from 10 to 1 using a `for` loop (countdown).

9. **Find Maximum in an Array**
    - Write a program to find the maximum value in an array using a `for-each` loop.

10. **Print First N Fibonacci Numbers**
    - Write a program to print the first `N` Fibonacci numbers using a `for` loop.

### **Intermediate Looping Problems**

11. **Check Prime Number**
    - Write a program to check if a given number is prime using a `for` loop.

12. **Count Digits in a Number**
    - Write a program to count the number of digits in a given number using a `while` loop.

13. **Print All Prime Numbers Less Than N**
    - Write a program to print all prime numbers less than `N` using nested `for` loops.

14. **Sum of All Elements in an Array**
    - Write a program to calculate the sum of all elements in an array using a `for-each` loop.

15. **Print Pattern of Stars**
    - Write a program to print a pattern of stars (like a pyramid) using nested `for` loops.

16. **Check Armstrong Number**
    - Write a program to check if a given number is an Armstrong number using a `while` loop.

17. **Find GCD of Two Numbers**
    - Write a program to find the Greatest Common Divisor (GCD) of two numbers using a `while` loop.

18. **Print All Odd Numbers from 1 to N**
    - Write a program to print all odd numbers from 1 to `N` using a `for` loop.

19. **Count Vowels in a String**
    - Write a program to count the number of vowels in a given string using a `for` loop.

20. **Calculate Power of a Number**
    - Write a program to calculate `x^y` (x raised to the power y) using a `for` loop.

### **Advanced Looping Problems**

21. **Break Statement Example**
    - Write a program that prints numbers from 1 to 10 but stops the loop if the number is 7 using a `break` statement.

22. **Continue Statement Example**
    - Write a program that prints numbers from 1 to 10 but skips the number 5 using a `continue` statement.

23. **Find the Second Largest Element in an Array**
    - Write a program to find the second largest element in an array using a `for` loop.

24. **Reverse an Array**
    - Write a program to reverse the elements of an array using a `for` loop.

25. **Print All Factors of a Number**
    - Write a program to print all factors of a given number using a `for` loop.

26. **Sum of All Even Indexed Elements in an Array**
    - Write a program to calculate the sum of all elements at even indexes in an array using a `for` loop.

27. **Check Palindrome String**
    - Write a program to check if a given string is a palindrome using a `for` loop.

28. **Print the Number of Occurrences of Each Element in an Array**
    - Write a program to print the number of occurrences of each element in an array using nested `for` loops.

29. **Calculate the Average of Array Elements**
    - Write a program to calculate the average of elements in an array using a `for` loop.

30. **Nested Loop for Multiplication Table**
    - Write a program to print a multiplication table from 1 to 5 using nested `for` loops.

## Pattern Problems
Star patterns are a common exercise when learning loops in programming. They help you understand how nested loops work and how to control output in different ways. Below, I'll walk you through a few common star pattern examples and explain the logic behind each.

### 1. **Simple Pyramid Pattern**

```
*
**
***
****
*****
```

#### **Logic**:
- **Outer Loop**: Controls the number of rows (in this case, 5 rows).
- **Inner Loop**: Controls the number of stars printed in each row.

#### **Code**:

```java
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) { // Outer loop for number of rows
            for (int j = 1; j <= i; j++) { // Inner loop for printing stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
```

### 2. **Inverted Pyramid Pattern**

```
*****
****
***
**
*
```

#### **Logic**:
- The outer loop starts with the maximum number of stars and decreases by one star each time.
- The inner loop prints the stars for each row.

#### **Code**:

```java
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) { // Outer loop for number of rows
            for (int j = 1; j <= i; j++) { // Inner loop for printing stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
```

### 3. **Right-Aligned Pyramid**

```
    *
   **
  ***
 ****
*****
```

#### **Logic**:
- The outer loop controls the number of rows.
- The first inner loop prints the leading spaces.
- The second inner loop prints the stars.

#### **Code**:

```java
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { // Print leading spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // Print stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
```

### 4. **Diamond Pattern**

```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

#### **Logic**:
- This pattern is a combination of an upper and a lower pyramid.
- The upper part increases the number of stars, and the lower part decreases it.
- Both sections require managing spaces and stars accordingly.

#### **Code**:

```java
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { // Print leading spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Print stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) { // Print leading spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Print stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
```

### **Explanation of Logic**:
- **Outer Loop**: Determines the number of rows for the pattern.
- **Inner Loops**:
    - One for printing spaces (`' '`), which aligns the stars correctly.
    - Another for printing the stars (`'*'`) in the required pattern.


## Problems

Here are 20 pattern problems that will help you practice loops and nested loops in Java:

### 1. **Right-Angled Triangle Pattern**

```
*
**
***
****
*****
```

### 2. **Inverted Right-Angled Triangle Pattern**

```
*****
****
***
**
*
```

### 3. **Square Pattern**

```
*****
*****
*****
*****
*****
```

### 4. **Right-Aligned Triangle Pattern**

```
    *
   **
  ***
 ****
*****
```

### 5. **Inverted Right-Aligned Triangle Pattern**

```
*****
 ****
  ***
   **
    *
```

### 6. **Pyramid Pattern**

```
    *
   ***
  *****
 *******
*********
```

### 7. **Inverted Pyramid Pattern**

```
*********
 *******
  *****
   ***
    *
```

### 8. **Diamond Pattern**

```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

### 9. **Hollow Square Pattern**

```
*****
*   *
*   *
*   *
*****
```

### 10. **Hollow Right-Angled Triangle Pattern**

```
*
**
* *
*  *
*****
```

### 11. **Number Pyramid Pattern**

```
    1
   222
  33333
 4444444
555555555
```

### 12. **Number Triangle Pattern**

```
1
22
333
4444
55555
```

### 13. **Floyd’s Triangle**

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

### 14. **Pascal’s Triangle**

```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

### 15. **Butterfly Pattern**

```
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

### 16. **Sandglass Pattern**

```
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
```

### 17. **Hourglass Pattern**

```
*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********
```

### 18. **Rhombus Pattern**

```
    *****
   *****
  *****
 *****
*****
```

### 19. **Zig-Zag Pattern**

```
    *       *    
  *   *   *   *  
*       *       *
```

### 20. **Hollow Diamond Pattern**

```
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
```

### **General Tips for Solving Pattern Problems**:
- **Identify the number of rows and columns**: Most patterns have a clear number of rows, and sometimes columns.
- **Understand the relationship between rows and columns**: This is key to determining what to print at each position.
- **Use nested loops**: An outer loop for rows and inner loops for columns or elements within a row.
- **Use conditional statements**: These can help with printing spaces, stars, or numbers based on the position.
- **Experiment**: Start with a simple version of the pattern and add complexity gradually.

These problems will give you a good mix of patterns to practice and help you build a solid understanding of loops and control flow in Java.