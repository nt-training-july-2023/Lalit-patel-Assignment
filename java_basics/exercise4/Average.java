import java.util.Scanner;
public class Average{
    public static void main(String Args[]){
        int a[]={4,3,5,22,3,5,7,10,12,23,45,100,2,3,0};
        int n=a.length;   
        long sum=0;

        for(int i=0;i<n;i++){
           sum+=a[i];
        }

        System.out.println(sum/n);
        
    }
}