import java.util.Scanner;
import java.lang.Math;
public class Quadratic{

    public static void main(String Args[]){

       int a;
       int b;
       int c;
       Scanner sc= new Scanner(System.in);  
       System.out.print("Enter side a: ");
       a= sc.nextInt();
       System.out.print("Enter side b: ");
       b=sc.nextInt();
       System.out.print("Enter side c: ");
       c=sc.nextInt();

       double x;
       double y;

       double d= Math.sqrt(b*b-4*a*c);

       if(d>=0){
       x= (-b+d)/(2*a);
       y= (-b-d)/(2*a);
       System.out.println(x);
       System.out.println(y);
       }
    else{
       System.out.println("imaginary roots");
    }

    

       



    }
}