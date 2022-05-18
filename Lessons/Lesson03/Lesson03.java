/* 
    Code File Exhibit : Introduction to Object Oriented Programming
*/
import package1.*;
import package2.*;

// Topics to discuss
// Packages
// Object Oriented Concepts
// Methods
//  signature of a method
//  overloading of a method
//  static methods
// Attributes
//  static attributes
// Constructors
//  default
//  this
// Modifiers
// Encapsulation 
// Inheritance
//  super
//  base class instantiation

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
}
public class Lesson03 {

    public static void main(String args[])
    {
        System.out.println("Welcome to the wonderful world of Object Oriented Programming!");

        // packages
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        c1.DoSomething();
        c2.DoSomething();
    }

}