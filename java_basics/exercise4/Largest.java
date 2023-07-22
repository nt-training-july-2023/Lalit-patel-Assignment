import java.util.Scanner;
public class Largest{
    public static void main(String Args[]){
        int a[]={4,3,5,22,3,5,7,10,12,23,45,100,2,3,0};
        int n=a.length;

        int lar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>lar){
                lar=a[i];
            }
        }

        System.out.println(lar);
        
    }
}