package src.ThreadStates;

import src.Learning.Mythread;

public class ThreadStates implements Runnable{
    public static Thread thread1;
    public static ThreadStates obj;

    public static void main(String Args[]) {
               obj=new ThreadStates();
             thread1=new Thread(obj);
             System.out.println("State of thread 1 when it is created :"+thread1.getState());

             thread1.start();
             System.out.println("State of thread 1 when it is started or in runnable state :"+thread1.getState());


    }

    @Override
    public void run() {
        Mythread2 mythread=new Mythread2();
        Thread thread2=new Thread(mythread);
        System.out.println("State of thread2 when it is created :"+thread2.getState());
        thread2.start();
        System.out.println("State of thread2 when it is Started :"+thread2.getState());

        try {
            //moving thread1 to timed waiting state
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread2 when called .sleep() method: "+thread2.getState());

        try {
            //termination state
            thread2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of thread2 when it is in termination state :"+ thread2.getState());






    }
}
