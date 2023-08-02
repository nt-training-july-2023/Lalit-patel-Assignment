package Questionsset1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerReverse {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();

        for(int i=0;i<20;i++){
            ls.add(i+1);
        }

        Collections.reverse(ls);
        for(int j:ls){
            System.out.print(j+" ");
        }
    }
}
