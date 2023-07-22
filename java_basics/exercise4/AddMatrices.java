import java.util.Scanner;
public class AddMatrices {
    public static void main(String Args[]){
        int a[][]={{4,3,5},{22,3,5},{7,10,12}};
        int b[][]={{1,4,5},{23,45,100},{2,3,0}};
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=a[i][j]+b[i][j];
            }
        }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println( );
        }
    }
}