package PrintAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintAll {

    public static void main(String[] args) {
        HashMap<Integer , String > hashmap = new HashMap<>();

        insert(hashmap , 1 , "Lalit");
        insert(hashmap , 2 , "Twinkle");
        insert(hashmap , 3 , "Ayushi");
        insert(hashmap , 4 , "Ayush");
        insert(hashmap , 5 , "Sachin");
        print(hashmap);

    }
    public static void print(Map<Integer , String > map){
        ArrayList<Integer> keys=new ArrayList<>();
        ArrayList<String> values=new ArrayList<>();
        for(Map.Entry<Integer , String> m : map.entrySet()) {
            keys.add(m.getKey());
            values.add(m.getValue());
        }
        System.out.println("KEYS:");
        for (int a:keys){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("VALUES:");

        for(String s:values){
            System.out.print(s+" ");
        }
    }

    public static void insert(Map<Integer , String > map  , int key , String value){
        map.put(key , value);
    }
}
