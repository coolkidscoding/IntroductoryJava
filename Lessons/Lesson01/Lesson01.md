
# [Cool Kids Coding School](https://www,coolkidscodingschool.com)

![CKCS logo >](./images/ckcslogo.png)
</br>

## Course: **Introductory Java**

### Lesson 1: **Introduction to Java**

---
</br>

## What is Java?

Java is an objected oriented language.

Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. 

![James Gosling >](./images/gosling.jpeg)

Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java.

## Deconstructing HelloWorld.java

    class Simple{  
        public static void main(String args[]){  
         System.out.println("Hello Java");  
        }  
    }  

To compile:

    javac Simple.java

To Execute:

    java Simple

+ _class_ Keyword is used to declare class in Java.
+ _public_ keyword is used to access modifier that represents visibility.
+ _static_ is a keyword.  THe core advantage of a static method is that there is no need to create an object to invoke the static method.
+ _void_ is the return type of the method.
+ _main_ represents the staring point of the program.
+ _String[] args_ is used for command line argument.
+ _System.out.println()_ is a print statement.

## Comments

There are three types of comments in Java:

+ Single line comment
+ Multi Line Comment
+ Documentation Comment

### Single Line

    // Single Line Comment

### Multi Line

    /* 
        Comment
        Comment
    */

### Documentation Comment

    /** 
        Documentation 
        Documentation
    */

## Java Variables

A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.

Variable is a name of memory location. There are three types of variables in java: local, instance and static.

There are two types of data types in Java: primitive and non-primitive.

### Primitive Data Types

There are 8 primitive data types.

+ boolean
+ byte
+ char
+ short
+ int
+ long
+ float
+ double

| Data Type |Default Value |Default size|
|---------------|---------------|------------|
|boolean |false |1 bit|
|char |'\u0000' |2 byte|
|byte |0 |1 byte|
|short |0 |2 byte|
|int |0 |4 byte|
|long |0L |8 byte|
|float |0.0f |4 byte|
|double |0.0d |8 byte|

### Operators in Java

|Operator Type|Category|Precedence|
|-------------|--------|----------|
|Unary        |postfix |expr++ expr--|
|             | prefix |++expr --expr|
|Arithmetic   | multiplicative| * / % |
|             | additive      | + -   |
|Logical      | AND | && |
|             | OR | || |
| Ternary     | ternary | ? : |
| Assignment  | assignment | = += -= *= /= |

## Control Statements

### Simple if

    if (condition) {
        statment ;
    }

### if-else statement

    if (condition) {
        statement ;
    } else {
        statement ;
    }

### if-else ladder

    if (condition) {
        statement ; 
    } else if (condition) {
        statment;
    } else {
        statement ;
    }

### switch statment

    switch (expression) {
        case value:
            statement ;
            break ;
        case value:
            statement ;
            break ;
        ...
        default:
            statement ;
    }

## Loop Statements

### for loop

    for (intialization,condition,increment/decrement) {
        statement ;
    }

### for-each loop

    for (data_type var: array_name/collection_name) {
        statement ;
    }

### while loop

    while (condition) {
        statement ;
    }

### do-while loop

    do 
    {
        statement ;
    } while (condition);

## String Class

In Java, string is an object that represents a sequence of char values.

    String s="Learning Java";

or

    String s=new String("Learning Java");

_Java String_ class provides a lot of methods to perform operations on strings such as _compare()_, _concat()_, _equals()_, _length()_.

Once a String object is created its data or state can't be changed but a new String object is created.

### Comparing Strings

Using _.equals()_ compares the contents of the string.  Using _==_ compares the reference that each string is refered by.

## Java Arrays

Java Array is an object which contains elements of a similar data type.  Additionally elements of an array are stored in a contiguous memory location.  We can store only a fixed set of elements in Java Array.

Indexing into Arrays is similar to other languages.  The starting index is 0 and the length of the Array can be identified using the _length_ member.

We can declare and instantiate an Array like this:

    int a[] = new int[5];

We can declare, instantiate and intialize an Array like this:

    int a[] = {33,3,4,5};

## Java ArrayLists

When we work with arrays in Java, we've been limited by the fact that once an array is created,it has a fixed size.  We can't add or remove elements.

To get around this we can create _ArrayList_s

To be able to utilize _ArrayLists_ we have to import the package that defines them.

    import java.util.ArrayList;

    ArrayList<String> toDoList = new ArrayList<String>;

    todoList.add("Laundry");

    todoList.size();

    todoList.get(0);
    todoList.set(0, "Cook");
    todoList.remove(1);

---

##### **Cool Kids Coding School 2022, for any questions or comments contact info@coolkidscodingschool.com**
