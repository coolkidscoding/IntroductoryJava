import java.util.*;

public class Lesson02 {
    public static void printLinkedList(LinkedList<String> list) {
        for(int i=0;i < list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void Count100() {
        // put implementation here
    }
    public static void main(String args[]) {

        Count100();
        
/*         // Array
        int iarray[] = new int[10];
        iarray[0] = 0;
        iarray[2] = 2;
        iarray[4] = 4;
        iarray[6] = 6;
        // iarray[10] = 10;

        for (int it:iarray) {
            System.out.println(it);
        }

        // Vector
        Vector<String> vs = new Vector<String>();
        vs.add("Hello");
        vs.add("How are you");
        vs.add("How ya doin");

        System.out.println(vs.firstElement());
        System.out.println(vs.lastElement());
        System.out.println(vs.get(2));

        // Array List
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Jimmy");
        alist.add("Vedant");

        for (String name: alist) {
            System.out.println(name);

        }
        // Linked List
        LinkedList<String> llist = new LinkedList<String>();

        llist.add("Hello");
        printLinkedList(llist);

        llist.add("World");
        printLinkedList(llist);

        // Hash Map
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        hmap.put("one", 1);
        hmap.put("two", 2);

        System.out.println(hmap);

        // Stack LIFO Last In First Out
        Stack<String> stack = new Stack<String>();

        stack.push("one");
        stack.push("two");

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        // Set
        HashSet<Integer> hset = new HashSet<Integer>();

        hset.add(1);
        hset.add(2);
        hset.add(3);
        hset.add(1);

        for(int number:hset) {
            System.out.println(number);
        }

        // Random
        Random rand = new Random();

        System.out.println(rand.nextInt(0,100));
        System.out.println(rand.nextInt());
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextDouble());

        // String Tokenizer
        StringTokenizer st = new StringTokenizer("The quick brown fox jumped over the lazy moon", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        } */
   } 
}

// End of File
