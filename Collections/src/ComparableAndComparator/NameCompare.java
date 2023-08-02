package ComparableAndComparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Movies> {

    @Override
    public int compare(Movies o1, Movies o2) {
         return  o1.getMn().compareTo(o2.getMn());
    }
}
