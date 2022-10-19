package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListAll {
    public void fruits() {
            List<String> a = new ArrayList<>();
            a.add("APPLE");
            a.add("BANANA");
            a.add("LITCHI");
            a.add("GRAPES");
            System.out.println("List! is:.........");

            new ListAll().readData(a);

            List<String> b = new LinkedList<>();
            b.add("APPLE");
            b.add("BANANA");
            b.add("LITCHI");
            b.add("GRAPES");
            System.out.println("List2 is :........ ");

            new ListAll().readData(b);

            if (a.equals(b)) {
                System.out.println("Lists are equal");
            } else {
                System.out.println("Lists are not equal");
            }

            a.add(1, "MANGO");
            System.out.println("new list of a is :" + a);

            Collections.sort(a);
            System.out.println("sorted list is : " + a);
        }
        public void readData(List<String> h){
            System.out.println(h);}

    public static void main(String[] args) {
        ListAll abcd = new ListAll();
        abcd.fruits();

    }

        }


