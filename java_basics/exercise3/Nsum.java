import java.util.Scanner;
public class Nsum {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}