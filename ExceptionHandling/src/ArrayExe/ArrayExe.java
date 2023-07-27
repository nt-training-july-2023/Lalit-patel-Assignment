package ArrayExe;
import java.util.Scanner;


public class ArrayExe {


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,10,11,23,22};
        int i=sc.nextInt();
//        int arr2[]=null;

        try {

            int value=getelement(arr,i);
            System.out.println(value);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("indexoutofbound exception occur: "+ e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("NullPointer exception occur: "+ e.getMessage());

        }
    }

    public static int getelement(int[] array,int i){
        if(array==null){
            throw new  NullPointerException();
        }


        return array[i];
    }
}
