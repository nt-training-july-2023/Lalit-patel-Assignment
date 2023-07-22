import java.util.Scanner;
public class RotateArr{

    public static void reverse(int l,int r,int[] arr){
          while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
          }
    }
    public static void main(String Args[]){
        int a[]={4,3,5,22,3,5,7,10,12,23,45,100,2,3,0};
        int n=a.length;   
        Scanner sc= new Scanner(System.in);
        int t;
        t=sc.nextInt();
        reverse(0,n-t-1,a);
        reverse(n-t,n-1,a);
        reverse(0,n-1,a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}