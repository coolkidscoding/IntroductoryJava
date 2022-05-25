/* 
    Code File Exhibit : Introduction to Object Oriented Programming
*/
import package1.*;
import package2.*;

class Animal {
    // attributes
    String fur_color;
    int num_legs;
    String environment;

    // methods
    Animal(String furcolor, int numlegs, String environment) {
        System.out.println("In constructor for Animal");
        this.environment = environment;
        this.fur_color = furcolor;
        this.num_legs = numlegs;
    }

    String animalToString() {
        return ("Animal: Environment:"+this.environment+", Number of Legs:"+this.num_legs+", Fur Color:"+this.fur_color);
    }

    static String myStaticFunction() {
        return "This function does not need an object";
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

        // classes
        Animal an1 = new Animal("Black", 4, "Land");        
        System.out.println(an1.animalToString());

        // static functions
        System.out.println(an1.myStaticFunction());

        /*
        System.out.println(an1.environment);
        System.out.println(an1.fur_color);
        System.out.println(an1.num_legs);
        */
    }

}
