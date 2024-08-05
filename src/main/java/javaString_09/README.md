### Strings in Java

A **String** in Java is a sequence of characters. Unlike other languages that treat strings as arrays of characters, Java uses the `String` class, which is part of the `java.lang` package. Strings are immutable, meaning that once a `String` object is created, it cannot be modified.

#### **Creating Strings**

You can create strings in several ways:

1. **Using String Literals**:
    - When you create a string using double quotes, Java automatically creates a `String` object.

   ```java
   String greeting = "Hello, World!";
   ```

2. **Using the `new` Keyword**:
    - You can also create strings using the `new` keyword, though this is less common.

   ```java
   String greeting = new String("Hello, World!");
   ```

#### **Basic String Methods**

The `String` class provides many methods for working with strings. Here are some commonly used ones:

1. **Length of a String**:
    - The `length()` method returns the number of characters in the string.

   ```java
   String str = "Hello";
   int length = str.length(); // 5
   ```

2. **Concatenation**:
    - The `+` operator or the `concat()` method can be used to concatenate strings.

   ```java
   String str1 = "Hello";
   String str2 = "World";
   String result = str1 + " " + str2; // "Hello World"
   // or
   result = str1.concat(" ").concat(str2); // "Hello World"
   ```

3. **Character at a Specific Index**:
    - The `charAt()` method returns the character at a specific index.

   ```java
   String str = "Hello";
   char ch = str.charAt(1); // 'e'
   ```

4. **Substring**:
    - The `substring()` method extracts a portion of the string, either from a start index to the end or between a start and an end index.

   ```java
   String str = "Hello, World!";
   String sub = str.substring(7); // "World!"
   String sub2 = str.substring(7, 12); // "World"
   ```

5. **String Comparison**:
    - Strings can be compared using `equals()`, `equalsIgnoreCase()`, and `compareTo()` methods.

   ```java
   String str1 = "Hello";
   String str2 = "hello";
   boolean isEqual = str1.equals(str2); // false
   boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true
   int comparison = str1.compareTo(str2); // positive value (since "H" > "h")
   ```

6. **Changing Case**:
    - The `toUpperCase()` and `toLowerCase()` methods convert strings to uppercase and lowercase respectively.

   ```java
   String str = "Hello";
   String upper = str.toUpperCase(); // "HELLO"
   String lower = str.toLowerCase(); // "hello"
   ```

7. **Trim**:
    - The `trim()` method removes leading and trailing whitespace from the string.

   ```java
   String str = "   Hello   ";
   String trimmed = str.trim(); // "Hello"
   ```

8. **Replacing Characters or Substrings**:
    - The `replace()` and `replaceAll()` methods replace characters or substrings with a new value.

   ```java
   String str = "Hello, World!";
   String replaced = str.replace("World", "Java"); // "Hello, Java!"
   ```

9. **Splitting a String**:
    - The `split()` method splits the string into an array based on a given delimiter.

   ```java
   String str = "Hello, World!";
   String[] words = str.split(", "); // ["Hello", "World!"]
   ```

10. **String Joining**:
    - The `String.join()` method can join multiple strings with a specified delimiter.

    ```java
    String[] words = {"Hello", "World"};
    String joined = String.join(", ", words); // "Hello, World"
    ```

### String Immutability

- **Immutability**: Once a string is created, it cannot be changed. If you try to modify a string, Java creates a new string with the modified content. This is why methods like `replace()` or `concat()` return a new string rather than modifying the original one.

- **Advantages**:
    - **Security**: Immutable objects are inherently thread-safe and secure.
    - **Efficiency**: String literals are stored in a common pool. If two string literals have the same value, they point to the same memory location, saving space.

### String vs. StringBuilder vs. StringBuffer

- **String**:
    - Immutable.
    - Suitable for scenarios where the string does not change often.

- **StringBuilder**:
    - Mutable and not thread-safe.
    - Preferred when you need to modify strings frequently in a single thread (e.g., building a string dynamically in a loop).

- **StringBuffer**:
    - Mutable and thread-safe.
    - Used when you need to modify strings in a multithreaded environment.

```java
// Example of StringBuilder
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
String result = sb.toString(); // "Hello World"
```

### Command-Line Arguments with Strings

When you run a Java program from the command line, you can pass arguments to the `main` method. These arguments are received as an array of strings.

```java
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments passed.");
        }
    }
}
```

**Example**: Running the program with command-line arguments:

```sh
java Main Hello World
```

**Output**:

```
Hello
World
```

### Summary

- Strings in Java are immutable sequences of characters.
- The `String` class provides a wide range of methods for manipulating and querying string data.
- Strings are different from `StringBuilder` and `StringBuffer`, which are mutable and used for different purposes.
- Understanding how to use and manipulate strings is fundamental to Java programming, given how often strings are used in real-world applications.

---
### Escape Sequences in Java

An **escape sequence** in Java is a sequence of characters that does not represent itself when used inside a string, but is translated into another character or a combination of characters that is difficult or impossible to enter directly.

#### **Common Escape Sequences**:

1. **Newline (`\n`)**:
    - Inserts a new line in the text at the point where it appears.
   ```java
   String str = "Hello,\nWorld!";
   System.out.println(str);
   // Output:
   // Hello,
   // World!
   ```

2. **Tab (`\t`)**:
    - Inserts a tab space.
   ```java
   String str = "Hello,\tWorld!";
   System.out.println(str);
   // Output:
   // Hello,   World!
   ```

3. **Backslash (`\\`)**:
    - Inserts a single backslash.
   ```java
   String str = "This is a backslash: \\";
   System.out.println(str);
   // Output:
   // This is a backslash: \
   ```

4. **Double Quote (`\"`)**:
    - Inserts a double quote within a string.
   ```java
   String str = "She said, \"Hello, World!\"";
   System.out.println(str);
   // Output:
   // She said, "Hello, World!"
   ```

5. **Single Quote (`\'`)**:
    - Inserts a single quote within a string.
   ```java
   char singleQuote = '\'';
   System.out.println("Single quote: " + singleQuote);
   // Output:
   // Single quote: '
   ```

6. **Carriage Return (`\r`)**:
    - Moves the cursor to the beginning of the current line without advancing to the next line. This is often used in conjunction with `\n` for platform-independent new lines.
   ```java
   String str = "Hello,\rWorld!";
   System.out.println(str);
   // Output depends on the environment:
   // World!
   ```

7. **Form Feed (`\f`)**:
    - It is used to advance to the next "page" in a printer output, though it's not commonly used today.
   ```java
   String str = "Hello,\fWorld!";
   System.out.println(str);
   ```

8. **Backspace (`\b`)**:
    - Deletes the character before the backspace.
   ```java
   String str = "Hello,\bWorld!";
   System.out.println(str);
   // Output:
   // HelloWorld!
   ```

#### **Example**:

```java
public class EscapeSequenceExample {
    public static void main(String[] args) {
        String str = "Hello,\nWorld!\tHow are you?";
        System.out.println(str);
    }
}
```

**Output**:
```
Hello,
World!  How are you?
```

### Raw Strings in Java

Java does not have a built-in feature for **raw strings** like some other languages (e.g., Python's triple-quoted strings). A raw string is a string where escape sequences are not processed and the string is taken "as is." However, there are workarounds to simulate raw strings in Java:

#### **Using Double Backslashes (`\\`)**:
You can use double backslashes to treat a string as a "raw string" where escape sequences are not interpreted.

```java
String rawPath = "C:\\Users\\Public\\Documents";
System.out.println(rawPath);
// Output:
// C:\Users\Public\Documents
```

#### **Using `replace()` Method**:
If you have a string with escape sequences that you want to treat as raw, you can use the `replace()` method to replace escape sequences with their literal equivalents.

```java
String rawString = "Hello,\\nWorld!";
String processedString = rawString.replace("\\n", "\n");
System.out.println(processedString);
// Output:
// Hello,
// World!
```

### Summary

- **Escape Sequences** in Java allow you to insert special characters into strings, such as newlines, tabs, and quotes, using a backslash (`\`) followed by a specific character.
- **Raw Strings** are not natively supported in Java, but you can simulate them by using double backslashes or by processing strings to replace escape sequences with their intended characters.

Understanding escape sequences is essential for working with strings in Java, especially when dealing with formatted text, file paths, or special characters.

---

### StringBuilder in Java

`StringBuilder` is a class in Java used to create mutable (modifiable) sequences of characters. Unlike `String`, which is immutable, `StringBuilder` allows you to change its contents without creating a new object each time a modification is made. This makes `StringBuilder` more efficient when performing multiple modifications on a string, such as appending, inserting, or deleting characters.

#### **Key Characteristics of StringBuilder**:

- **Mutable**: Unlike `String`, the `StringBuilder` can be modified after it is created.
- **Not Thread-Safe**: `StringBuilder` is not synchronized, meaning it is not safe to use in multithreaded environments without external synchronization. For thread-safe operations, `StringBuffer` should be used instead.

### Creating a StringBuilder

You can create a `StringBuilder` in several ways:

1. **Default Constructor**:
    - Creates an empty `StringBuilder` with an initial capacity of 16 characters.

   ```java
   StringBuilder sb = new StringBuilder();
   ```

2. **Constructor with Initial Capacity**:
    - Creates an empty `StringBuilder` with the specified initial capacity.

   ```java
   StringBuilder sb = new StringBuilder(50);
   ```

3. **Constructor with Initial String**:
    - Creates a `StringBuilder` initialized with a given string.

   ```java
   StringBuilder sb = new StringBuilder("Hello");
   ```

### Common StringBuilder Methods

1. **`append()`**:
    - Adds a string (or any other type) to the end of the existing `StringBuilder`.

   ```java
   StringBuilder sb = new StringBuilder("Hello");
   sb.append(" World");
   System.out.println(sb); // Output: Hello World
   ```

2. **`insert(int offset, String str)`**:
    - Inserts a string at the specified position in the `StringBuilder`.

   ```java
   StringBuilder sb = new StringBuilder("Hello");
   sb.insert(5, ", World");
   System.out.println(sb); // Output: Hello, World
   ```

3. **`delete(int start, int end)`**:
    - Removes characters from the `StringBuilder` within the specified range (`start` is inclusive, `end` is exclusive).

   ```java
   StringBuilder sb = new StringBuilder("Hello, World!");
   sb.delete(5, 7);
   System.out.println(sb); // Output: HelloWorld!
   ```

4. **`deleteCharAt(int index)`**:
    - Removes the character at the specified index.

   ```java
   StringBuilder sb = new StringBuilder("Hello, World!");
   sb.deleteCharAt(5);
   System.out.println(sb); // Output: Hello World!
   ```

5. **`replace(int start, int end, String str)`**:
    - Replaces the characters in the specified range with the given string.

   ```java
   StringBuilder sb = new StringBuilder("Hello, World!");
   sb.replace(7, 12, "Java");
   System.out.println(sb); // Output: Hello, Java!
   ```

6. **`reverse()`**:
    - Reverses the characters in the `StringBuilder`.

   ```java
   StringBuilder sb = new StringBuilder("Hello");
   sb.reverse();
   System.out.println(sb); // Output: olleH
   ```

7. **`toString()`**:
    - Converts the `StringBuilder` to a `String`.

   ```java
   StringBuilder sb = new StringBuilder("Hello");
   String str = sb.toString();
   System.out.println(str); // Output: Hello
   ```

8. **`charAt(int index)`**:
    - Returns the character at the specified index.

   ```java
   StringBuilder sb = new StringBuilder("Hello");
   char ch = sb.charAt(1);
   System.out.println(ch); // Output: e
   ```

9. **`setCharAt(int index, char ch)`**:
    - Sets the character at the specified index to the given character.

   ```java
   StringBuilder sb = new StringBuilder("Hello");
   sb.setCharAt(1, 'a');
   System.out.println(sb); // Output: Hallo
   ```

10. **`length()` and `capacity()`**:
    - `length()`: Returns the number of characters in the `StringBuilder`.
    - `capacity()`: Returns the current capacity of the `StringBuilder`.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    int len = sb.length(); // 5
    int cap = sb.capacity(); // 21 (initial capacity 16 + 5)
    ```

11. **`substring(int start, int end)`**:
    - Returns a substring from the specified start to end index (similar to the `String` method).

    ```java
    StringBuilder sb = new StringBuilder("Hello, World!");
    String sub = sb.substring(7, 12);
    System.out.println(sub); // Output: World
    ```

### Example Usage

```java
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(7, 12, "Java");
        sb.reverse();
        
        System.out.println(sb); // Output: !avaJ ,olleH
        System.out.println("Length: " + sb.length()); // Output: Length: 12
        System.out.println("Capacity: " + sb.capacity()); // Output: Capacity: 21
    }
}
```

### When to Use StringBuilder

- **Efficient String Modifications**: When you need to perform many modifications (appending, inserting, deleting) on a string, use `StringBuilder` instead of `String` to avoid creating multiple immutable objects.
- **Performance**: `StringBuilder` is faster and more efficient in single-threaded scenarios compared to `StringBuffer` because it is not synchronized.

### Summary

- `StringBuilder` is a mutable sequence of characters that allows in-place modification, making it ideal for scenarios where strings need to be frequently changed.
- It offers various methods like `append()`, `insert()`, `delete()`, `replace()`, `reverse()`, and more, making it versatile for string manipulation tasks.
- It should be preferred over `String` when performance is a concern, especially in single-threaded environments.

---
### StringBuffer in Java

`StringBuffer` is a class in Java that provides the functionality to create and manipulate mutable sequences of characters, similar to `StringBuilder`. The key difference between `StringBuffer` and `StringBuilder` is that `StringBuffer` is synchronized, meaning it is thread-safe and can be safely used in multithreaded environments.

#### **Key Characteristics of StringBuffer**:

- **Mutable**: Like `StringBuilder`, `StringBuffer` allows you to modify the content of the buffer without creating new objects.
- **Thread-Safe**: All public methods of `StringBuffer` are synchronized, making it safe for use by multiple threads simultaneously. However, this synchronization adds a slight performance overhead compared to `StringBuilder`.
- **Performance**: `StringBuffer` is slightly slower than `StringBuilder` due to its thread-safety mechanism, but it’s still much faster than using `String` for multiple modifications.

### Creating a StringBuffer

You can create a `StringBuffer` in several ways:

1. **Default Constructor**:
    - Creates an empty `StringBuffer` with an initial capacity of 16 characters.

   ```java
   StringBuffer sb = new StringBuffer();
   ```

2. **Constructor with Initial Capacity**:
    - Creates an empty `StringBuffer` with the specified initial capacity.

   ```java
   StringBuffer sb = new StringBuffer(50);
   ```

3. **Constructor with Initial String**:
    - Creates a `StringBuffer` initialized with a given string.

   ```java
   StringBuffer sb = new StringBuffer("Hello");
   ```

### Common StringBuffer Methods

`StringBuffer` methods are very similar to those of `StringBuilder`, with the main difference being that `StringBuffer` methods are synchronized for thread safety.

1. **`append()`**:
    - Adds a string (or any other type) to the end of the existing `StringBuffer`.

   ```java
   StringBuffer sb = new StringBuffer("Hello");
   sb.append(" World");
   System.out.println(sb); // Output: Hello World
   ```

2. **`insert(int offset, String str)`**:
    - Inserts a string at the specified position in the `StringBuffer`.

   ```java
   StringBuffer sb = new StringBuffer("Hello");
   sb.insert(5, ", World");
   System.out.println(sb); // Output: Hello, World
   ```

3. **`delete(int start, int end)`**:
    - Removes characters from the `StringBuffer` within the specified range (`start` is inclusive, `end` is exclusive).

   ```java
   StringBuffer sb = new StringBuffer("Hello, World!");
   sb.delete(5, 7);
   System.out.println(sb); // Output: HelloWorld!
   ```

4. **`deleteCharAt(int index)`**:
    - Removes the character at the specified index.

   ```java
   StringBuffer sb = new StringBuffer("Hello, World!");
   sb.deleteCharAt(5);
   System.out.println(sb); // Output: Hello World!
   ```

5. **`replace(int start, int end, String str)`**:
    - Replaces the characters in the specified range with the given string.

   ```java
   StringBuffer sb = new StringBuffer("Hello, World!");
   sb.replace(7, 12, "Java");
   System.out.println(sb); // Output: Hello, Java!
   ```

6. **`reverse()`**:
    - Reverses the characters in the `StringBuffer`.

   ```java
   StringBuffer sb = new StringBuffer("Hello");
   sb.reverse();
   System.out.println(sb); // Output: olleH
   ```

7. **`toString()`**:
    - Converts the `StringBuffer` to a `String`.

   ```java
   StringBuffer sb = new StringBuffer("Hello");
   String str = sb.toString();
   System.out.println(str); // Output: Hello
   ```

8. **`charAt(int index)`**:
    - Returns the character at the specified index.

   ```java
   StringBuffer sb = new StringBuffer("Hello");
   char ch = sb.charAt(1);
   System.out.println(ch); // Output: e
   ```

9. **`setCharAt(int index, char ch)`**:
    - Sets the character at the specified index to the given character.

   ```java
   StringBuffer sb = new StringBuffer("Hello");
   sb.setCharAt(1, 'a');
   System.out.println(sb); // Output: Hallo
   ```

10. **`length()` and `capacity()`**:
    - `length()`: Returns the number of characters in the `StringBuffer`.
    - `capacity()`: Returns the current capacity of the `StringBuffer`.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    int len = sb.length(); // 5
    int cap = sb.capacity(); // 21 (initial capacity 16 + 5)
    ```

11. **`substring(int start, int end)`**:
    - Returns a substring from the specified start to end index (similar to the `String` method).

    ```java
    StringBuffer sb = new StringBuffer("Hello, World!");
    String sub = sb.substring(7, 12);
    System.out.println(sub); // Output: World
    ```

### Example Usage

```java
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(7, 12, "Java");
        sb.reverse();
        
        System.out.println(sb); // Output: !avaJ ,olleH
        System.out.println("Length: " + sb.length()); // Output: Length: 12
        System.out.println("Capacity: " + sb.capacity()); // Output: Capacity: 21
    }
}
```

### When to Use StringBuffer

- **Thread Safety**: If you are working in a multithreaded environment where multiple threads might modify a string, use `StringBuffer` to ensure thread safety.
- **Multiple Modifications**: Similar to `StringBuilder`, use `StringBuffer` when you need to perform multiple modifications to a string, such as appending or inserting characters.

### StringBuffer vs StringBuilder vs String

- **`String`**: Immutable and thread-safe due to immutability, but inefficient for multiple modifications.
- **`StringBuilder`**: Mutable and efficient for single-threaded scenarios, not thread-safe.
- **`StringBuffer`**: Mutable and thread-safe, but with a slight performance overhead due to synchronization.

### Summary

- `StringBuffer` is a mutable sequence of characters that is synchronized for thread safety, making it suitable for multithreaded environments.
- It provides methods similar to `StringBuilder` for manipulating strings but with the added benefit of thread safety.
- Use `StringBuffer` when you need to perform frequent modifications on a string in a multithreaded context.

---

## Problems

Here are 30 basic coding problems focused on strings in Java. These problems are designed to help you understand different aspects of string manipulation, such as concatenation, searching, slicing, and formatting.

### 1. **Concatenate Two Strings**
      - Write a program to concatenate two strings and print the result.

### 2. **Find the Length of a String**
      - Write a program to find and print the length of a given string.

### 3. **Check if a String is Empty**
      - Write a program to check if a given string is empty or not.

### 4. **Convert String to Uppercase**
      - Write a program that converts a given string to uppercase and prints it.

### 5. **Convert String to Lowercase**
      - Write a program that converts a given string to lowercase and prints it.

### 6. **Compare Two Strings**
      - Write a program to compare two strings and print whether they are equal or not.

### 7. **Check if a String Contains a Substring**
      - Write a program to check if a given string contains a specified substring.

### 8. **Find the Index of a Character in a String**
      - Write a program to find the index of the first occurrence of a character in a string.

### 9. **Extract a Substring from a String**
      - Write a program to extract a substring from a given string based on start and end indexes.

### 10. **Check if a String Starts with a Prefix**
    - Write a program to check if a given string starts with a specified prefix.

### 11. **Check if a String Ends with a Suffix**
    - Write a program to check if a given string ends with a specified suffix.

### 12. **Reverse a String**
    - Write a program to reverse a given string and print the result.

### 13. **Remove Leading and Trailing Whitespaces**
    - Write a program to remove leading and trailing whitespaces from a given string.

### 14. **Replace a Character in a String**
    - Write a program to replace all occurrences of a character in a string with another character.

### 15. **Split a String into Words**
    - Write a program to split a given string into an array of words.

### 16. **Check if a String is a Palindrome**
    - Write a program to check if a given string is a palindrome (reads the same forward and backward).

### 17. **Count Vowels and Consonants in a String**
    - Write a program to count the number of vowels and consonants in a given string.

### 18. **Count the Occurrences of a Character in a String**
    - Write a program to count the number of times a specific character appears in a string.

### 19. **Find the First Non-Repeated Character in a String**
    - Write a program to find and print the first non-repeated character in a given string.

### 20. **Convert a String to an Integer**
    - Write a program to convert a given numeric string to an integer.

### 21. **Remove a Substring from a String**
    - Write a program to remove a specified substring from a given string.

### 22. **Concatenate a String with an Integer**
    - Write a program to concatenate a string with an integer and print the result.

### 23. **Check if Two Strings are Anagrams**
    - Write a program to check if two given strings are anagrams of each other.

### 24. **Count the Number of Words in a String**
    - Write a program to count the number of words in a given string.

### 25. **Convert a String to a Character Array**
    - Write a program to convert a given string to a character array.

### 26. **Check if a String is Numeric**
    - Write a program to check if a given string contains only numeric characters.

### 27. **Find the Longest Word in a String**
    - Write a program to find and print the longest word in a given string.

### 28. **Insert a String into Another String**
    - Write a program to insert a string into another string at a specified position.

### 29. **Remove Duplicate Characters from a String**
    - Write a program to remove all duplicate characters from a given string.

### 30. **Convert the First Letter of Each Word to Uppercase**
    - Write a program to convert the first letter of each word in a given string to uppercase.

These problems will help reinforce your understanding of string operations and are great for practicing basic string manipulation in Java.