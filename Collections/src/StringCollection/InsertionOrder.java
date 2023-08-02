package StringCollection;

import java.util.LinkedHashSet;

public class InsertionOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> st=new LinkedHashSet<>();
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
