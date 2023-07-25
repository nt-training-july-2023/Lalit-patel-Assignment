import java.util.*;
class StaticMethod{
//instance variable
    int x;
    //static variable
    static int y;
public static void main(String args[]){

    //since this is static method
    x=10;//this will throw error as it is non static varibale 
    y=20;
    
System.out.println(x);
System.out.println(y);

}
}