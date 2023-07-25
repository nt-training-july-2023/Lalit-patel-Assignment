import java.util.*;


final class myObj{

    public void myMethod(){
        System.out.println("this is final method");
    }
}

//if we try to inherit final class it will throw an error
class children extends myObj{
    public void myMethod(){
        System.out.println("this is children class");
    }
}
class FinalClass{
public static void main(String args[]){
        myObj m=new myObj();
        m.myMethod();
}
}