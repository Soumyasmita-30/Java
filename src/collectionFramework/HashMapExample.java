package collectionFramework;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> marksOfStudents = new HashMap<>() ;
        marksOfStudents.put("Rudra" , 85) ;
        marksOfStudents.put("Sneha" , 86) ;
        marksOfStudents.put("Soumya" , 87) ;
        System.out.println(marksOfStudents);
        System.out.println(marksOfStudents.get("Soumya"));
       // marksOfStudents.remove("Soumya");
       // System.out.println(marksOfStudents);
        //marksOfStudents.clear();
      //  System.out.println(marksOfStudents);
        for(String i : marksOfStudents.keySet()) {
            System.out.println(i);
        }
        for(int i : marksOfStudents.values()){
            System.out.println(i);
        }
    }
}
