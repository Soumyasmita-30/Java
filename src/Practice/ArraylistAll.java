package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistAll {
    public static void main(String[] args) {

        ArrayList x = new ArrayList();
        x.add(1);
        x.add("seema");
        x.add(50);
        System.out.println(x);

        ArrayList<String> y = new ArrayList<>();
        y.add("UK");
        y.add("USA");
        y.add("AUS");
        y.add("DUBAI");
        System.out.println(y);

        Iterator ir = y.iterator();
        while(ir.hasNext()){
            System.out.print("  ," +ir.next());
        }
        System.out.println();

        for(String h : y){
            System.out.print("  "+h);
        }
        }
}

