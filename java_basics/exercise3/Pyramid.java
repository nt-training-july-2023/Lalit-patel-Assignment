import java.util.Scanner;
public class Pyramid {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
            
        }
    }
}