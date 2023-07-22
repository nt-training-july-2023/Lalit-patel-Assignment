import java.util.Scanner;
// import java.utils.String;
public class StringOps2{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        String line=new String("hii, i'm lalit patel");
        //unicode of character at index
        System.out.println(line.codePointAt(3));

        //hash_code
        int int_hash_code=line.hashCode();
        System.out.println(int_hash_code);

        //boolean
        System.out.println(line.isEmpty());

        //length
        System.out.println(line.length());

        //code point count
        int beginIndex=1;
        int endIndex =4;
        System.out.println(line.codePointCount(beginIndex, endIndex));
    }
}