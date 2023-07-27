package EvenNoCheck;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenNum {

    public static void numcheck(int x) throws NotEvenNumberException{
        if(x%2!=0){
            throw new NotEvenNumberException("This is not an even number");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x;
        try {
            x = sc.nextInt();
            numcheck(x);
            System.out.println(x);
        }
        catch (NotEvenNumberException e){
            System.out.println("not even number exception occur: "+ e.getMessage());
        }


    }
}
