package Area_Shape;

import java.util.Scanner;



interface Shape{
    abstract double Area();
}

public class Area_Shape {
    public static void main(String[] args) {
        Shape sh=()->{
            double area=0;
            Scanner sc=new Scanner(System.in);

            System.out.println("For Area Of Circle press 1");
            System.out.println("For Area Of Rectangle press 2");
            System.out.println("For Area Of Square press 3");
            System.out.println("For Area Of Cube press 4");
            System.out.println("For Area Of Cylinder press 5");
            System.out.println("For exit 6");
            int i=sc.nextInt();

            switch (i) {
                case (1):
                    System.out.println("enter radius ");
                    int radius= sc.nextInt();
                    area=radius*radius*(3.14);
                    break;
                case (2):
                    System.out.println("enter length and breadth ");
                    int l=sc.nextInt(),b=sc.nextInt();
                    area=l*b;
                    break;

                case (3):
                    System.out.println("enter length of Side ");
                    int a=sc.nextInt();
                    area=a*a;
                    break;

                case (4):
                    System.out.println("enter length of side  ");
                    int ab=sc.nextInt();
                    area=6*ab*ab;
                    break;

                case(5):
                    System.out.println("enter radius and heigth ");
                    int ra=sc.nextInt(),h=sc.nextInt();
                    area=2*3.14*(ra*h);
                    break;
                case(6):
                    System.exit(0);

            }
            return area;
        };
        System.out.println(sh.Area());
    }
}
