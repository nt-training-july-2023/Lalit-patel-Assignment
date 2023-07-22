import java.util.Scanner;
public class Factorial {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        long fact=1;
        for(int i=2;i<=n;i++){
            fact =fact*i;
        }
        System.out.print(fact);
    }
}