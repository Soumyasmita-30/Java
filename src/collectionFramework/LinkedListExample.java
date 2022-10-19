package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public void SimpleLinkedListExample(){
        LinkedList<String> list = new LinkedList<>() ;
        list.add("UK");
        list.add("INDIA");
        list.add("AUS");
        list.add("USA") ;
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.SimpleLinkedListExample();
    }
}
