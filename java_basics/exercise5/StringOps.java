import java.util.Scanner;
public class StringOps{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        String st=new String("lalit");

        //to find the length of string we use inbuild function length()
        System.out.println(st.length());

        //since string is immutable so we cannot change actual value 
        //of string and if we do this it will create spearate object for newly generated string
        st.concat("patel");//this will generate new object of string but it is not referenced
        String sn=st.concat("patel");
        System.out.println(sn);

        // to find the character at specific postion
        char ch=sn.charAt(6);
        System.out.println(ch);

        //find substring
        System.out.println(st.startsWith("lal"));

        //index 

        System.out.println(st.indexOf("it"));



//replace
        String snew=st.replace('a','i');
        System.out.println(snew);
        
        
        
    }
}