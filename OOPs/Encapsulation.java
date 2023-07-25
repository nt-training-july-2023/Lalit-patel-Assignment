
import java.util.*;
class Encapsulation{

    public static class Account{
        private int balance;
        private String name;
        
        public  void get_balance(){
            System.out.println(this.balance);
        }
        public void add_balance(int x){

           this.balance +=x;
        }

        public void add_name(String m){
            this.name=new String(m);
        }
        public void get_name(){
            System.out.println(this.name);
        }

    }
public static void main(String args[]){

    Account a=new Account();
    a.add_balance(500);
    a.get_balance();
    a.add_name("lalit");
    a.get_name();
    
System.out.println();

}
}
