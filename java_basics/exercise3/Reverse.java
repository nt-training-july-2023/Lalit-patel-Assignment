import java.util.Scanner;
public class Reverse {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
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

        if(isNegative){
            System.out.println(-reverse);
        }
        else{
            System.out.println(reverse);
        }
        
            
        

        
        
    }
}