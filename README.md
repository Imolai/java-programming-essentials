# Java Programming Essentials

Programming guide about Java 20 essentials

## Contents

* 1. [About Java](#AboutJava)
* 2. [Running Java Programs](#RunningJavaPrograms)
	* 2.1. [Installing JDK](#InstallingJDK)
	* 2.2. [Writing and Running a Simple Java Program](#WritingandRunningaSimpleJavaProgram)
	* 2.3. [Using an IDE](#UsinganIDE)
* 3. [Modern and Safe Java Practices](#ModernandSafeJavaPractices)
	* 3.1. [Immutability](#Immutability)
	* 3.2. [Null Safety](#NullSafety)
	* 3.3. [Using Final Variables](#UsingFinalVariables)
	* 3.4. [Code Reviews and Static Analysis](#CodeReviewsandStaticAnalysis)
* 4. [Java Modules and Packages](#JavaModulesandPackages)
	* 4.1. [Packages](#Packages)
	* 4.2. [Modules (Java 9+)](#ModulesJava9)
* 5. [Basic Syntax](#BasicSyntax)
	* 5.1. [Comments](#Comments)
	* 5.2. [Identifiers and Keywords](#IdentifiersandKeywords)
	* 5.3. [Semicolons and Blocks](#SemicolonsandBlocks)
	* 5.4. [Whitespace and Indentation](#WhitespaceandIndentation)
	* 5.5. [Case Sensitivity](#CaseSensitivity)
* 6. [Constants](#Constants)
* 7. [Variables, Types](#VariablesTypes)
	* 7.1. [Primitives](#Primitives)
	* 7.2. [Arrays](#Arrays)
	* 7.3. [Maps](#Maps)
	* 7.4. [Strings](#Strings)
* 8. [Collections](#Collections)
	* 8.1. [Lists](#Lists)
	* 8.2. [Sets](#Sets)
	* 8.3. [Queues](#Queues)
	* 8.4. [Maps](#Maps-1)
* 9. [Scopes](#Scopes)
	* 9.1. [Local Scope](#LocalScope)
	* 9.2. [Instance Scope](#InstanceScope)
	* 9.3. [Class Scope (Static Scope)](#ClassScopeStaticScope)
	* 9.4. [Block Scope](#BlockScope)
* 10. [Builtin Operators and Functions](#BuiltinOperatorsandFunctions)
	* 10.1. [Arithmetic Operators](#ArithmeticOperators)
	* 10.2. [Comparison Operators](#ComparisonOperators)
	* 10.3. [Logical Operators](#LogicalOperators)
	* 10.4. [Bitwise Operators](#BitwiseOperators)
* 11. [Conditionals and Looping](#ConditionalsandLooping)
	* 11.1. [Conditionals](#Conditionals)
	* 11.2. [Looping](#Looping)
* 12. [Functions](#Functions)
	* 12.1. [Function Declaration and Calling](#FunctionDeclarationandCalling)
	* 12.2. [Function Overloading](#FunctionOverloading)
	* 12.3. [Variable Arguments](#VariableArguments)
* 13. [Classes](#Classes)
	* 13.1. [Defining a Class](#DefiningaClass)
	* 13.2. [Creating an Object](#CreatinganObject)
	* 13.3. [Accessing Fields and Methods](#AccessingFieldsandMethods)
* 14. [Interfaces](#Interfaces)
	* 14.1. [Defining an Interface](#DefininganInterface)
	* 14.2. [Implementing an Interface](#ImplementinganInterface)
	* 14.3. [Using an Interface](#UsinganInterface)
* 15. [Exceptions](#Exceptions)
	* 15.1. [Types of Exceptions](#TypesofExceptions)
	* 15.2. [Basic Exception Handling](#BasicExceptionHandling)
	* 15.3. [Finally Block](#FinallyBlock)
* 16. [Generics](#Generics)
	* 16.1. [Basic Usage](#BasicUsage)
	* 16.2. [Bounded Type Parameters](#BoundedTypeParameters)
	* 16.3. [Wildcards](#Wildcards)
* 17. [Lambdas](#Lambdas)
	* 17.1. [Basic Syntax](#BasicSyntax-1)
	* 17.2. [Using Lambdas with Functional Interfaces](#UsingLambdaswithFunctionalInterfaces)
	* 17.3. [Method References](#MethodReferences)
* 18. [Annotations](#Annotations)
	* 18.1. [Built-In Annotations](#Built-InAnnotations)
	* 18.2. [Custom Annotations](#CustomAnnotations)
* 19. [Date, Time](#DateTime)
	* 19.1. [LocalDate](#LocalDate)
	* 19.2. [LocalTime](#LocalTime)
	* 19.3. [LocalDateTime](#LocalDateTime)
	* 19.4. [Formatting and Parsing](#FormattingandParsing)
* 20. [Pattern Matching, Regular Expressions](#PatternMatchingRegularExpressions)
	* 20.1. [Basic Syntax](#BasicSyntax-1)
	* 20.2. [Using Regular Expressions](#UsingRegularExpressions)
	* 20.3. [Find and Replace](#FindandReplace)
* 21. [Streams](#Streams)
	* 21.1. [Creating Streams](#CreatingStreams)
	* 21.2. [Common Operations](#CommonOperations)
	* 21.3. [Parallel Streams](#ParallelStreams)
* 22. [Files and I/O](#FilesandIO)
	* 22.1. [Reading from a File](#ReadingfromaFile)
	* 22.2. [Writing to a File](#WritingtoaFile)
	* 22.3. [NIO.2 for File Operations](#NIO.2forFileOperations)
* 23. [Concurrency in Java](#ConcurrencyinJava)
	* 23.1. [Threads (Go: Coroutines)](#ThreadsGo:Coroutines)
	* 23.2. [BlockingQueue (Go: Channels)](#BlockingQueueGo:Channels)
	* 23.3. [Executors (Go: Select)](#ExecutorsGo:Select)
	* 23.4. [CountDownLatch (Go: WaitGroup)](#CountDownLatchGo:WaitGroup)
	* 23.5. [Synchronized, Locks (Go: Mutex)](#SynchronizedLocksGo:Mutex)
* 24. [Unit Tests and Other Testing](#UnitTestsandOtherTesting)
	* 24.1. [Basic Unit Test](#BasicUnitTest)
	* 24.2. [Mocking](#Mocking)
* 25. [Functional Programming in Java](#FunctionalProgramminginJava)
	* 25.1. [Lambda Expressions](#LambdaExpressions)
	* 25.2. [Streams API](#StreamsAPI)
	* 25.3. [Optional](#Optional)
* 26. [Functional Programming in Java (Extended)](#FunctionalProgramminginJavaExtended)
	* 26.1. [Higher-Order Functions](#Higher-OrderFunctions)
	* 26.2. [Stream Operations](#StreamOperations)
		* 26.2.1. [Filtering](#Filtering)
		* 26.2.2. [Mapping](#Mapping)
		* 26.2.3. [Reducing](#Reducing)
		* 26.2.4. [Flat Mapping](#FlatMapping)
	* 26.3. [Immutability](#Immutability-1)
	* 26.4. [Optional Class](#OptionalClass)
* 27. [Summary](#Summary)

---

##  1. <a name='AboutJava'></a>About Java

Java is a high-level, object-oriented programming language developed by Sun Microsystems, which is now owned by Oracle Corporation. It was initially released in 1995 and has since become one of the most widely-used programming languages in the world. Java is platform-independent, meaning code written in Java can run on any device that has a Java Virtual Machine (JVM).

The language is known for its portability, security features, and strong community support. It's commonly used in various domains, including web development, mobile application development (Android), enterprise applications, and even in Internet of Things (IoT) devices.

Java has gone through numerous updates and versions. As of the time of writing, Java 20 is the latest version, featuring modern constructs and syntactical sugar to make Java code more expressive and easier to read.

The most importank links:

1. [Learn Java](https://dev.java/learn/)
2. [Java Downloads](https://www.oracle.com/java/technologies/downloads/)
3. [OpenJDK](https://openjdk.org/)
4. [Java 20 API Docs](https://docs.oracle.com/en/java/javase/20/docs/api/index.html)
5. [Java Documentation](https://docs.oracle.com/en/java/)
6. [Java FAQ](https://dev.java/learn/faq/)

---

##  2. <a name='RunningJavaPrograms'></a>Running Java Programs

To run Java programs, you'll need two main components:

1. **JDK (Java Development Kit)**: This includes the JRE (Java Runtime Environment) and development tools like the compiler (`javac`).
2. **IDE (Integrated Development Environment)**: This is optional but recommended. Popular IDEs for Java development include IntelliJ IDEA, Eclipse, and NetBeans.

###  2.1. <a name='InstallingJDK'></a>Installing JDK

1. Download the latest JDK from the official Oracle website or through package managers on Linux.
2. Install it and set up the environment variables.

###  2.2. <a name='WritingandRunningaSimpleJavaProgram'></a>Writing and Running a Simple Java Program

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

    ```
    javac HelloWorld.java
    ```

    This will generate a `HelloWorld.class` file.
4. Run the compiled class file:

    ```
    java HelloWorld
    ```

    You should see the output `Hello, World!` printed to the terminal.

###  2.3. <a name='UsinganIDE'></a>Using an IDE

If you're using an IDE, the process is simplified:

1. Create a new Java project.
2. Add a new Java class named `HelloWorld`.
3. Write the same code as above.
4. Click the "Run" button.

---

##  3. <a name='ModernandSafeJavaPractices'></a>Modern and Safe Java Practices

Modern Java development encourages a set of best practices to write efficient, maintainable, and secure code. Some of these practices include:

###  3.1. <a name='Immutability'></a>Immutability

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

###  3.2. <a name='NullSafety'></a>Null Safety

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

###  3.3. <a name='UsingFinalVariables'></a>Using Final Variables

Marking variables with `final` ensures that they can't be reassigned, making the code easier to understand.

```java
public void calculateArea(final double radius) {
    final double area = Math.PI * Math.pow(radius, 2);
    System.out.println("Area is: " + area);
}
```

###  3.4. <a name='CodeReviewsandStaticAnalysis'></a>Code Reviews and Static Analysis

Tools like [SonarQube](https://www.sonarsource.com/products/sonarqube/) and regular peer reviews can help maintain a high code quality.

---

##  4. <a name='JavaModulesandPackages'></a>Java Modules and Packages

Modules and packages are ways to organize your Java code. They help manage dependencies and improve code reusability.

###  4.1. <a name='Packages'></a>Packages

Packages are namespaces that organize classes and interfaces. The package declaration should be the first statement in a Java source file.

```java
package com.example.hello;
```

To use classes from other packages, you'll need to import them:

```java
import java.util.List;
```

###  4.2. <a name='ModulesJava9'></a>Modules (Java 9+)

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

##  5. <a name='BasicSyntax'></a>Basic Syntax

Java's syntax might look familiar if you've worked with C, C++, or other C-family languages. However, Java has its unique set of rules and constructs. Let's look at some of the essential elements:

###  5.1. <a name='Comments'></a>Comments

Java supports single-line and multi-line comments:

```java
// This is a single-line comment

/*
  This is a 
  multi-line comment
*/
```

###  5.2. <a name='IdentifiersandKeywords'></a>Identifiers and Keywords

Java identifiers are used for class names, method names, and variables. They must start with a letter, underscore (`_`), or dollar sign (`$`); subsequent characters can be digits.

```java
int myVariable;  // valid
int 123abc;      // invalid
```

Java also has a set of reserved keywords like `class`, `int`, `return`, etc., which cannot be used as identifiers.

###  5.3. <a name='SemicolonsandBlocks'></a>Semicolons and Blocks

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

###  5.4. <a name='WhitespaceandIndentation'></a>Whitespace and Indentation

Java is whitespace-insensitive, but proper indentation is crucial for readability:

```java
int x=10; int y=20;  // valid but not recommended
```

###  5.5. <a name='CaseSensitivity'></a>Case Sensitivity

Java is case-sensitive, which means `Variable` and `variable` are different identifiers.

---

##  6. <a name='Constants'></a>Constants

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

##  7. <a name='VariablesTypes'></a>Variables, Types

In Java, variables are used to store data that can be used and manipulated throughout a program. The type of a variable determines the size and layout of the variable's memory, the range of values that can be stored, and the set of operations that can be applied.

###  7.1. <a name='Primitives'></a>Primitives

Java has 8 primitive types: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.

```java
int age = 30;
double salary = 55000.50;
boolean isActive = true;
char grade = 'A';
```

###  7.2. <a name='Arrays'></a>Arrays

Arrays are used to store multiple values of the same type:

```java
int[] numbers = new int[5];
numbers[0] = 1;
```

Or using shorthand:

```java
int[] numbers = {1, 2, 3, 4, 5};
```

###  7.3. <a name='Maps'></a>Maps

Java provides map implementations through the `Map` interface, most notably `HashMap`:

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> studentGrades = new HashMap<>();
studentGrades.put("Alice", 90);
```

###  7.4. <a name='Strings'></a>Strings

Strings are immutable sequences of characters:

```java
String name = "John";
String greeting = "Hello, " + name;
```

---

##  8. <a name='Collections'></a>Collections

Java offers a rich set of collection classes that implement commonly used data structures like lists, sets, and queues. These classes are part of the [Java Collections Framework (JCF)](https://dev.java/learn/api/collections-framework/).

###  8.1. <a name='Lists'></a>Lists

Lists are ordered collections that can contain duplicate elements:

```java
import java.util.ArrayList;
import java.util.List;

List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
```

###  8.2. <a name='Sets'></a>Sets

Sets are collections that cannot contain duplicate elements:

```java
import java.util.HashSet;
import java.util.Set;

Set<Integer> uniqueNumbers = new HashSet<>();
uniqueNumbers.add(1);
uniqueNumbers.add(2);
uniqueNumbers.add(1);  // Will not be added
```

###  8.3. <a name='Queues'></a>Queues

Queues follow the First-In-First-Out (FIFO) principle:

```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> tasks = new LinkedList<>();
tasks.offer("Read");
tasks.offer("Write");
```

###  8.4. <a name='Maps-1'></a>Maps

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

##  9. <a name='Scopes'></a>Scopes

In Java, the concept of scope refers to the region of code where a variable is accessible. Understanding scope is crucial for writing effective and bug-free programs. Here are the main types of scopes:

###  9.1. <a name='LocalScope'></a>Local Scope

Variables declared within a method are accessible only within that method:

```java
public void showLocalScope() {
    int localVariable = 10;  // Accessible only within this method
    System.out.println(localVariable);
}
```

###  9.2. <a name='InstanceScope'></a>Instance Scope

Variables declared within a class but outside any method are instance variables. They are accessible from all methods of the class:

```java
public class MyClass {
    int instanceVariable = 20;  // Accessible within all methods of this class
    
    public void showInstanceVariable() {
        System.out.println(instanceVariable);  // Accessible here
    }
}
```

###  9.3. <a name='ClassScopeStaticScope'></a>Class Scope (Static Scope)

Variables declared as `static` within a class are class variables. They are shared among all instances of the class:

```java
public class MyClass {
    static int classVariable = 30;  // Shared among all instances
    
    public void showClassVariable() {
        System.out.println(classVariable);  // Accessible here
    }
}
```

###  9.4. <a name='BlockScope'></a>Block Scope

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

##  10. <a name='BuiltinOperatorsandFunctions'></a>Builtin Operators and Functions

Java provides a variety of built-in operators for performing operations like arithmetic, comparison, and logical operations. Here's a quick rundown:

###  10.1. <a name='ArithmeticOperators'></a>Arithmetic Operators

```java
int sum = 3 + 2;     // Addition
int diff = 5 - 3;    // Subtraction
int prod = 4 * 3;    // Multiplication
int quot = 8 / 2;    // Division
int rem = 9 % 2;     // Remainder
```

###  10.2. <a name='ComparisonOperators'></a>Comparison Operators

```java
boolean isEqual = (5 == 5);      // Equal to
boolean isNotEqual = (5 != 4);   // Not equal to
boolean isGreater = (5 > 4);     // Greater than
// And so on...
```

###  10.3. <a name='LogicalOperators'></a>Logical Operators

```java
boolean andResult = (true && false);  // Logical AND
boolean orResult = (true || false);   // Logical OR
boolean notResult = !true;            // Logical NOT
```

###  10.4. <a name='BitwiseOperators'></a>Bitwise Operators

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

##  11. <a name='ConditionalsandLooping'></a>Conditionals and Looping

Decision-making and iteration are core aspects of any programming language. Java provides various constructs to handle these tasks.

###  11.1. <a name='Conditionals'></a>Conditionals

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

###  11.2. <a name='Looping'></a>Looping

Java provides several types of loops, including `for`, `while`, and `do-while`:

```java
// For loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// While loop
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

// Do-while loop
i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

##  12. <a name='Functions'></a>Functions

Functions in Java are defined using the `void` keyword for functions that don't return a value, or the type of the return value for functions that do. Functions can also accept parameters.

###  12.1. <a name='FunctionDeclarationandCalling'></a>Function Declaration and Calling

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

###  12.2. <a name='FunctionOverloading'></a>Function Overloading

Java allows function overloading, where multiple functions can have the same name but different parameter lists:

```java
public static int addNumbers(int a, int b) {
    return a + b;
}

public static double addNumbers(double a, double b) {
    return a + b;
}
```

###  12.3. <a name='VariableArguments'></a>Variable Arguments

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

##  13. <a name='Classes'></a>Classes

In Java, classes serve as the blueprint for creating objects. A class defines the properties (fields) and behaviors (methods) that its objects will have.

###  13.1. <a name='DefiningaClass'></a>Defining a Class

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

###  13.2. <a name='CreatinganObject'></a>Creating an Object

To create an object of the class, you use the `new` keyword:

```java
Person person = new Person("Alice", 30);
```

###  13.3. <a name='AccessingFieldsandMethods'></a>Accessing Fields and Methods

After creating an object, you can access its fields and methods:

```java
System.out.println(person.name);  // Output: Alice
person.introduce();               // Output: Hello, my name is Alice and I am 30 years old.
```

---

##  14. <a name='Interfaces'></a>Interfaces

Interfaces in Java are used to define a contract that classes must adhere to. They can contain method signatures, default methods, and static methods. However, they cannot contain instance variables.

###  14.1. <a name='DefininganInterface'></a>Defining an Interface

Here's a simple interface for a `Drawable` object:

```java
public interface Drawable {
    void draw();  // Method signature
}
```

###  14.2. <a name='ImplementinganInterface'></a>Implementing an Interface

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

###  14.3. <a name='UsinganInterface'></a>Using an Interface

Once a class implements an interface, you can use it as an instance of that interface:

```java
Drawable drawable = new Circle(5);
drawable.draw();  // Output: Drawing a circle with radius 5
```

Interfaces are a powerful feature in Java, allowing for abstraction, multiple inheritance through the use of multiple interfaces, and providing a way to share common methods across unrelated class hierarchies.

---

##  15. <a name='Exceptions'></a>Exceptions

Exceptions in Java are events that disrupt the normal flow of a program's instructions. Java provides a robust exception-handling mechanism to manage runtime errors, so your program can continue to operate in a controlled manner.

###  15.1. <a name='TypesofExceptions'></a>Types of Exceptions

Java exceptions are divided into two categories:

1. **Checked Exceptions**: These are exceptions that a method is expected to catch and handle. Examples include `IOException`, `SQLException`, etc.
2. **Unchecked Exceptions**: These are exceptions that occur due to errors in code logic. Examples include `NullPointerException`, `ArithmeticException`, etc.

###  15.2. <a name='BasicExceptionHandling'></a>Basic Exception Handling

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

###  15.3. <a name='FinallyBlock'></a>Finally Block

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

##  16. <a name='Generics'></a>Generics

Generics enable you to write code that is type-safe while being reusable. With generics, you can define classes, interfaces, and methods where the type of data operated upon is specified as a parameter.

###  16.1. <a name='BasicUsage'></a>Basic Usage

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

###  16.2. <a name='BoundedTypeParameters'></a>Bounded Type Parameters

You can restrict the types that can be used with a generic class or method. For example, to allow only numbers:

```java
public class NumberBox<T extends Number> {
    private T content;
    // ...
}
```

Now, only `Number` and its subclasses can be used with `NumberBox`.

###  16.3. <a name='Wildcards'></a>Wildcards

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

##  17. <a name='Lambdas'></a>Lambdas

Lambda expressions, introduced in Java 8, allow you to write instances of single-method interfaces (functional interfaces) in a much more concise, expressive, and readable way. They are used primarily to define inline implementation of a functional interface.

###  17.1. <a name='BasicSyntax-1'></a>Basic Syntax

The basic syntax of a lambda is either `(parameters) -> expression` or `(parameters) -> { statements; }`.

For example, here's a lambda expression that takes two integers and returns their sum:

```java
(a, b) -> a + b
```

###  17.2. <a name='UsingLambdaswithFunctionalInterfaces'></a>Using Lambdas with Functional Interfaces

Java 8 introduces the concept of functional interfaces, which are interfaces with just one abstract method. Lambda expressions can be used as instances of a functional interface.

Here's how you can use lambdas with the `Runnable` interface:

```java
Runnable run = () -> System.out.println("Hello, world!");
new Thread(run).start();
```

###  17.3. <a name='MethodReferences'></a>Method References

Method references provide a shorthand notation of a lambda expression to call a method:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(System.out::println);
```

---

##  18. <a name='Annotations'></a>Annotations

Annotations provide metadata about the program elements they annotate. Java has built-in annotations like `@Override`, `@Deprecated`, and `@SuppressWarnings`, and you can also define custom annotations.

###  18.1. <a name='Built-InAnnotations'></a>Built-In Annotations

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

###  18.2. <a name='CustomAnnotations'></a>Custom Annotations

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

##  19. <a name='DateTime'></a>Date, Time

Java provides a comprehensive date and time API through the `java.time` package, introduced in Java 8. This package provides classes like `LocalDate`, `LocalTime`, and `LocalDateTime`, among others, to help you represent and manipulate date and time in a type-safe manner.

###  19.1. <a name='LocalDate'></a>LocalDate

`LocalDate` represents a date without a time or time zone:

```java
import java.time.LocalDate;

LocalDate today = LocalDate.now();
LocalDate firstDayOfMonth = today.withDayOfMonth(1);
```

###  19.2. <a name='LocalTime'></a>LocalTime

`LocalTime` represents time without a date or time zone:

```java
import java.time.LocalTime;

LocalTime now = LocalTime.now();
LocalTime midday = LocalTime.of(12, 0);
```

###  19.3. <a name='LocalDateTime'></a>LocalDateTime

`LocalDateTime` is a composite of `LocalDate` and `LocalTime`:

```java
import java.time.LocalDateTime;

LocalDateTime currentDateTime = LocalDateTime.now();
```

###  19.4. <a name='FormattingandParsing'></a>Formatting and Parsing

You can format and parse dates and times using `DateTimeFormatter`:

```java
import java.time.format.DateTimeFormatter;

LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formattedDateTime = now.format(formatter);
```

---

##  20. <a name='PatternMatchingRegularExpressions'></a>Pattern Matching, Regular Expressions

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

###  20.1. <a name='BasicSyntax-1'></a>Basic Syntax

The basic syntax for a regular expression pattern involves special characters like `*`, `+`, `.`, `?`, etc., to describe the pattern.

* `.`: Any character
* `*`: Zero or more of the previous element
* `+`: One or more of the previous element
* `?`: Zero or one of the previous element

###  20.2. <a name='UsingRegularExpressions'></a>Using Regular Expressions

You can use the `Pattern` and `Matcher` classes to work with regular expressions:

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

Pattern pattern = Pattern.compile("a*b");
Matcher matcher = pattern.matcher("aaaaab");

boolean matches = matcher.matches();  // Returns true
```

###  20.3. <a name='FindandReplace'></a>Find and Replace

You can find and replace substrings using regular expressions:

```java
String text = "My email is example@example.com";
String modifiedText = text.replaceAll("example@example\\.com", "test@test.com");
```

Regular expressions are a powerful tool for text processing, enabling complex pattern matching and manipulation.

---

##  21. <a name='Streams'></a>Streams

Streams in Java, introduced in Java 8, provide a powerful and flexible framework for processing sequences of elements (e.g., collections, arrays, or I/O channels) in a functional style. They are not data structures but abstractions that describe manipulations to be performed on the underlying data.

###  21.1. <a name='CreatingStreams'></a>Creating Streams

You can create streams from various data sources:

```java
import java.util.stream.Stream;
import java.util.Arrays;

// From an array
Stream<Integer> streamFromArray = Arrays.stream(new Integer[]{1, 2, 3});

// From individual elements
Stream<Integer> streamOfElements = Stream.of(1, 2, 3);
```

###  21.2. <a name='CommonOperations'></a>Common Operations

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

###  21.3. <a name='ParallelStreams'></a>Parallel Streams

Java Streams can also be parallelized to perform operations using multiple threads:

```java
List<Integer> result = numbers.parallelStream()
                              .map(n -> n * 2)
                              .collect(Collectors.toList());
```

---

##  22. <a name='FilesandIO'></a>Files and I/O

Java provides a rich set of APIs for file and I/O operations through packages like `java.io` and `java.nio.file`.

###  22.1. <a name='ReadingfromaFile'></a>Reading from a File

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

###  22.2. <a name='WritingtoaFile'></a>Writing to a File

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

###  22.3. <a name='NIO.2forFileOperations'></a>NIO.2 for File Operations

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

##  23. <a name='ConcurrencyinJava'></a>Concurrency in Java

Java provides a rich set of features for concurrent programming.

###  23.1. <a name='ThreadsGo:Coroutines'></a>Threads (Go: Coroutines)

Java's primary unit of concurrency is the `Thread`. Threads can be created by implementing the `Runnable` interface or extending the `Thread` class.

```java
Thread thread = new Thread(() -> {
    System.out.println("Thread is running");
});
thread.start();
```

###  23.2. <a name='BlockingQueueGo:Channels'></a>BlockingQueue (Go: Channels)

Java's `BlockingQueue` can be used as a way to safely pass data between threads.

```java
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
queue.put(1);  // Blocks if the queue is full
Integer value = queue.take();  // Blocks if the queue is empty
```

###  23.3. <a name='ExecutorsGo:Select'></a>Executors (Go: Select)

Java doesn't have a `select` statement like Go, but you can achieve similar functionality using `ExecutorService`.

```java
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

ExecutorService executor = Executors.newFixedThreadPool(10);
executor.submit(() -> {
    // Some task
});
```

###  23.4. <a name='CountDownLatchGo:WaitGroup'></a>CountDownLatch (Go: WaitGroup)

`CountDownLatch` is used to make a thread wait until other threads complete their tasks.

```java
import java.util.concurrent.CountDownLatch;

CountDownLatch latch = new CountDownLatch(3);  // 3 threads to wait for

// In each thread
latch.countDown();

// Wait for all to complete
latch.await();
```

###  23.5. <a name='SynchronizedLocksGo:Mutex'></a>Synchronized, Locks (Go: Mutex)

Java offers various mechanisms for mutual exclusion, including `synchronized` blocks and explicit locks like `ReentrantLock`.

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

##  24. <a name='UnitTestsandOtherTesting'></a>Unit Tests and Other Testing

Java provides robust support for unit testing through libraries like JUnit.

###  24.1. <a name='BasicUnitTest'></a>Basic Unit Test

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

###  24.2. <a name='Mocking'></a>Mocking

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

---

##  25. <a name='FunctionalProgramminginJava'></a>Functional Programming in Java

Java 8 introduced various features that enable functional programming styles.

###  25.1. <a name='LambdaExpressions'></a>Lambda Expressions

As covered earlier, lambdas allow for a concise way to create anonymous methods.

###  25.2. <a name='StreamsAPI'></a>Streams API

Streams provide a functional approach to processing collections.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3);
List<Integer> squares = numbers.stream()
                               .map(n -> n * n)
                               .collect(Collectors.toList());
```

###  25.3. <a name='Optional'></a>Optional

`Optional` is a container that may or may not contain a value, allowing you to better deal with cases with the absence of a value.

```java
Optional<String> optional = Optional.ofNullable(getStringThatMayBeNull());
String value = optional.orElse("default");
```

These features make it easier to write programs in a functional style, promoting immutability, and simpler data transformation.

---

##  26. <a name='FunctionalProgramminginJavaExtended'></a>Functional Programming in Java (Extended)

Let's dive deeper into the functional programming capabilities that were introduced in Java 8 and how they can be used effectively.

###  26.1. <a name='Higher-OrderFunctions'></a>Higher-Order Functions

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

###  26.2. <a name='StreamOperations'></a>Stream Operations

Streams offer a range of functional-style operations for processing sequences of elements:

####  26.2.1. <a name='Filtering'></a>Filtering

Use the `filter` method to filter elements based on a condition.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
```

####  26.2.2. <a name='Mapping'></a>Mapping

The `map` method applies a function to each element.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3);
List<Integer> squares = numbers.stream()
                               .map(n -> n * n)
                               .collect(Collectors.toList());
```

####  26.2.3. <a name='Reducing'></a>Reducing

Use the `reduce` method to reduce a stream to a single value.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .reduce(0, Integer::sum);
```

####  26.2.4. <a name='FlatMapping'></a>Flat Mapping

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

###  26.3. <a name='Immutability-1'></a>Immutability

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

###  26.4. <a name='OptionalClass'></a>Optional Class

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

##  27. <a name='Summary'></a>Summary

In this guide, we've covered a wide range of topics to give you a comprehensive understanding of Java programming essentials. We started with the basics, delving into the history of Java, how to run Java programs, and discussed modern and safe Java practices. We touched on fundamental building blocks like variables, types, scopes, and built-in operators.

We explored more advanced topics like conditionals, loops, functions, classes, and interfaces. Exception handling, generics, and annotations were also discussed to provide a well-rounded understanding of Java's capabilities. We dived into date, time, pattern matching, and regular expressions to handle specialized tasks.

The guide also covered concurrency in Java, comparing it with similar features in Go, and looked at unit testing and other forms of testing in Java. Finally, we took a deeper look into functional programming in Java, exploring higher-order functions, Stream operations, and immutability among others.

Java is a versatile and powerful language that continues to be relevant in today's software landscape, from enterprise applications to cloud computing and big data. With its strong type system, comprehensive standard library, and rich ecosystem of tools and libraries, Java offers something for everyone, whether you're a beginner or an experienced developer.

Thank you for joining me on this journey through Java programming essentials. I hope you found this guide informative and helpful in mastering Java.
