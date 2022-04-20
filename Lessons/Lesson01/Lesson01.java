import java.util.ArrayList;
public class Lesson01 {

    public static void main(String[] args) {
        // Deconstructing Hello World
        System.out.println("Hello World!");

        // Comments
        // Single
        /*
            THis is a multi line comment
        */

        /**  
         This function is used to do something very very cool!
        */
        
        // Variables
        // <type> <variable name> = <value>;
        int var1 = 5;
        double var2 = 2.5;
        char var3 = 'a';
        short var4 = 5;
        long var5 = 1000000;
        float var6 = 1.1f;
        double var7 = 2.3456;
        boolean var8 = true;
        String var9 = "Hello";

        // Operators
        int var10 = 0;
        
        var10 = 5 + 5;
        var10 = 5 - 5;
        var10 = 5 * 5;
        var10 = 5 / 5;
        
        var10 += 5;
        var10 -= 5;
        var10 *= 5;
        var10 /= 5;

        int var11 = 2^2;
        int var12 = 10 % 2;

        // post fix increment
        var10 = 10;
        int var13 = var10++;
        var10--;

        // prefix increment
        int var14 = ++var10;
        --var10;

        int my_int = 10;
        System.out.println(my_int++);

        // Casting
        double myDouble = 9.87;
        int myInt = (int)myDouble;
        System.out.println(myInt);

        long myLong = 900000000;
        myInt = (int)myLong;
        System.out.println(myInt);

        // Control Statments
        if (var1 > var2) {
            System.out.println("Var1 > var2");
        } else if (var2 > var3) {
            System.out.println("Var5 > var6");
        }
        else {
            System.out.println("Var2 > var1");
        }

        int day = 5;
        switch(day) {
            case 0:
                System.out.println("Day is 0");
                break;
            case 1:
                System.out.println("Day is 1");
                break;
            case 2:
                System.out.println("Day is 2");
                break;
            case 3:
                System.out.println("Day is 3");
                break;
            case 4:
                System.out.println("Day is 4");
                break;
            default:
                System.out.println("Day is some default");
        }


        // Loop Statements
        int i = 0;
        for (i=10;i > 0;i-=2) {
            System.out.println("I is " + i);
        }

        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        int[] numbers = {1,2,3,4,5,6,7,8,20};
        for (int x:numbers) {
            System.out.println(x);

        }

        i = 11;
        do 
        {
            System.out.println(i);
            i++;
        } while (i < 10);

        // String Class
        String my_name = "Vedant";
        String your_name = new String("Vedant");

        System.out.println(my_name);
        System.out.println(your_name);

        if (my_name.equals(your_name)) {
            System.out.println("Names are equal");
        }

        // Arrays
        int[] my_array = {1,2,3,4,5};
        System.out.println(my_array[0]);
        System.out.println(my_array.length);

        int my_array2[] = new int[5];
        my_array2[0] = 1;
        my_array2[1] = 2;
        my_array2[2] = 3;
        my_array2[3] = 4;
        my_array2[4] = 5;
        //my_array2[5] = 6;


        // ArrayList
        ArrayList<Integer> myNumberList = new ArrayList<Integer>();
        myNumberList.add(1);
        myNumberList.add(11);
        myNumberList.add(111);
        myNumberList.add(1111);

        for(int y:myNumberList) {
            System.out.println(y);
        }


    }
}


