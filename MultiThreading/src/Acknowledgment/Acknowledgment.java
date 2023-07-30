package src.Acknowledgment;

class localThread implements  Runnable{
    String name;
    localThread(String name){
        this.name=name;
    }
    @Override
    public void run() {

        System.out.println("this is thread name : "+Thread.currentThread().getName() +" " +
                "is giving acknowledgment to  :"+ name);

    }
}


public class Acknowledgment {

    public static void main(String[] args) {
        localThread localThread=new localThread("lalit's thread");
        Thread th=new Thread(localThread);
        th.start();
    }

}
