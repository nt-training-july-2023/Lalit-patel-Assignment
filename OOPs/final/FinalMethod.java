import java.util.*;

class myClass{

    final public void myMethod(){
        System.out.println("this is final upper class method");
    }

    public void myMethod(int x){
        System.out.println("this is final upper class method with parmeter");
    }
}

class myChild extends myClass{

    public void myMethod(int x){
        //this will throw error b/c final method cannot be overridded
         System.out.println("this is child class method with parameter");

    }
}
class FinalMethod{
public static void main(String args[]){
    myChild m1=new myChild();
    m1.myMethod(3);
System.out.println();

}
}