package src.ThreadStates;

public class Mythread2 implements Runnable{

    @Override
    public void run() {
//        System.out.println("State of thread2 when it is Starte);
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("State of thread1 while it called join() method on thread2 : "+ThreadStates.thread1.getState());

        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException e){

            e.printStackTrace();
        }
    }
}
