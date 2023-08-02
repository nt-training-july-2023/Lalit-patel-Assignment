package StringCollection;

import java.util.ArrayList;
import java.util.List;

public class StringCollection {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        for(int i=1;i<=20;i++){
            ls.add("value"+i);
        }

        for(String s:ls){
            System.out.print(s+" ");
        }
    }
}
