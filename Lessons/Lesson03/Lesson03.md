
# [Cool Kids Coding School](https://www,coolkidscodingschool.com)

![CKCS logo >](./images/ckcslogo.png)
</br>

## Course: **Introductory Java**

### Lesson 3: **Introduction to OOP **

---
</br>

## What is Object Oriented Programming?

Java is an objected oriented language.  It allows users to model real world objects in code.  The main aim of OOP is to bind together data and functions into one unit.

A _class_ is a template for an object and an _object_ is an instance of a class.
When an object is created it inherits all the methods and data from its class.

## Create a simple class

    class SimpleObject{
        int x = 5;

        int Add1(int x) {
            return this.x += x;
        }

        static int Add2(int x, int y) {
            return x + y;
        }

        public static void main(String args[]){  
            SimpleObject obj = new SimpleObject();
            System.out.println(obj.x);  

            System.out.println(obj.Add1(10));
            System.out.println(SimpleObject.Add2(10, 12));
        }  
    }  

## Static vs Non-Static

The keyword _static_ is a modifier that allows a user to call a method of a class without instantiating an actual class.

![Method Declaration](./images/methods-in-java.png)

### Constructors

A class constructor is a special method that is used to initialize an object.  The constructor is called when an object is created.  It is not not necessary to create a constructor.  If one is not provided then the compiler will create one by default.  Constructors can be with or without parameters.

    class SimpleObject2 {
        int x;

        SimpleObject() {
            x = 5;
        }

        SimpleObject(int y) {
            x = y;
        }

        SimpleObject(SimpleObject obj) {
            x = obj.x;
        }

        public static void main(String[] args) {
            SimpleObject2 obj2 = new SimpleObject2();
            System.out.println(obj2.x);

            SimpleObject2 obj2_1 = new SimpleObject2(10);
            System.out.println(obj2_1.x);
        }
    }

### Modifiers

![Modifiers](./images/Access-Modifiers-in-Java.png)

The _public_ keyword is used as an access modifier.  It is used to set the access level for classes, attributes, methods, and constructors.

For classes you can use the following modifiers: 

+ _public_ The class is accessible by any other class.
+ __default__ The class is only accessible by classes in the same package.  You get the default modifier when you dont specify a modifier.

For attributes, methods and constructors, you can use one of the following:

+ _public_ The code is accessible for all classes.
+ _private_ The code is only accessible within the declared class.
+ __default__ The code is accessible in the same package.
+ _protected_ The code is accessible is the same package and subclasses.

### Encapsulation

Encapsulation is one of the fundamental priciples of OOP.  The meaning of encapsulation is to make sure that "sensitive" data is hidden from users.  To achieve this, you must:

+ declare class variables/attributes as private
+ provide public __get__ and __set__ methods to access and update the value of a private variable.

### Inheritance

Inheritance is another important principle of OOP.  It is the mechanism in java where one class is allowed to inherit the features (attributes and methods) of another class.

Important terms to be aware of:
 
+ SuperClass: The class whose featuers are inherited from.  Also known as the parent or base class.
+ SubClass: The class that inherits from another class.  Also known as the derived or child class.

        class derived-class extends base-class {
            // methods and fields
        }
---

##### **Cool Kids Coding School 2022, for any questions or comments contact info@coolkidscodingschool.com**
