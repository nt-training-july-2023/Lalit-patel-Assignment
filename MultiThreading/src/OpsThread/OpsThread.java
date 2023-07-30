package src.OpsThread;

import java.util.Scanner;

public class OpsThread {

    public static void main(String Args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fibonacci fib=new Fibonacci(n);
        Reverse rev=new Reverse(n);
        SumAll sum=new SumAll(n);

        Thread th1=new Thread(fib);
        Thread th2=new Thread(rev);
        Thread th3=new Thread(sum);

        th1.start();
        try {
            th1.join();
            th2.start();
            th2.join();
            th3.start();
            th3.join();

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }



    }
}
