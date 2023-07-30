package src.ThreadPooling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    String name;
    Task(String s){
        this.name=s;
    }


    @Override
    public void run() {

        try {
            for(int i=0;i<5;i++){

                if(i==0){
                    Date date=new Date();
                    SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization time for  thread: "+name+ " at time: "+ft.format(date));
                }
                else{

                        Date date=new Date();
                        SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
                        System.out.println(" Execution time for thread: "+name+ " at time: "+ft.format(date));
                }
                Thread.sleep(1000);
            }
            System.out.println(name+" completed");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

public class ThreadPooling {
    public static final int Max_t=3;

    public static void main(String[] args) {

        //Creating Task for Thread
       Runnable a=new Task("Task1");
       Runnable b=new Task("Task2");
       Runnable c=new Task("Task3");
       Runnable d=new Task("Task4");
       Runnable e=new Task("Task5");

        ExecutorService pool = Executors.newFixedThreadPool(Max_t);

        pool.execute(a);
        pool.execute(b);
        pool.execute(c);
        pool.execute(d);
        pool.execute(e);



    }
}
