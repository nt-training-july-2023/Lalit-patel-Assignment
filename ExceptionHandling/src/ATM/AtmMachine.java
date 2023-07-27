package ATM;
import java.util.Scanner;

public class AtmMachine {
    public static void checkMethod(int value) throws InvalidInputException {
        if (value < 0) {
            throw new InvalidInputException("Invalid input: The value must be a positive number.");
        }
        // Other logic for the method
    }

    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int currentBalance=0,withDraw,deposite;

        while(true){
            System.out.println("Press 1 to deposite balance");
            System.out.println("Press 2 to withdraw balance");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to exit");

            int t;
            t=sc.nextInt();
            switch (t){
                case(1):
                    System.out.println("enter the amount u want to deposite");
                    try {
                        deposite=sc.nextInt();
                        checkMethod(deposite);
                        currentBalance += deposite;
                        System.out.println("deposited amount : "+deposite);
                        System.out.println("Currenbalance : "+currentBalance);
                    } catch (InvalidInputException e) {
                        System.out.println("Caught InvalidInputException: " + e.getMessage());
                    }
                    finally {
                        break;
                    }

                case(2):
                    System.out.println("enter the amount u want to withdraw");
                    try{
                        withDraw=sc.nextInt();
                        checkMethod(withDraw);
                        if(withDraw>=currentBalance){
                            System.out.println("insufficient amount in account");
                        }
                        else{
                            currentBalance -=withDraw;
                        }
                    }
                    catch (InvalidInputException e){
                        System.out.println("Caught invalidinput exception "+ e.getMessage());
                    }

                    break;
                case(3):
                    System.out.println("your current balance is: "+ currentBalance);
                    break;

                case(4):
                    System.exit(0);

            }
        }


    }

}
