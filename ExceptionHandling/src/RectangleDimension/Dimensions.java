package RectangleDimension;

import java.util.Scanner;


public class Dimensions {
    public static void checkDimension(int x,int y ) throws InvalidDimensionException{
        if(x<=0){
            throw new InvalidDimensionException("invalid input: length of rectangle should be greator then zero");
        }
        if(y<=0){
            throw new InvalidDimensionException("invalid input: heigth of rectangle should be greator then zero");
        }
    }
    public static void main(String Args[]){

        Scanner sc=new Scanner(System.in);
        int l,h;
        try{
        l=sc.nextInt();
        h=sc.nextInt();
        checkDimension(l,h);
            double area=l*h;
            System.out.println("Area of Recatngle is "+ area);
        }
        catch (InvalidDimensionException e){
            System.out.println("invaliddimensionexception : "+ e.getMessage());
        }



    }
}
