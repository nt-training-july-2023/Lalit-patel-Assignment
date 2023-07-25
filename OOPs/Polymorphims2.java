import java.util.*;

// run time polymorphism (method override)
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    @Override
    public void draw(){
         System.out.println("Drawing a Circle");
    }
}
class Square extends Shape{

    @Override
    public void draw(){
         System.out.println("Drawing a Square");
    }

    public void hello(){
        System.out.println("hello");
    }
}

class Polymorphims2{
public static void main(String args[]){
     Shape s=new Shape();
     Shape c=new Circle();
     Shape sq=new Square();

     s.draw();
     c.draw();
     sq.draw();
    //  sq.hello();
}
}