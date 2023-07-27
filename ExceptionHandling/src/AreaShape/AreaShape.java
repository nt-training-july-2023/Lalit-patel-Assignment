package AreaShape;
/**
* In this Class i calculate area of different Shapes
* @author lalit patel
* @version 1.0
* since 2023-07-05
*
* */
public class AreaShape {
    public static void main(String Args[]){

        Shape s=new Shape();
        s.area();
        Rectangle r=new Rectangle(3,4);
        r.area();
        Triangle t=new Triangle(4,5,6);
        t.area();
        Circle c=new Circle(5);
        c.area();

    }

}
