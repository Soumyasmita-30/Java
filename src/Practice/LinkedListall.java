package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListall {
    public static void main(String[] args) {
        LinkedList<String> z = new LinkedList<>();
        z.add("UK");
        z.add("USA");
        z.add("AUS");
        z.add("DUBAI");
        System.out.println(z);
        System.out.println();

        Iterator is = z.iterator();
            while(is.hasNext()){
            System.out.print(" " +is.next());
            }
    }
}
