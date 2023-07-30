package src.OpsThread;

public class SumAll implements Runnable{
    int n;
    SumAll(int n){
        this.n=n;
    }
    @Override
    public void run() {
        System.out.println("Sum of Array :");
        System.out.println((n*(n-1))/2);
    }
}
