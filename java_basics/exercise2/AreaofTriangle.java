import java.util.Scanner;
import java.lang.Math;

public class AreaofTriangle{
    public static void main(String Args[]){
       Scanner sc= new Scanner(System.in);
       int a;
       int b;
       int c;

       System.out.print("Enter side a: ");
       a= sc.nextInt();
       System.out.print("Enter side b: ");
       b=sc.nextInt();
       System.out.print("Enter side c: ");
       c=sc.nextInt();

       float s=(a+b+c)/2;

       double area;
       area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

       System.out.println(area);
    

    }
}