package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    /**
     * old way of defining Arraylist
     */
    public void nonGenericArrayListExample(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Test");
        list.add(3.14);
        System.out.println(list);
    }
    public void genericArrayListExample(){
        ArrayList<String> list = new ArrayList<>();
        list.add("UK");
        list.add("INDIA");
        list.add("AUS");
        list.add("USA");
        System.out.println(list);
    }
    // traversing the list through Iterator
    public void ListIteratorExample(){
        ArrayList<String> list = new ArrayList<>();
        list.add("UK");
        list.add("INDIA");
        list.add("AUS");
        list.add("USA ") ;
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    //List with for each loop
    public void ListForExample(){
        ArrayList<String> list = new ArrayList<>();
        list.add("UK");
        list.add("INDIA");
        list.add("AUS");
        list.add("USA") ;
        for(String country : list){
            System.out.println(country);
        }
    }

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.nonGenericArrayListExample();
        arrayListExample.genericArrayListExample();
        arrayListExample.ListIteratorExample();
        arrayListExample.ListForExample();

    }

    }



