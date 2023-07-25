import java.util.*;
class StaticMethod2{
public static void main(String args[]){
         System.out.println("this is main method taking string as parameters");
}

//by default method with string args is called at first sight but static method can be overloaded
public static void main(int args[]){
         System.out.println("this is main method taking integers as parameters");

}
}

class temp extends StaticMethod2{
    // concept of data hiding
    public  static void main(String args[]){
         System.out.println("this is main method of temp class");

    }
}
//when static method try to access non static variable then compiler will throw error