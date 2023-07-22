import java.util.Scanner;
public class Armstrong{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        long sum=0;
        int  k=n;

        while(k!=0){
           int local=k%10;
           sum+=local*local*local;
           k=k/10;
        }

        if(sum==n){
            System.out.println("it is Armstrong no..");
        }
        else{
            System.out.println("it is not Armstrong no..");
        }


        
    }
}