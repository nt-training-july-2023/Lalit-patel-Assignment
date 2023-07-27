package StringExe;
import java.util.Scanner;
public class StringExe {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i;
        System.out.println("enter index");
        i=sc.nextInt();

        try{
            char c=getelement(i,s);
            System.out.println(c);

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBound exception occured : "+ e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException exception occured : "+ e.getMessage());
        }

    }

    public static char getelement(int i,String s){
        if(s.length()==0){
            throw new NullPointerException();
        }

        return s.charAt(i);

    }

}
