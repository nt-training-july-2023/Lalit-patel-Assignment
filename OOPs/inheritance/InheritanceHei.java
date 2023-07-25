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
class Square extends Shape{


    public void drawSquare(){
         System.out.println("Drawing a Square");
    }

    public void hello(){
        System.out.println("hello");
    }
}

class InheritanceHei{
public static void main(String args[]){
     Shape s=new Shape();
     Circle c=new Circle();
     Square sq=new Square();

     s.draw();
     c.drawCircle();
     sq.drawSquare();
    //  sq.hello();
}
}