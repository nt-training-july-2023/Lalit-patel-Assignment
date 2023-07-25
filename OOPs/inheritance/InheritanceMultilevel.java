import java.util.*;

// run time polymorphism (method override)
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    public void drawCircle(){
         System.out.println("Drawing a Circle");
    }
}
class Dimesion extends Circle{
    public void getDimension(){
         System.out.println("dimensions class"); 
    }
}

class InheritanceMultilevel{
public static void main(String args[]){
    Circle c=new Circle();
    Dimesion d=new Dimesion();
    d.drawCircle();
    d.getDimension();

    //  sq.hello();
}
}