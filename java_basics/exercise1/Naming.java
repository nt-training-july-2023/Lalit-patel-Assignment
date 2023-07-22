public class Naming{
// Case sensitive
// Can contain Alphabets, numbers, but no special characters except _ and $
// Can start with Alphabets, _ or $
// Should not be a keyword
// Should not be similar to a class name
// No limit on length of name
// Should follow camel case style.


    public static void main(){
        int A=4;//correct  
        int A_$=5; //correct
        int A12@=6; //incorrect   special character
        int main; //incorrect  keyword
        int aniMal=7; //incorrect camel case;
        

    }
}