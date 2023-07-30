package src.OpsThread;

public class Reverse implements  Runnable{

    int n;
    int arrr[];
    Reverse(int length){
        this.n=length;
        arrr=new int[n];
        for(int i=0;i<n;i++){
            arrr[i]=i+1;
        }
    }
    @Override
    public void run() {
       int l=0,r=arrr.length-1;
       while(l<r){
           int temp=arrr[l];
           arrr[l]=arrr[r];
           arrr[r]=temp;
           l++;
           r--;
       }
        System.out.println("Printing Reverse Array");
       for(int i:arrr){
           System.out.print(i+" ");
       };
        System.out.println();
    }
}
