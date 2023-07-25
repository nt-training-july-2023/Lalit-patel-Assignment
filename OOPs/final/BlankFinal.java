import java.util.*;

class myObj{
    // generally we declare final variable in constructor b/c otherwise it will be same for all the objects
    final public int i;
    myObj(int x){
        this.i=x;
    }
    myObj(){
        this.i=10;
    }
}
class BlankFinal{
public static void main(String args[]){
    myObj m1=new myObj();
    myObj m2=new myObj(25);

    System.out.println(m1.i);
    System.out.println(m2.i);
}
}