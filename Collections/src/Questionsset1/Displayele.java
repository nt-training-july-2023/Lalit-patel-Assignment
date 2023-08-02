package Questionsset1;

import java.util.ArrayList;
import java.util.List;

public class Displayele {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<10;i++){
            ls.add(i*10);
        }
        for (int j:ls){
            if(j<60){
                System.out.print(j+" ");
            }
        }
    }
}
