package src.RunnigThreads;

public class RunningThreads {
    public static void main(String args[]){
        rThreads th1=new rThreads();
        rThreads th2=new rThreads();
        rThreads th3=new rThreads();
        th2.start();
        System.out.println("Thread2 status: "+th2.getState());
        th1.start();
        System.out.println("Thread1 status: "+th1.getState());
        th3.start();
        System.out.println("Thread3 status: "+th3.getState());


    }
}
