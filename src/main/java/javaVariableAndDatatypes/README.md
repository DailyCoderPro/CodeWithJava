### 1. **Variables in Java**

A variable is a container for storing data values. In Java, every variable must be declared with a data type.

- **Syntax**:
  ```java
  dataType variableName = value;
  ```
  Example:
  ```java
  int number = 10;
  String name = "John";
  ```

- **Types of Variables**:
    - **Local Variables**: Declared inside a method or block and accessible only within that method/block.
    - **Instance Variables**: Non-static fields declared outside any method but inside a class. These are object-specific.
    - **Static Variables**: Declared with the `static` keyword. They belong to the class rather than any instance of the class.

### 2. **Non-Primitive Types**

Non-primitive data types in Java are more complex than primitive types and include:

- **String**: Represents sequences of characters.
  ```java
  String greeting = "Hello, World!";
  ```
- **Arrays**: A collection of elements, all of the same type.
  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  ```
- **Classes and Objects**: Any user-defined class and objects created from these classes are non-primitive types.
  ```java
  class Car {
      String model;
      int year;
  }
  Car myCar = new Car();
  ```
- **Interfaces and Enums**: These are other examples of non-primitive types.

### 3. **Wrapper Classes**

Java provides wrapper classes for all eight primitive data types. Wrapper classes convert primitive types into objects. This is useful when an object reference is needed, such as when working with collection classes like `ArrayList`.

- **Examples**:
    - `int` -> `Integer`
    - `char` -> `Character`
    - `double` -> `Double`

  Example usage:
  ```java
  int num = 5;
  Integer numObj = Integer.valueOf(num);
  ```

### 4. **Autoboxing and Unboxing**

- **Autoboxing**: The automatic conversion of a primitive type to its corresponding wrapper class.
  ```java
  int num = 5;
  Integer numObj = num; // Autoboxing
  ```

- **Unboxing**: The automatic conversion of a wrapper class object to its corresponding primitive type.
  ```java
  Integer numObj = new Integer(10);
  int num = numObj; // Unboxing
  ```

### 5. **Typecasting**

Typecasting is the process of converting one data type into another. There are two types:

- **Implicit Casting (Widening)**: Automatically done when converting a smaller type to a larger type.
  ```java
  int a = 100;
  long b = a; // Implicit casting
  ```

- **Explicit Casting (Narrowing)**: Done manually when converting a larger type to a smaller type.
  ```java
  double x = 9.78;
  int y = (int) x; // Explicit casting
  ```

### 6. **Swap Two Variables**

You can swap two variables in Java using a temporary variable or by arithmetic operations.

- **Using a Temporary Variable**:
  ```java
  int a = 5, b = 10;
  int temp = a;
  a = b;
  b = temp;
  ```

- **Without Using a Temporary Variable**:
  ```java
  int a = 5, b = 10;
  a = a + b; // a = 15
  b = a - b; // b = 5
  a = a - b; // a = 10
  ```

### 7. **Type Conversion**

Type conversion refers to converting a variable from one data type to another. Java supports two types:

- **Automatic Type Conversion (Widening Conversion)**: Automatically converts a smaller type to a larger type.
  ```java
  int num = 10;
  double d = num; // Automatic conversion from int to double
  ```

- **Manual Type Conversion (Narrowing Conversion)**: Requires explicit casting because data might be lost.
  ```java
  double d = 9.78;
  int num = (int) d; // Manual conversion from double to int
  ```

- **String to Numeric Conversion**: Often used to convert input data from text fields.
  ```java
  String str = "123";
  int num = Integer.parseInt(str);
  ```

- **Numeric to String Conversion**: Converts numeric types to strings.
  ```java
  int num = 123;
  String str = Integer.toString(num);
  ```
  
---
## Coding Problem

### Variables and Data Types

1. **Declare and Print Variables**
    - **Problem**: Write a Java program to declare an `int`, a `float`, a `char`, and a `boolean` variable. Assign them the values `10`, `20.5`, `'A'`, and `true` respectively, and print each variable on a new line.

2. **Simple Calculator**
    - **Problem**: Create a Java program that declares two `int` variables `a` and `b` with values `15` and `4`. Calculate and print their sum, difference, product, and quotient.

3. **Calculate Simple Interest**
    - **Problem**: Write a program to calculate the simple interest. Declare variables `principal` (float), `rate` (float), and `time` (int). Assign them the values `10000`, `3.5`, and `5` respectively. Calculate and print the simple interest using the formula: `Simple Interest = (principal * rate * time) / 100`.

### Non-Primitive Types

4. **Array Sum**
    - **Problem**: Declare an array of integers with the values `{1, 2, 3, 4, 5}`. Write a program to calculate and print the sum of all the elements in the array.

5. **String Concatenation**
    - **Problem**: Create a program that declares two `String` variables `firstName` and `lastName` with the values `"John"` and `"Doe"`. Concatenate these strings to form a full name and print it.

6. **Find Maximum in Array**
    - **Problem**: Write a program to find the maximum value in an array of integers `{10, 20, 30, 40, 50}`. Print the maximum value.

### Wrapper Classes

7. **Primitive to Wrapper Conversion**
    - **Problem**: Write a Java program to convert an `int` primitive with a value of `100` to an `Integer` object using both `Integer.valueOf()` and autoboxing. Print the results of both conversions.

8. **Unbox Wrapper to Primitive**
    - **Problem**: Create an `Integer` object with the value `200`. Unbox it to a primitive `int` and print the result.

9. **Wrapper Class Methods**
    - **Problem**: Write a program that takes two `String` inputs representing integers, converts them to `Integer` objects using `Integer.parseInt()`, compares them using `Integer.compareTo()`, and prints the larger of the two.

### Autoboxing and Unboxing

10. **Autoboxing in ArrayList**
    - **Problem**: Create an `ArrayList` of `Integer`. Add the `int` values `10`, `20`, and `30` using autoboxing. Print all the elements of the list.

11. **Conditional Unboxing**
    - **Problem**: Write a program that creates an `Integer` object with the value `50`. Check if this value is greater than `25` using an `if` statement. If true, print "Greater than 25".

### Typecasting

12. **Widening Typecasting**
    - **Problem**: Write a Java program that declares an `int` variable `a` with a value of `100`. Perform a widening typecast to convert it to a `double` and print the result.

13. **Narrowing Typecasting**
    - **Problem**: Write a program that declares a `double` variable `d` with a value of `9.78`. Perform a narrowing typecast to convert it to an `int` and print the result.

14. **Char to Int Conversion**
    - **Problem**: Declare a `char` variable `ch` with the value `'A'`. Typecast it to an `int` to get its ASCII value and print the result.

### Swapping Variables

15. **Swap Two Numbers Using Temp Variable**
    - **Problem**: Write a Java program to swap two `int` variables `a` and `b` with values `5` and `10` using a temporary variable. Print the values before and after swapping.

16. **Swap Two Numbers Without Temp Variable**
    - **Problem**: Swap two `int` variables `a` and `b` with values `5` and `10` without using a temporary variable (use arithmetic operations). Print the values before and after swapping.

### Type Conversion

17. **String to Integer Conversion**
    - **Problem**: Write a Java program that takes a `String` input `"123"` and converts it to an `int` using `Integer.parseInt()`. Print the converted integer.

18. **String to Double Conversion**
    - **Problem**: Write a program that takes a `String` input `"45.67"` and converts it to a `double` using `Double.parseDouble()`. Print the converted double.

19. **Integer to String Conversion**
    - **Problem**: Declare an `int` variable `num` with the value `456`. Convert it to a `String` using `Integer.toString()` and print both the original `int` and the converted `String`.

20. **Sum of Command-Line Arguments**
    - **Problem**: Write a Java program that accepts two command-line arguments, converts them from `String` to `int` using `Integer.parseInt()`, adds them, and prints the sum.
