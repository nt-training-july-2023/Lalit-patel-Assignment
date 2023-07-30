package src.OpsThread;

public class Fibonacci implements Runnable{
    int n;
    int arrf[];
    Fibonacci(int length){
        this.n=length;
        arrf=new int[n];
        for(int i=0;i<n;i++){
            arrf[i]=i+1;
        }
    }

    @Override
    public void run() {
        int l=arrf.length;
        for(int i=2;i<l;i++){
            arrf[i]=arrf[i-1]+arrf[i-2];
        }
        System.out.println("Printing Fibonacci Array");
        for(int i:arrf){
            System.out.print(i+" ");
        };
        System.out.println();

    }
}
