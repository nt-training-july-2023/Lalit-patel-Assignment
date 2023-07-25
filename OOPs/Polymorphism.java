import java.util.*;

//this is  compile time polymorphims (method overloading)
class poly{

    private int sum;

    public poly(){
        System.out.println("this is constructor 1");
    }

    public poly(int x){
        System.out.println("this is constructor and values passed is : "+ x);
    }

    public poly(int x,int y){
        this.sum=x+y;
        System.out.println("the sum of two values is : "+ this.sum );
    }

}
public class Polymorphism{
public static void main(String args[]){
      poly p=new poly();
      poly q=new poly(1);
      poly e=new poly(1,2);
}
}