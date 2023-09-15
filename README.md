# Java Programming Essentials

Programming guide about Java 20 essentials

##  1. <a name='Contents'></a>Contents

<!-- vscode-markdown-toc -->
* 1. [Contents](#Contents)
* 2. [About Java](#AboutJava)
* 3. [Getting Help](#GettingHelp)
* 4. [Running Java Programs](#RunningJavaPrograms)
	* 4.1. [Installing JDK](#InstallingJDK)
	* 4.2. [Writing and Running a Simple Java Program](#WritingandRunningaSimpleJavaProgram)
	* 4.3. [Using an IDE](#UsinganIDE)
	* 4.4. [Debugging](#Debugging)
		* 4.4.1. [Setting Breakpoints](#SettingBreakpoints)
		* 4.4.2. [Stepping Through Code](#SteppingThroughCode)
		* 4.4.3. [Exception Breakpoints](#ExceptionBreakpoints)
		* 4.4.4. [Watch Expressions](#WatchExpressions)
		* 4.4.5. [Debugging Threads](#DebuggingThreads)
* 5. [Modern and Safe Java Practices](#ModernandSafeJavaPractices)
	* 5.1. [Immutability](#Immutability)
	* 5.2. [Null Safety](#NullSafety)
	* 5.3. [Using Final Variables](#UsingFinalVariables)
	* 5.4. [Code Reviews and Static Analysis](#CodeReviewsandStaticAnalysis)
* 6. [Java Modules and Packages](#JavaModulesandPackages)
	* 6.1. [Packages](#Packages)
		* 6.1.1. [File Organization and Project Structure](#FileOrganizationandProjectStructure)
		* 6.1.2. [Using Packages](#UsingPackages)
	* 6.2. [Modules (Java 9+)](#ModulesJava9)
* 7. [Basic Syntax](#BasicSyntax)
	* 7.1. [Comments](#Comments)
	* 7.2. [Javadoc Comments](#JavadocComments)
	* 7.3. [Identifiers and Keywords](#IdentifiersandKeywords)
	* 7.4. [Semicolons and Blocks](#SemicolonsandBlocks)
	* 7.5. [Whitespace and Indentation](#WhitespaceandIndentation)
	* 7.6. [Case Sensitivity](#CaseSensitivity)
* 8. [Constants](#Constants)
* 9. [Variables, Types](#VariablesTypes)
	* 9.1. [Primitives](#Primitives)
	* 9.2. [Arrays](#Arrays)
	* 9.3. [Maps](#Maps)
	* 9.4. [Strings](#Strings)
* 10. [Collections](#Collections)
	* 10.1. [Lists](#Lists)
	* 10.2. [Sets](#Sets)
	* 10.3. [Queues](#Queues)
	* 10.4. [Maps](#Maps-1)
* 11. [10. Utilities](#Utilities)
	* 11.1. [java.util.Arrays](#java.util.Arrays)
	* 11.2. [java.util.Date and java.util.Calendar](#java.util.Dateandjava.util.Calendar)
	* 11.3. [java.util.Random](#java.util.Random)
	* 11.4. [java.util.Scanner](#java.util.Scanner)
* 12. [Scopes](#Scopes)
	* 12.1. [Local Scope](#LocalScope)
	* 12.2. [Instance Scope](#InstanceScope)
	* 12.3. [Class Scope (Static Scope)](#ClassScopeStaticScope)
	* 12.4. [Block Scope](#BlockScope)
* 13. [Builtin Operators and Functions](#BuiltinOperatorsandFunctions)
	* 13.1. [Arithmetic Operators](#ArithmeticOperators)
	* 13.2. [Comparison Operators](#ComparisonOperators)
	* 13.3. [Logical Operators](#LogicalOperators)
	* 13.4. [Bitwise Operators](#BitwiseOperators)
* 14. [Conditionals and Looping](#ConditionalsandLooping)
	* 14.1. [Conditionals](#Conditionals)
	* 14.2. [Looping](#Looping)
		* 14.2.1. [For loop](#Forloop)
		* 14.2.2. [While loop](#Whileloop)
		* 14.2.3. [Do-while loop](#Do-whileloop)
		* 14.2.4. [Break](#Break)
		* 14.2.5. [Continue](#Continue)
* 15. [Functions](#Functions)
	* 15.1. [Function Declaration and Calling](#FunctionDeclarationandCalling)
	* 15.2. [Function Overloading](#FunctionOverloading)
	* 15.3. [Variable Arguments](#VariableArguments)
* 16. [Classes](#Classes)
	* 16.1. [Defining a Class](#DefiningaClass)
	* 16.2. [Creating an Object](#CreatinganObject)
	* 16.3. [Accessing Fields and Methods](#AccessingFieldsandMethods)
	* 16.4. [Enums](#Enums)
* 17. [Interfaces](#Interfaces)
	* 17.1. [Defining an Interface](#DefininganInterface)
	* 17.2. [Implementing an Interface](#ImplementinganInterface)
	* 17.3. [Using an Interface](#UsinganInterface)
* 18. [Exceptions](#Exceptions)
	* 18.1. [Types of Exceptions](#TypesofExceptions)
	* 18.2. [Basic Exception Handling](#BasicExceptionHandling)
	* 18.3. [Finally Block](#FinallyBlock)
* 19. [Generics](#Generics)
	* 19.1. [Basic Usage](#BasicUsage)
	* 19.2. [Bounded Type Parameters](#BoundedTypeParameters)
	* 19.3. [Wildcards](#Wildcards)
* 20. [Lambdas](#Lambdas)
	* 20.1. [Basic Syntax](#BasicSyntax-1)
	* 20.2. [Using Lambdas with Functional Interfaces](#UsingLambdaswithFunctionalInterfaces)
	* 20.3. [Method References](#MethodReferences)
* 21. [Annotations](#Annotations)
	* 21.1. [Built-In Annotations](#Built-InAnnotations)
	* 21.2. [Custom Annotations](#CustomAnnotations)
* 22. [Date, Time](#DateTime)
	* 22.1. [LocalDate](#LocalDate)
	* 22.2. [LocalTime](#LocalTime)
	* 22.3. [LocalDateTime](#LocalDateTime)
	* 22.4. [Formatting and Parsing](#FormattingandParsing)
* 23. [Pattern Matching, Regular Expressions](#PatternMatchingRegularExpressions)
	* 23.1. [Basic Syntax](#BasicSyntax-1)
	* 23.2. [Using Regular Expressions](#UsingRegularExpressions)
	* 23.3. [Find and Replace](#FindandReplace)
* 24. [Streams](#Streams)
	* 24.1. [Creating Streams](#CreatingStreams)
	* 24.2. [Common Operations](#CommonOperations)
	* 24.3. [Parallel Streams](#ParallelStreams)
* 25. [Files and I/O](#FilesandIO)
	* 25.1. [Reading from a File](#ReadingfromaFile)
	* 25.2. [Writing to a File](#WritingtoaFile)
	* 25.3. [NIO.2 for File Operations](#NIO.2forFileOperations)
* 26. [Concurrency in Java](#ConcurrencyinJava)
	* 26.1. [Threads](#Threads)
	* 26.2. [BlockingQueue](#BlockingQueue)
	* 26.3. [Executors](#Executors)
	* 26.4. [CountDownLatch](#CountDownLatch)
	* 26.5. [Synchronized, Locks](#SynchronizedLocks)
* 27. [Unit Tests and Other Testing](#UnitTestsandOtherTesting)
	* 27.1. [Basic Unit Test](#BasicUnitTest)
	* 27.2. [Mocking](#Mocking)
	* 27.3. [Coverage](#Coverage)
* 28. [Functional Programming in Java](#FunctionalProgramminginJava)
	* 28.1. [Lambda Expressions](#LambdaExpressions)
	* 28.2. [Streams API](#StreamsAPI)
	* 28.3. [Optional](#Optional)
* 29. [Functional Programming in Java (Extended)](#FunctionalProgramminginJavaExtended)
	* 29.1. [Higher-Order Functions](#Higher-OrderFunctions)
	* 29.2. [Stream Operations](#StreamOperations)
		* 29.2.1. [Filtering](#Filtering)
		* 29.2.2. [Mapping](#Mapping)
		* 29.2.3. [Reducing](#Reducing)
		* 29.2.4. [Flat Mapping](#FlatMapping)
	* 29.3. [Immutability](#Immutability-1)
	* 29.4. [Optional Class](#OptionalClass)
* 30. [Summary](#Summary)

<!-- vscode-markdown-toc-config
	numbering=true
	autoSave=true
	/vscode-markdown-toc-config -->
<!-- /vscode-markdown-toc -->

---

##  2. <a name='AboutJava'></a>About Java

Java is a high-level, object-oriented programming language developed by Sun Microsystems, which is now owned by Oracle Corporation. It was initially released in 1995 and has since become one of the most widely-used programming languages in the world. Java is platform-independent, meaning code written in Java can run on any device that has a Java Virtual Machine (JVM).

The language is known for its portability, security features, and strong community support. It's commonly used in various domains, including web development, mobile application development (Android), enterprise applications, and even in Internet of Things (IoT) devices.

Java has gone through numerous updates and versions. As of the time of writing, Java 20 is the latest version, featuring modern constructs and syntactical sugar to make Java code more expressive and easier to read.

---

##  3. <a name='GettingHelp'></a>Getting Help

Getting stuck is normal. Here are some resources:

1. [Learn Java](https://dev.java/learn/)
2. [Java Downloads](https://www.oracle.com/java/technologies/downloads/)
3. [OpenJDK](https://openjdk.org/)
4. [Java 20 API Docs](https://docs.oracle.com/en/java/javase/20/docs/api/index.html)
5. [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se20/html/index.html)
6. [Java Documentation](https://docs.oracle.com/en/java/)
7. [Java FAQ](https://dev.java/learn/faq/)

---

##  4. <a name='RunningJavaPrograms'></a>Running Java Programs

To run Java programs, you'll need two main components:

1. **JDK (Java Development Kit)**: This includes the JRE (Java Runtime Environment) and development tools like the compiler (`javac`).
2. **IDE (Integrated Development Environment)**: This is optional but recommended. Popular IDEs for Java development include IntelliJ IDEA, Eclipse, and NetBeans.

###  4.1. <a name='InstallingJDK'></a>Installing JDK

1. Download the latest JDK from the official Oracle website or through package managers on Linux.
2. Install it and set up the environment variables.

###  4.2. <a name='WritingandRunningaSimpleJavaProgram'></a>Writing and Running a Simple Java Program

Here's how you can write and run a simple Java program using a text editor and the command line:

1. Create a file named `HelloWorld.java` and write the following code:

    ```java
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```

2. Open the terminal and navigate to the directory where `HelloWorld.java` is saved.
3. Compile the Java file:

    ```bash
    javac HelloWorld.java
    ```

    This will generate a `HelloWorld.class` file.
4. Run the compiled class file:

    ```bash
    java HelloWorld
    ```

    You should see the output `Hello, World!` printed to the terminal.

###  4.3. <a name='UsinganIDE'></a>Using an IDE

If you're using an IDE, the process is simplified:

1. Create a new Java project.
2. Add a new Java class named `HelloWorld`.
3. Write the same code as above.
4. Click the "Run" button.

###  4.4. <a name='Debugging'></a>Debugging

Debugging is essential for identifying and fixing issues. You can debug via the [IDE](https://code.visualstudio.com/docs/java/java-debugging), or in the command line via [`jdb`](https://foojay.io/today/jdb/).

It is important to compile this class with the "`-g`" option (`javac -g Test.java`), which generates all the debugging information including local variables.

####  4.4.1. <a name='SettingBreakpoints'></a>Setting Breakpoints

Place breakpoints where you want to pause execution.

####  4.4.2. <a name='SteppingThroughCode'></a>Stepping Through Code

Use the debugger to step through code line by line.

####  4.4.3. <a name='ExceptionBreakpoints'></a>Exception Breakpoints

You can set breakpoints that will be triggered when an exception is thrown.

####  4.4.4. <a name='WatchExpressions'></a>Watch Expressions

Watch expressions allow you to watch variable values and expressions in real-time.

####  4.4.5. <a name='DebuggingThreads'></a>Debugging Threads

Learn how to debug multi-threaded applications.

---

##  5. <a name='ModernandSafeJavaPractices'></a>Modern and Safe Java Practices

Modern Java development encourages a set of best practices to write efficient, maintainable, and secure code. Some of these practices include:

###  5.1. <a name='Immutability'></a>Immutability

Using immutable objects where possible can make your application safer from bugs and easier to reason about.

```java
public final class ImmutablePoint {
    private final int x;
    private final int y;
    
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
```

###  5.2. <a name='NullSafety'></a>Null Safety

Avoiding `NullPointerException` is a common goal. Modern Java practices recommend using `Optional<T>` to express the possibility of absence.

```java
import java.util.Optional;

public class UserService {
    public Optional<User> findUserById(String id) {
        // Lookup user by ID
        return Optional.ofNullable(lookupUser(id));
    }
}
```

###  5.3. <a name='UsingFinalVariables'></a>Using Final Variables

Marking variables with `final` ensures that they can't be reassigned, making the code easier to understand.

```java
public void calculateArea(final double radius) {
    final double area = Math.PI * Math.pow(radius, 2);
    System.out.println("Area is: " + area);
}
```

###  5.4. <a name='CodeReviewsandStaticAnalysis'></a>Code Reviews and Static Analysis

Tools like [SonarQube](https://www.sonarsource.com/products/sonarqube/) and regular peer reviews can help maintain a high code quality.

---

##  6. <a name='JavaModulesandPackages'></a>Java Modules and Packages

Modules and packages are ways to organize your Java code. They help manage dependencies and improve code reusability.

###  6.1. <a name='Packages'></a>Packages

Packages are namespaces that organize classes and interfaces. The package declaration should be the first statement in a Java source file.

```java
package com.example.hello;
```

To use classes from other packages, you'll need to import them:

```java
import java.util.List;
```

####  6.1.1. <a name='FileOrganizationandProjectStructure'></a>File Organization and Project Structure

Java projects typically follow a directory structure.

* `src/`: Source files
* `lib/`: Libraries
* `test/`: Test files

####  6.1.2. <a name='UsingPackages'></a>Using Packages

Organize your classes into packages.

```java
package com.myapp;
```

###  6.2. <a name='ModulesJava9'></a>Modules (Java 9+)

Java 9 introduced the module system to modularize the JDK and user code. A module is a set of packages designed for reuse and strongly encapsulates its implementation.

A `module-info.java` file describes a module:

```java
module com.example.hello {
    requires java.base;
    exports com.example.hello;
}
```

Here, the `com.example.hello` module is dependent on `java.base` and exports its own package for others to use.

To compile and run modular code:

1. Compile the module:

    ```bash
    javac -d out --module-source-path src --module com.example.hello
    ```
  
2. Run the main class:

    ```bash
    java --module-path out --module com.example.hello/com.example.hello.Main
    ```

---

##  7. <a name='BasicSyntax'></a>Basic Syntax

Java's syntax might look familiar if you've worked with C, C++, or other C-family languages. However, Java has its unique set of rules and constructs. Let's look at some of the essential elements:

###  7.1. <a name='Comments'></a>Comments

Java supports single-line and multi-line comments:

```java
// This is a single-line comment

/*
  This is a 
  multi-line comment
*/
```

###  7.2. <a name='JavadocComments'></a>Javadoc Comments

Javadoc comments start with `/**` and end with `*/`. They can include several tags:

* `@author` (classes and interfaces only, required)
* `@version` (classes and interfaces only, required. See footnote 1)
* `@param`: Describes method parameters.
* `@return`: Describes the return value.
* `@throws`: (@exception was the original tag) Describes exceptions that the method can throw.
* `@exception` (@throws is a synonym added in Javadoc 1.2)
* `@see`
* `@since`
* `@serial` (or @serialField or @serialData)
* `@deprecated` (see How and When To Deprecate APIs)

```java
/**
 * Calculates the square of a number.
 *
 * @param x The number to be squared.
 * @return The square of the number.
 * @throws IllegalArgumentException if x is negative.
 */
public int square(int x) {
    if (x < 0) {
        throw new IllegalArgumentException("Negative input");
    }
    return x * x;
}
```

###  7.3. <a name='IdentifiersandKeywords'></a>Identifiers and Keywords

Java identifiers are used for class names, method names, and variables. They must start with a letter, underscore (`_`), or dollar sign (`$`); subsequent characters can be digits.

```java
int myVariable;  // valid
int 123abc;      // invalid
```

Java also has a set of reserved keywords like `class`, `int`, `return`, etc., which cannot be used as identifiers.

###  7.4. <a name='SemicolonsandBlocks'></a>Semicolons and Blocks

Java uses semicolons to terminate statements:

```java
int x = 10;  // semicolon is required
```

Blocks of code are defined using braces:

```java
if (x > 0) {
    System.out.println("Positive");
}
```

###  7.5. <a name='WhitespaceandIndentation'></a>Whitespace and Indentation

Java is whitespace-insensitive, but proper indentation is crucial for readability:

```java
int x=10; int y=20;  // valid but not recommended
```

###  7.6. <a name='CaseSensitivity'></a>Case Sensitivity

Java is case-sensitive, which means `Variable` and `variable` are different identifiers.

---

##  8. <a name='Constants'></a>Constants

In Java, you can define constants that cannot be modified after their initial assignment. This is often useful to make the code more readable and to safeguard against modifying values unintentionally.

You define constants using the `final` keyword:

```java
final int MAX_USERS = 100;
```

By convention, constant identifiers are in uppercase, separated by underscores for readability.

Here's an example using constants:

```java
public class CircleArea {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        double radius = 10.0;
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}
```

In this example, `PI` is a constant and its value cannot be changed after its initial assignment. Attempting to change it would result in a compile-time error.

---

##  9. <a name='VariablesTypes'></a>Variables, Types

In Java, variables are used to store data that can be used and manipulated throughout a program. The type of a variable determines the size and layout of the variable's memory, the range of values that can be stored, and the set of operations that can be applied.

###  9.1. <a name='Primitives'></a>Primitives

Java has 8 primitive types: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.

```java
int age = 30;
double salary = 55000.50;
boolean isActive = true;
char grade = 'A';
```

###  9.2. <a name='Arrays'></a>Arrays

Arrays are used to store multiple values of the same type:

```java
int[] numbers = new int[5];
numbers[0] = 1;
```

Or using shorthand:

```java
int[] numbers = {1, 2, 3, 4, 5};
```

###  9.3. <a name='Maps'></a>Maps

Java provides map implementations through the `Map` interface, most notably `HashMap`:

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> studentGrades = new HashMap<>();
studentGrades.put("Alice", 90);
```

###  9.4. <a name='Strings'></a>Strings

Strings are immutable sequences of characters:

```java
String name = "John";
String greeting = "Hello, " + name;
```

---

##  10. <a name='Collections'></a>Collections

Java offers a rich set of collection classes that implement commonly used data structures like lists, sets, and queues. These classes are part of the [Java Collections Framework (JCF)](https://dev.java/learn/api/collections-framework/).

###  10.1. <a name='Lists'></a>Lists

Lists are ordered collections that can contain duplicate elements:

```java
import java.util.ArrayList;
import java.util.List;

List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
```

###  10.2. <a name='Sets'></a>Sets

Sets are collections that cannot contain duplicate elements:

```java
import java.util.HashSet;
import java.util.Set;

Set<Integer> uniqueNumbers = new HashSet<>();
uniqueNumbers.add(1);
uniqueNumbers.add(2);
uniqueNumbers.add(1);  // Will not be added
```

###  10.3. <a name='Queues'></a>Queues

Queues follow the First-In-First-Out (FIFO) principle:

```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> tasks = new LinkedList<>();
tasks.offer("Read");
tasks.offer("Write");
```

###  10.4. <a name='Maps-1'></a>Maps

As we saw in the Variables, Types chapter, maps store key-value pairs:

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> ages = new HashMap<>();
ages.put("Alice", 30);
ages.put("Bob", 40);
```

Each of these collection types has its own set of methods for manipulating data, and they can be incredibly powerful when used correctly.

---

##  11. <a name='Utilities'></a>10. Utilities

###  11.1. <a name='java.util.Arrays'></a>java.util.Arrays

Java SE provides several methods for performing array manipulations (common tasks, such as copying, sorting and searching arrays) in the `java.util.Arrays` class.

Instead of using the `arraycopy()` method of the `System` class, you can use `java.util.Arrays.copyOfRange()`, and it requires fewer lines of code. Note that the second parameter of the `java.util.Arrays` method is the initial index of the range to be copied, inclusively, while the third parameter is the final index of the range to be copied, exclusively.

```java
String[] copyFrom = {
    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
    "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
    "Marocchino", "Ristretto" };
String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
```

Content: `Cappuccino Corretto Cortado Doppio Espresso Frappucino Freddo`.

Other useful operations provided by methods in the `java.util.Arrays` class are:

* Searching an array for a specific value to get the index at which it is placed (the `binarySearch()` method).
* Comparing two arrays to determine if they are equal or not (the `equals()` method).
* Filling an array to place a specific value at each index (the `fill()` method).
* Sorting an array into ascending order. This can be done either sequentially, using the `sort()` method, or concurrently, using the `parallelSort()` method introduced in Java SE 8. Parallel sorting of large arrays on * multiprocessor systems is faster than sequential array sorting.
* Creating a stream that uses an array as its source (the `stream()` method). For example, the following statement prints the contents of the `copyTo` array in the same way as in the previous example:

```java
java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);
```

See Aggregate Operations for more information about streams.

* Converting an array to a string. The `toString()` method converts each element of the array to a string, separates them with commas, then surrounds them with brackets. For example, the following statement converts the `copyTo` array to a string and prints it:

```java
System.out.println(java.util.Arrays.toString(copyTo));
```

This statement prints the following:

```text
[Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappucino, Freddo]
```

###  11.2. <a name='java.util.Dateandjava.util.Calendar'></a>java.util.Date and java.util.Calendar

For date and time manipulations.

```java
Date date = new Date();
Calendar calendar = Calendar.getInstance();
```

###  11.3. <a name='java.util.Random'></a>java.util.Random

For generating random numbers.

```java
Random random = new Random();
int number = random.nextInt(10);  // 0 to 9
```

###  11.4. <a name='java.util.Scanner'></a>java.util.Scanner

For reading user input.

```java
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
```

---

##  12. <a name='Scopes'></a>Scopes

In Java, the concept of scope refers to the region of code where a variable is accessible. Understanding scope is crucial for writing effective and bug-free programs. Here are the main types of scopes:

###  12.1. <a name='LocalScope'></a>Local Scope

Variables declared within a method are accessible only within that method:

```java
public void showLocalScope() {
    int localVariable = 10;  // Accessible only within this method
    System.out.println(localVariable);
}
```

###  12.2. <a name='InstanceScope'></a>Instance Scope

Variables declared within a class but outside any method are instance variables. They are accessible from all methods of the class:

```java
public class MyClass {
    int instanceVariable = 20;  // Accessible within all methods of this class
    
    public void showInstanceVariable() {
        System.out.println(instanceVariable);  // Accessible here
    }
}
```

###  12.3. <a name='ClassScopeStaticScope'></a>Class Scope (Static Scope)

Variables declared as `static` within a class are class variables. They are shared among all instances of the class:

```java
public class MyClass {
    static int classVariable = 30;  // Shared among all instances
    
    public void showClassVariable() {
        System.out.println(classVariable);  // Accessible here
    }
}
```

###  12.4. <a name='BlockScope'></a>Block Scope

Variables declared within a block `{}` are accessible only within that block:

```java
public void showBlockScope() {
    {
        int blockVariable = 40;
        System.out.println(blockVariable);  // Accessible here
    }
    // System.out.println(blockVariable);  // Not accessible here
}
```

---

##  13. <a name='BuiltinOperatorsandFunctions'></a>Builtin Operators and Functions

Java provides a variety of built-in operators for performing operations like arithmetic, comparison, and logical operations. Here's a quick rundown:

###  13.1. <a name='ArithmeticOperators'></a>Arithmetic Operators

```java
int sum = 3 + 2;     // Addition
int diff = 5 - 3;    // Subtraction
int prod = 4 * 3;    // Multiplication
int quot = 8 / 2;    // Division
int rem = 9 % 2;     // Remainder
```

###  13.2. <a name='ComparisonOperators'></a>Comparison Operators

```java
boolean isEqual = (5 == 5);      // Equal to
boolean isNotEqual = (5 != 4);   // Not equal to
boolean isGreater = (5 > 4);     // Greater than
// And so on...
```

###  13.3. <a name='LogicalOperators'></a>Logical Operators

```java
boolean andResult = (true && false);  // Logical AND
boolean orResult = (true || false);   // Logical OR
boolean notResult = !true;            // Logical NOT
```

###  13.4. <a name='BitwiseOperators'></a>Bitwise Operators

```java
int bitwiseAnd = 5 & 3;  // Bitwise AND
int bitwiseOr = 5 | 3;   // Bitwise OR
// And so on...
```

Java also provides a rich set of built-in functions through its standard library, for example:

```java
double sqrtResult = Math.sqrt(16);  // Square root
int absResult = Math.abs(-10);      // Absolute value
```

These functions are accessible by importing the appropriate packages and can greatly simplify complex operations.

---

##  14. <a name='ConditionalsandLooping'></a>Conditionals and Looping

Decision-making and iteration are core aspects of any programming language. Java provides various constructs to handle these tasks.

###  14.1. <a name='Conditionals'></a>Conditionals

Java supports `if`, `else if`, and `else` statements for conditional logic:

```java
int x = 10;

if (x > 5) {
    System.out.println("x is greater than 5");
} else if (x == 5) {
    System.out.println("x is equal to 5");
} else {
    System.out.println("x is less than 5");
}
```

Java also supports the `switch` statement, which is useful for cases where you have multiple conditions:

```java
switch (x) {
    case 1:
        System.out.println("x is 1");
        break;
    case 10:
        System.out.println("x is 10");
        break;
    default:
        System.out.println("x is something else");
}
```

###  14.2. <a name='Looping'></a>Looping

Java provides several types of loops, including `for`, `while`, and `do-while`:

####  14.2.1. <a name='Forloop'></a>For loop

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

####  14.2.2. <a name='Whileloop'></a>While loop

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

####  14.2.3. <a name='Do-whileloop'></a>Do-while loop

```java
i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

####  14.2.4. <a name='Break'></a>Break

The break statement is used to exit a loop prematurely when a certain condition is met.

```java
for(int i = 0; i < 10; i++) {
    if(i == 5) {
        break;  // Exits the loop when i equals 5
    }
    System.out.println(i);
}
```

####  14.2.5. <a name='Continue'></a>Continue

The continue statement skips the current iteration of a loop and proceeds to the next iteration.

```java
for(int i = 0; i < 10; i++) {
    if(i % 2 == 0) {
        continue;  // Skips even numbers
    }
    System.out.println(i);
}
```

---

##  15. <a name='Functions'></a>Functions

Functions in Java are defined using the `void` keyword for functions that don't return a value, or the type of the return value for functions that do. Functions can also accept parameters.

###  15.1. <a name='FunctionDeclarationandCalling'></a>Function Declaration and Calling

Here's how to define a simple function that adds two numbers:

```java
public static int addNumbers(int a, int b) {
    return a + b;
}
```

And to call this function:

```java
int sum = addNumbers(5, 10);
System.out.println("The sum is: " + sum);
```

###  15.2. <a name='FunctionOverloading'></a>Function Overloading

Java allows function overloading, where multiple functions can have the same name but different parameter lists:

```java
public static int addNumbers(int a, int b) {
    return a + b;
}

public static double addNumbers(double a, double b) {
    return a + b;
}
```

###  15.3. <a name='VariableArguments'></a>Variable Arguments

Java supports functions with variable-length argument lists, using the `...` syntax:

```java
public static int sumAll(int... numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum;
}

// Usage
int sum = sumAll(1, 2, 3, 4, 5);
```

Functions are the building blocks of Java programs, enabling you to write reusable and modular code.

---

##  16. <a name='Classes'></a>Classes

In Java, classes serve as the blueprint for creating objects. A class defines the properties (fields) and behaviors (methods) that its objects will have.

###  16.1. <a name='DefiningaClass'></a>Defining a Class

Here's a simple class that represents a `Person`:

```java
public class Person {
    // Fields
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
```

###  16.2. <a name='CreatinganObject'></a>Creating an Object

To create an object of the class, you use the `new` keyword:

```java
Person person = new Person("Alice", 30);
```

###  16.3. <a name='AccessingFieldsandMethods'></a>Accessing Fields and Methods

After creating an object, you can access its fields and methods:

```java
System.out.println(person.name);  // Output: Alice
person.introduce();               // Output: Hello, my name is Alice and I am 30 years old.
```

###  16.4. <a name='Enums'></a>Enums

Enums are used to define a set of named constants.

```java
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
```

Usage:

```java
Day today = Day.MONDAY;
```

---

##  17. <a name='Interfaces'></a>Interfaces

Interfaces in Java are used to define a contract that classes must adhere to. They can contain method signatures, default methods, and static methods. However, they cannot contain instance variables.

###  17.1. <a name='DefininganInterface'></a>Defining an Interface

Here's a simple interface for a `Drawable` object:

```java
public interface Drawable {
    void draw();  // Method signature
}
```

###  17.2. <a name='ImplementinganInterface'></a>Implementing an Interface

A class implements an interface using the `implements` keyword:

```java
public class Circle implements Drawable {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
```

###  17.3. <a name='UsinganInterface'></a>Using an Interface

Once a class implements an interface, you can use it as an instance of that interface:

```java
Drawable drawable = new Circle(5);
drawable.draw();  // Output: Drawing a circle with radius 5
```

Interfaces are a powerful feature in Java, allowing for abstraction, multiple inheritance through the use of multiple interfaces, and providing a way to share common methods across unrelated class hierarchies.

---

##  18. <a name='Exceptions'></a>Exceptions

Exceptions in Java are events that disrupt the normal flow of a program's instructions. Java provides a robust exception-handling mechanism to manage runtime errors, so your program can continue to operate in a controlled manner.

###  18.1. <a name='TypesofExceptions'></a>Types of Exceptions

Java exceptions are divided into two categories:

1. **Checked Exceptions**: These are exceptions that a method is expected to catch and handle. Examples include `IOException`, `SQLException`, etc.
2. **Unchecked Exceptions**: These are exceptions that occur due to errors in code logic. Examples include `NullPointerException`, `ArithmeticException`, etc.

###  18.2. <a name='BasicExceptionHandling'></a>Basic Exception Handling

You handle exceptions using a `try-catch` block:

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e.getMessage());
}
```

You can also have multiple `catch` blocks:

```java
try {
    // some code that may throw exceptions
} catch (ArithmeticException e) {
    // handle arithmetic exceptions
} catch (IOException e) {
    // handle I/O exceptions
}
```

###  18.3. <a name='FinallyBlock'></a>Finally Block

The `finally` block contains code that is always executed, whether an exception is thrown or not:

```java
try {
    // some code
} catch (Exception e) {
    // handle exception
} finally {
    System.out.println("This will always be executed.");
}
```

---

##  19. <a name='Generics'></a>Generics

Generics enable you to write code that is type-safe while being reusable. With generics, you can define classes, interfaces, and methods where the type of data operated upon is specified as a parameter.

###  19.1. <a name='BasicUsage'></a>Basic Usage

Here's a simple example of a generic class:

```java
public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
```

To use this generic class:

```java
Box<Integer> intBox = new Box<>(10);
Box<String> strBox = new Box<>("Hello");
```

###  19.2. <a name='BoundedTypeParameters'></a>Bounded Type Parameters

You can restrict the types that can be used with a generic class or method. For example, to allow only numbers:

```java
public class NumberBox<T extends Number> {
    private T content;
    // ...
}
```

Now, only `Number` and its subclasses can be used with `NumberBox`.

###  19.3. <a name='Wildcards'></a>Wildcards

Wildcards are useful for working with collections of unknown types:

```java
public void printListContent(List<?> list) {
    for (Object item : list) {
        System.out.println(item);
    }
}
```

Generics provide a way for you to write more flexible and reusable code while maintaining type safety.

---

##  20. <a name='Lambdas'></a>Lambdas

Lambda expressions, introduced in Java 8, allow you to write instances of single-method interfaces (functional interfaces) in a much more concise, expressive, and readable way. They are used primarily to define inline implementation of a functional interface.

###  20.1. <a name='BasicSyntax-1'></a>Basic Syntax

The basic syntax of a lambda is either `(parameters) -> expression` or `(parameters) -> { statements; }`.

For example, here's a lambda expression that takes two integers and returns their sum:

```java
(a, b) -> a + b
```

###  20.2. <a name='UsingLambdaswithFunctionalInterfaces'></a>Using Lambdas with Functional Interfaces

Java 8 introduces the concept of functional interfaces, which are interfaces with just one abstract method. Lambda expressions can be used as instances of a functional interface.

Here's how you can use lambdas with the `Runnable` interface:

```java
Runnable run = () -> System.out.println("Hello, world!");
new Thread(run).start();
```

###  20.3. <a name='MethodReferences'></a>Method References

Method references provide a shorthand notation of a lambda expression to call a method:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(System.out::println);
```

---

##  21. <a name='Annotations'></a>Annotations

Annotations provide metadata about the program elements they annotate. Java has built-in annotations like `@Override`, `@Deprecated`, and `@SuppressWarnings`, and you can also define custom annotations.

###  21.1. <a name='Built-InAnnotations'></a>Built-In Annotations

* `@Override`: Indicates that a method is intended to override a method in a superclass.
  
  ```java
  @Override
  public String toString() {
      return "MyClass{}";
  }
  ```

* `@Deprecated`: Marks a method or class as obsolete.
  
  ```java
  @Deprecated
  public void oldMethod() {
      // ...
  }
  ```

* `@SuppressWarnings`: Tells the compiler to suppress specific warnings.
  
  ```java
  @SuppressWarnings("unchecked")
  public void someMethod() {
      // ...
  }
  ```

###  21.2. <a name='CustomAnnotations'></a>Custom Annotations

You can define your own annotations like this:

```java
public @interface MyAnnotation {
    String value();
    int count() default 1;
}
```

And use them in your code like so:

```java
@MyAnnotation(value = "Example", count = 3)
public class MyClass {
    // ...
}
```

Annotations are often used for code analysis, creating documentation, or tracking code dependencies and behaviors.

---

##  22. <a name='DateTime'></a>Date, Time

Java provides a comprehensive date and time API through the `java.time` package, introduced in Java 8. This package provides classes like `LocalDate`, `LocalTime`, and `LocalDateTime`, among others, to help you represent and manipulate date and time in a type-safe manner.

###  22.1. <a name='LocalDate'></a>LocalDate

`LocalDate` represents a date without a time or time zone:

```java
import java.time.LocalDate;

LocalDate today = LocalDate.now();
LocalDate firstDayOfMonth = today.withDayOfMonth(1);
```

###  22.2. <a name='LocalTime'></a>LocalTime

`LocalTime` represents time without a date or time zone:

```java
import java.time.LocalTime;

LocalTime now = LocalTime.now();
LocalTime midday = LocalTime.of(12, 0);
```

###  22.3. <a name='LocalDateTime'></a>LocalDateTime

`LocalDateTime` is a composite of `LocalDate` and `LocalTime`:

```java
import java.time.LocalDateTime;

LocalDateTime currentDateTime = LocalDateTime.now();
```

###  22.4. <a name='FormattingandParsing'></a>Formatting and Parsing

You can format and parse dates and times using `DateTimeFormatter`:

```java
import java.time.format.DateTimeFormatter;

LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = now.format(formatter);
```

---

##  23. <a name='PatternMatchingRegularExpressions'></a>Pattern Matching, Regular Expressions

Java provides robust support for pattern matching through the `java.util.regex` package. This is useful for tasks like data validation, text searching, and text manipulation.

Java's regular expression engine is not based on PCRE (Perl-Compatible Regular Expressions), PCRE2, or Perl, but it does offer syntax and features that are quite similar to Perl 5 regular expressions. This includes support for various character classes, quantifiers, and flags for case-insensitive matching, among others.

Java's regex engine is part of the `java.util.regex` package, which includes the `Pattern` and `Matcher` classes for compiling and matching regular expressions.

Here are some key features supported by Java's regex engine:

* Basic and extended POSIX regular expressions
* Predefined character classes (e.g., `\d`, `\w`, `\s`)
* Quantifiers like `*`, `+`, `?`, `{n}`, `{n,}`, `{n,m}`
* Greedy, reluctant, and possessive quantifiers
* Anchors like `^` and `$`
* Groups and capturing
* Back-references
* Lookahead and lookbehind assertions

Although Java's regex engine is not strictly PCRE-compatible, it is quite powerful and supports many of the features found in other advanced regular expression languages.

###  23.1. <a name='BasicSyntax-1'></a>Basic Syntax

The basic syntax for a regular expression pattern involves special characters like `*`, `+`, `.`, `?`, etc., to describe the pattern.

* `.`: Any character
* `*`: Zero or more of the previous element
* `+`: One or more of the previous element
* `?`: Zero or one of the previous element

###  23.2. <a name='UsingRegularExpressions'></a>Using Regular Expressions

You can use the `Pattern` and `Matcher` classes to work with regular expressions:

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

Pattern pattern = Pattern.compile("a*b");
Matcher matcher = pattern.matcher("aaaaab");

boolean matches = matcher.matches();  // Returns true
```

###  23.3. <a name='FindandReplace'></a>Find and Replace

You can find and replace substrings using regular expressions:

```java
String text = "My email is example@example.com";
String modifiedText = text.replaceAll("example@example\\.com", "test@test.com");
```

Regular expressions are a powerful tool for text processing, enabling complex pattern matching and manipulation.

---

##  24. <a name='Streams'></a>Streams

Streams in Java, introduced in Java 8, provide a powerful and flexible framework for processing sequences of elements (e.g., collections, arrays, or I/O channels) in a functional style. They are not data structures but abstractions that describe manipulations to be performed on the underlying data.

###  24.1. <a name='CreatingStreams'></a>Creating Streams

You can create streams from various data sources:

```java
import java.util.stream.Stream;
import java.util.Arrays;

// From an array
Stream<Integer> streamFromArray = Arrays.stream(new Integer[]{1, 2, 3});

// From individual elements
Stream<Integer> streamOfElements = Stream.of(1, 2, 3);
```

###  24.2. <a name='CommonOperations'></a>Common Operations

Here are some common stream operations:

* `filter`: Filters elements based on a predicate
* `map`: Transforms elements
* `collect`: Accumulates elements into a collection
* `forEach`: Performs an action for each element

```java
import java.util.List;
import java.util.stream.Collectors;

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
                                  .filter(n -> n % 2 == 0)
                                  .collect(Collectors.toList());
```

###  24.3. <a name='ParallelStreams'></a>Parallel Streams

Java Streams can also be parallelized to perform operations using multiple threads:

```java
List<Integer> result = numbers.parallelStream()
                              .map(n -> n * 2)
                              .collect(Collectors.toList());
```

---

##  25. <a name='FilesandIO'></a>Files and I/O

Java provides a rich set of APIs for file and I/O operations through packages like `java.io` and `java.nio.file`.

###  25.1. <a name='ReadingfromaFile'></a>Reading from a File

Here's how you can read from a text file using `BufferedReader`:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

###  25.2. <a name='WritingtoaFile'></a>Writing to a File

You can write to a text file using `BufferedWriter`:

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
    writer.write("Hello, world!");
} catch (IOException e) {
    e.printStackTrace();
}
```

###  25.3. <a name='NIO.2forFileOperations'></a>NIO.2 for File Operations

Java NIO.2 (`java.nio.file` package) provides more comprehensive and flexible file I/O operations:

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

Path filePath = Paths.get("file.txt");
List<String> lines = Files.readAllLines(filePath);
```

These classes provide a more modern approach to file manipulation, allowing for greater flexibility and offering features like file attributes and symbolic link handling.

---

##  26. <a name='ConcurrencyinJava'></a>Concurrency in Java

Java provides a rich set of features for concurrent programming.

###  26.1. <a name='Threads'></a>Threads

Java's primary unit of concurrency is the `Thread` (Go: Coroutines). Threads can be created by implementing the `Runnable` interface or extending the `Thread` class.

```java
Thread thread = new Thread(() -> {
    System.out.println("Thread is running");
});
thread.start();
```

###  26.2. <a name='BlockingQueue'></a>BlockingQueue

Java's `BlockingQueue` (Go: Channels) can be used as a way to safely pass data between threads.

```java
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
queue.put(1);  // Blocks if the queue is full
Integer value = queue.take();  // Blocks if the queue is empty
```

###  26.3. <a name='Executors'></a>Executors

Java doesn't have a `select` statement like Go, but you can achieve similar functionality using `ExecutorService`.

```java
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

ExecutorService executor = Executors.newFixedThreadPool(10);
executor.submit(() -> {
    // Some task
});
```

###  26.4. <a name='CountDownLatch'></a>CountDownLatch

`CountDownLatch` (Go: WaitGroup) is used to make a thread wait until other threads complete their tasks.

```java
import java.util.concurrent.CountDownLatch;

CountDownLatch latch = new CountDownLatch(3);  // 3 threads to wait for

// In each thread
latch.countDown();

// Wait for all to complete
latch.await();
```

###  26.5. <a name='SynchronizedLocks'></a>Synchronized, Locks

Java offers various mechanisms for mutual exclusion (Go: Mutex), including `synchronized` blocks and explicit locks like `ReentrantLock`.

```java
synchronized(myObject) {
    // Access shared resources
}
```

Or using `ReentrantLock`:

```java
import java.util.concurrent.locks.ReentrantLock;

ReentrantLock lock = new ReentrantLock();
lock.lock();
try {
    // Access shared resources
} finally {
    lock.unlock();
}
```

---

##  27. <a name='UnitTestsandOtherTesting'></a>Unit Tests and Other Testing

Java provides robust support for unit testing through libraries like JUnit.

###  27.1. <a name='BasicUnitTest'></a>Basic Unit Test

Here's a simple JUnit test:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }
}
```

###  27.2. <a name='Mocking'></a>Mocking

Libraries like Mockito are often used for mocking dependencies.

```java
import static org.mockito.Mockito.*;

public class UserServiceTest {
    @Test
    public void testGetUser() {
        UserRepository mockRepository = mock(UserRepository.class);
        when(mockRepository.findById(1)).thenReturn(new User(1, "Alice"));
        
        UserService service = new UserService(mockRepository);
        User user = service.getUserById(1);
        
        assertEquals("Alice", user.getName());
    }
}
```

###  27.3. <a name='Coverage'></a>Coverage

Test coverage tools like [JaCoCo](https://www.baeldung.com/jacoco) can be used to identify which parts of your codebase are not covered by your tests. Aim for **at least 80% coverage** for a well-tested application.

---

##  28. <a name='FunctionalProgramminginJava'></a>Functional Programming in Java

Java 8 introduced various features that enable functional programming styles.

###  28.1. <a name='LambdaExpressions'></a>Lambda Expressions

As covered earlier, lambdas allow for a concise way to create anonymous methods.

###  28.2. <a name='StreamsAPI'></a>Streams API

Streams provide a functional approach to processing collections.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3);
List<Integer> squares = numbers.stream()
                               .map(n -> n * n)
                               .collect(Collectors.toList());
```

###  28.3. <a name='Optional'></a>Optional

`Optional` is a container that may or may not contain a value, allowing you to better deal with cases with the absence of a value.

```java
Optional<String> optional = Optional.ofNullable(getStringThatMayBeNull());
String value = optional.orElse("default");
```

These features make it easier to write programs in a functional style, promoting immutability, and simpler data transformation.

---

##  29. <a name='FunctionalProgramminginJavaExtended'></a>Functional Programming in Java (Extended)

Let's dive deeper into the functional programming capabilities that were introduced in Java 8 and how they can be used effectively.

###  29.1. <a name='Higher-OrderFunctions'></a>Higher-Order Functions

In functional programming, functions are first-class citizens, meaning they can be passed as arguments to other functions. In Java, you can achieve this using functional interfaces like `Function`, `Predicate`, and `Consumer`.

```java
import java.util.function.Function;
import java.util.function.Predicate;

// Function from Integer to String
Function<Integer, String> intToString = Object::toString;
String result = intToString.apply(5);  // "5"

// Predicate to check for non-zero value
Predicate<Integer> isNonZero = (i) -> i != 0;
boolean nonZero = isNonZero.test(5);  // true
```

###  29.2. <a name='StreamOperations'></a>Stream Operations

Streams offer a range of functional-style operations for processing sequences of elements:

####  29.2.1. <a name='Filtering'></a>Filtering

Use the `filter` method to filter elements based on a condition.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
```

####  29.2.2. <a name='Mapping'></a>Mapping

The `map` method applies a function to each element.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3);
List<Integer> squares = numbers.stream()
                               .map(n -> n * n)
                               .collect(Collectors.toList());
```

####  29.2.3. <a name='Reducing'></a>Reducing

Use the `reduce` method to reduce a stream to a single value.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .reduce(0, Integer::sum);
```

####  29.2.4. <a name='FlatMapping'></a>Flat Mapping

The `flatMap` method is used to flatten nested collections.

```java
List<List<Integer>> nestedList = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5)
);
List<Integer> flatList = nestedList.stream()
                                   .flatMap(List::stream)
                                   .collect(Collectors.toList());
```

###  29.3. <a name='Immutability-1'></a>Immutability

Functional programming encourages the use of immutable data. While Java is not inherently an immutable language, you can design your classes to be immutable.

```java
public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

###  29.4. <a name='OptionalClass'></a>Optional Class

The `Optional` class helps you deal more gracefully with nullable values without having to explicitly do null checks.

```java
Optional<String> optional = Optional.of("value");

// Conditional execution
optional.ifPresent(value -> System.out.println("Value is present: " + value));

// Chaining methods
String finalValue = optional.map(String::toUpperCase)
                            .orElse("DEFAULT");
```

Java's functional features bring a lot of power and flexibility, allowing you to write more expressive, concise, and maintainable code.

---

##  30. <a name='Summary'></a>Summary

In this guide, we've covered a wide range of topics to give you a comprehensive understanding of Java programming essentials. We started with the basics, delving into the history of Java, how to run Java programs, and discussed modern and safe Java practices. We touched on fundamental building blocks like variables, types, scopes, and built-in operators.

We explored more advanced topics like conditionals, loops, functions, classes, and interfaces. Exception handling, generics, and annotations were also discussed to provide a well-rounded understanding of Java's capabilities. We dived into date, time, pattern matching, and regular expressions to handle specialized tasks.

The guide also covered concurrency in Java, comparing it with similar features in Go, and looked at unit testing and other forms of testing in Java. Finally, we took a deeper look into functional programming in Java, exploring higher-order functions, Stream operations, and immutability among others.

Java is a versatile and powerful language that continues to be relevant in today's software landscape, from enterprise applications to cloud computing and big data. With its strong type system, comprehensive standard library, and rich ecosystem of tools and libraries, Java offers something for everyone, whether you're a beginner or an experienced developer.

Thank you for joining me on this journey through Java programming essentials. I hope you found this guide informative and helpful in mastering Java.
