import java.util.*;


interface Students{
    void type();
}


//A class without any name is called Annonymous class.
class Anonymous{
public static void main(String args[]){
    Students st=new Students(){
        public void type(){
            System.out.println("this is student of secondary type");
        }
    };

    st.type();
    
// System.out.println();
}
}