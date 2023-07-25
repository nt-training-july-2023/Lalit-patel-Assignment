import java.util.*;

abstract class vehical{
    abstract void getnooftyres();
}

class toyota extends vehical{

    public void getnooftyres(){
        System.out.println("no of tyres in toyota is 4");
    }
}
class bus extends vehical{

    public void getnooftyres(){
        System.out.println("no of tyres in bus is 8");
    }
}
class AbstractClass{
public static void main(String args[]){
     vehical v1=new toyota();
     vehical v2=new bus();

     v1.getnooftyres();
     v2.getnooftyres();
}
}