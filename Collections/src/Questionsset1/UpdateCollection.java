package Questionsset1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateCollection {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            ls.add(i*10);
        }

        for (int j=0;j<ls.size();j++){
           if(ls.get(j)>=50){
               ls.set(j,ls.get(j)+5);
           }
        }

        System.out.println("Updated list");
        for(int k:ls){
            System.out.print(k+" ");
        }
    }

}
