package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employees2{
    HashMap<Integer,String> eMap;
    public Employees2(){
        eMap=new HashMap<>();
    }

    public void  AddEmployee(int key,String value){
        eMap.put(key,value);
    }


}
public class PrintKeys {
    public static void main(String[] args) {
        Employees2 employees2=new Employees2();
        employees2.AddEmployee(1,"lalit");
    }

}



