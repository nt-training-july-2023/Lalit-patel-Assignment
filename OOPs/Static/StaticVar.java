import java.util.*;

class Size{
    static int x=1000;
    int y=1000;
}
class StaticVar{
public static void main(String args[]){

    Size s1=new Size();
    Size s2=new Size();
    s1.x=999;
    s1.y=999;

    System.out.println("value of x:" + s2.x + " value of y: "+ s2.y);

 
}
}