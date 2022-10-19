package Practice;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> f = new HashMap<>();
        f.put("aaa",10);
        f.put("bbb",20);
        f.put("ccc",30);
        f.put("ddd",40);
        System.out.println(f);

        for(int k : f.values()){
            System.out.println(k);}

        for(String s :f.keySet()){
            System.out.println(s);}
        }
    }

