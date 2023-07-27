package AreaShape;
import  java.lang.Math;
/**
 * In this Class i calculate area of Traingle
 * @author lalit patel
 * @version 1.0
 * since 2023-07-05
 *
 * */
public class Triangle extends  Shape{
    private int a;
    private int b;
    private int c;

    /**
     * In this Class i calculate area
     *
     * @param a side of triangle
     * * @param b side of triangle
     *  @param c length of triangle
     *
     * */
    Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    /**
     * this  is method to print area of Triangle
     * **/
    @Override
    public void area() {
        double s=(a+b+c)/2;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("tha area of triangle is : " + ar);

    }
}
