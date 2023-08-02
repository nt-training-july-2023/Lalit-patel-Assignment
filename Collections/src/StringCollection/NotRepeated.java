package StringCollection;

import java.util.HashSet;
import java.util.Set;

public class NotRepeated {
    public static void main(String[] args) {
        Set<String> st=new HashSet<>();
        st.add("value1");
        st.add("value2");
        st.add("value1");
        st.add("value4");
        st.add("value3");
        st.add("value1");
        st.add("value2");
        st.add("value2");
        st.add("value5");

        for(String  j:st){
            System.out.println(j+" ");
        }

    }
}
