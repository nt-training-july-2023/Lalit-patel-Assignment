package src.Learning;

public class Type2Creation {

    public static void main(String Args[]) {
            MyRunnable runnable=new MyRunnable();
            Thread th=new Thread(runnable);
            th.start();

            for(int i=0;i<=50;i++){
                System.out.println("Main thread");
            }
    }
}
