package InvalidPassword;
import java.util.Scanner;
import java.util.regex.*;




public class PasswordCheck {
    public static  void checkPassword(String s) throws InvalidPasswordException{
        String noregex=  ".*\\d+.*";;
        String alphabetregex=".*[a-zA-Z].*";
        Pattern p1=Pattern.compile(noregex);
        Pattern p2=Pattern.compile(alphabetregex);
        Matcher m1=p1.matcher(s);
        Matcher m2=p2.matcher(s);
        if(s.length()!=8){
            throw  new InvalidPasswordException("Password length must be 8 digit");
        }

        else if(!m1.matches()){
            throw  new InvalidPasswordException("Password should contian atleast one no.") ;
        }
        else if(!m2.matches()){
            throw  new InvalidPasswordException("Password should contian atleast one alphabate") ;
        }

    }


    public static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");

        try {
            String password = sc.nextLine();
            checkPassword(password);
            System.out.println("Valid Password");
        }
        catch (InvalidPasswordException e){
            System.out.println("Invalid password exception is cought : "+e.getMessage());
        }


    }




}
