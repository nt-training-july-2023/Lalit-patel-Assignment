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


class InheritanceSimple{
public static void main(String args[]){
     Circle s=new Circle();
     s.drawCircle();
     
}
}