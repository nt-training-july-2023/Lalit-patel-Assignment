package Map;

import java.util.HashMap;
import java.util.*;

public class CrudOnMaps {

    public static void main(String[] args) {

        HashMap<Integer , String > hashmap = new HashMap<>();

        insert(hashmap , 1 , "Lalit");
        insert(hashmap , 2 , "Twinkle");
        insert(hashmap , 3 , "Ayushi");
        insert(hashmap , 4 , "Ayush");
        insert(hashmap , 5 , "Sachin");

        System.out.println("Map before removing the element : ");
        print(hashmap);
        remove(hashmap , 5);


        System.out.println("Map after removing the element : ");
        print(hashmap);
        System.out.println();
        update(hashmap,4,"Ayush2");

        System.out.println("Map after Updating element: ");
        print(hashmap);


        TreeMap<Integer , String > treemap = new TreeMap<>();

        insert(treemap , 1 , "Lalit");
        insert(treemap , 2 , "Twinkle");
        insert(treemap , 3 , "Ayushi");
        insert(treemap , 4 , "Ayush");
        insert(treemap , 5 , "Sachin");

        System.out.println("Tree Map before removing the element : ");
        print(treemap);


        remove(treemap , 5);
        System.out.println("Tree Map after removing the element : ");
        print(treemap);
        System.out.println();




        LinkedHashMap<Integer , String > linkedHashSet = new LinkedHashMap<>();

        insert(linkedHashSet , 1 , "Lalit");
        insert(linkedHashSet , 2 , "Twinkle");
        insert(linkedHashSet , 3 , "Ayushi");
        insert(linkedHashSet , 4 , "Ayush");
        insert(linkedHashSet , 5 , "Sachin");

        System.out.println("Linked hash map before removing the element : " );
        print(linkedHashSet);
        remove(linkedHashSet , 5);
        System.out.println("Linked hash map after removing the element : ");
        print(linkedHashSet);





    }

    public static void insert(Map<Integer , String > map  , int key , String value){
        map.put(key , value);
    }

    public static void remove(Map<Integer , String > map  , int key ){
        map.remove(key);
    }

    public static void print(Map<Integer , String > map){
        for(Map.Entry<Integer , String> m : map.entrySet())
            System.out.print(m.getKey()+"->"+m.getValue() + " " );
        System.out.println();
    }

    public static void update(Map<Integer , String> map , int key , String value){
        if(map.containsKey(key))
            map.put(key , value);
    }

}
