package Lamda_hash;

import java.util.Scanner;

interface lamdaInterface{
    abstract String remover(String x);
}

public class LamdaHash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();

        lamdaInterface li=(String x)->{
            String temp;
            temp=x.replaceAll("[aeiou]","#");
            return temp;
        };

        System.out.println(li.remover(st));
    }

}
