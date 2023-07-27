package AreaShape;
import java.lang.Math;
/**
 * In this Class i calculate area of Circle
 * @author lalit patel
 * @version 1.0
 * since 2023-07-05
 *
 * */
public class Circle extends  Shape{
    private  int r;
    private  double pi=3.14;
    /**
     * In this Class i calculate area
     *
     * @param r radius of circle
     *
     * */
    Circle(int r){
        this.r=r;
    }
    /**
     * this  is method to print area of Circle
     * **/
    @Override
    public void area() {
        System.out.println("the area of circle is : "+ pi*r*r);
    }
}
