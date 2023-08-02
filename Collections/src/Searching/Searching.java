package Searching;
import StringCollection.DifferentType;

import java.util.HashMap;
import java.util.Map;

class mapmethods{
    HashMap<Integer , String > hashmap ;
    mapmethods(){
        hashmap=new HashMap<>();
    }

    public  boolean search(String s){
        boolean isFound=false;
        for(Map.Entry<Integer,String> entry:hashmap.entrySet()){
            int employeeId = entry.getKey();
            String employeeName = entry.getValue();

            if (employeeName.contains(s)) {
                System.out.println("Employee ID: " + employeeId + ", Employee Name: " + employeeName);
                isFound = true;
                break;
            }

        }
        return isFound;
    }

    public boolean search(int k){
        boolean isFound=false;
        for(Map.Entry<Integer,String> entry:hashmap.entrySet()){
            int employeeId = entry.getKey();
            String employeeName = entry.getValue();

            if (k==employeeId) {
                System.out.println("Employee ID: " + employeeId + ", Employee Name: " + employeeName);
                isFound=true;
                break;
            }

        }
        return isFound;
    }

    public void addElement(int key,String value){
        hashmap.put(key,value);
    }
}

public class Searching {

    public static void main(String[] args) {
        mapmethods employees=new mapmethods();
        employees.addElement(1,"lalit");
        employees.addElement(2,"adarsh");
        employees.addElement(3,"akash");
        employees.addElement(4,"naveen");
        employees.addElement(5,"sachin");

        System.out.println(employees.search("lalit"));
        System.out.println(employees.search(3));
        System.out.println(employees.search(8));
    }
}
