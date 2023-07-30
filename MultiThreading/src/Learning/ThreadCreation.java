package src.Learning;

import src.Learning.Mythread;

public class ThreadCreation {

    public static void main(String Args[]) {
       Mythread thread=new Mythread();
       Mythread thread2=new Mythread();
         thread2.start();
        thread.start();

        for(int i=0;i<100;i++){
            System.out.println("inside main thread");
        }

        // thread.start();
        //we cannot start thread again again
    }
}
