package Threshold;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Threshold {

    public static void main(String[] args) {
        HashMap<Integer , String > hashmap = new HashMap<>();

        insert(hashmap , 1 , "Lalit");
        insert(hashmap , 2 , "Twinkle");
        insert(hashmap , 3 , "Ayushi");
        insert(hashmap , 4 , "Ayush");
        insert(hashmap , 5 , "Sachin");
        Scanner sc=new Scanner(System.in);
        int threshold=sc.nextInt();
        print(hashmap,threshold);

    }
    public static void print(Map<Integer , String > map,int threshold){
        for(Map.Entry<Integer , String> m : map.entrySet()) {
            if (threshold == 0) {
                map.clear();
                System.out.println("map is cleared");
                break;
            }
//            System.out.println(threshold);;
            threshold--;
            System.out.print(m.getKey() + "->" + m.getValue() + " ");

            System.out.println();
        }
    }

    public static void insert(Map<Integer , String > map  , int key , String value){
        map.put(key , value);
    }
}
