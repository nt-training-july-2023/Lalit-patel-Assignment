import java.util.Scanner;
public class Pallindrom {
    public static int reverseint(int n){
        boolean isNegative=false;
        if(n<0){
            n=-n;
            isNegative=true;
        }

        long reverse=0;

        while(n>0){

            reverse = reverse*10+ n%10;
            n /= 10;

        }

        if(reverse> Integer.MAX_VALUE){
            return 0;
        }
         return (int)(isNegative ? -reverse :reverse);
        
    }
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int r=reverseint(n);
        if(r==n){
            System.out.println("it is pallindrom no..");
        }
        else{
            System.out.println("it is not pallindrom no..");
        }
    }

}