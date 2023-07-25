
import java.util.*;


interface class1{
    void height();
}

class class2 implements class1{

    public void height(){
        System.out.println(" height under class 2  is 23 inches");
    }
}
class OverrideAnonymous{
public static void main(String args[]){
    class1 c1=new class1(){
        public void height(){
            System.out.println("heigth under object of class1 is 25 inches");
        }
    };

    class2 c2=new class2();
    c2.height();
    c1.height();

}
}