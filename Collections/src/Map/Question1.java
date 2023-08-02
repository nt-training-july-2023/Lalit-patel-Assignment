package Map;

import StringCollection.InsertionOrder;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employees{
     HashMap<Integer,String> eMap;
     Employees(){
         eMap=new HashMap<>();
     }

     public void addElement(int key,String value){
         eMap.put(key,value);
     }

     public boolean printElement(String name){
         boolean isFound=false;
         for(Map.Entry<Integer,String> entry:eMap.entrySet()){
             int employeeId = entry.getKey();
             String employeeName = entry.getValue();

             if (employeeName.contains(name)) {
                 System.out.println("Employee ID: " + employeeId + ", Employee Name: " + employeeName);
                 isFound = true;
                 break;
             }

         }
         return isFound;
     }




 }

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Employees employees=new Employees();
        employees.addElement(1,"lalit");
        employees.addElement(2,"adarsh");
        employees.addElement(3,"akash");
        employees.addElement(4,"naveen");
        employees.addElement(5,"sachin");
        while(true) {
            System.out.println("enter name to search or 0 to exit");
            String name=sc.nextLine();
            if(name.equals("0")){
                break;
            }
            else {
               boolean find= employees.printElement(name);
               if(!find){
                   System.out.println("Not found");
               }
            }

        }


    }
}
