import java.util.Scanner;
public class  Equals{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        //equal method is used in string object to compares the values
        // == method is used to check the address of object
        String s1=new String("lalit");
        String s2=new String("lalit");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}