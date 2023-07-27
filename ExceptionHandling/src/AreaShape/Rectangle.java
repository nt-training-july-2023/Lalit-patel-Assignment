package AreaShape;

/**
 * In this Class i calculate area
 * @author lalit patel
 * @version 1.0
 * since 2023-07-05
 *
 * */
public class Rectangle extends Shape{
    private int l;
    private int h;

    /**
     * In this Class i calculate area
     *
     * @param x length of rectangle
     * * @param y breadth of rectangle
     *
     * */
    Rectangle(int x,int y){
        this.l=x;
        this.h=y;}

        /**
         * this  is method to print area of Rectangle
         * **/
    public  void area(){
        System.out.println("this is rectangle class : "+l*h );
    }
}
