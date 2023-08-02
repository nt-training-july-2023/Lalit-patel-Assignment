package ComparableAndComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movies implements Comparable<Movies> {
    private String mn;
    private int year;
    private double rating;


    Movies(String mn,int year,double rating){
        this.mn=mn;
        this.year=year;
        this.rating=rating;
    }

    public String getMn() {
        return mn;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Movies o) {
//        System.out.println(o.year);
        return (int)(this.year-o.year);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Movies> list=new ArrayList<>();
        list.add(new Movies("Krrish",2015,6.7));
        list.add(new Movies("Krrish2",2016,7.1));
        list.add(new Movies("Krrish3",2017,5));
        list.add(new Movies("Krrish4",2020,9));

        Collections.sort(list);
        System.out.println("Year wise Sorting");
        for(Movies m:list){
            System.out.println("movie name:" +m.getMn()+" "+"year:"+m.getYear()+" "+"rating: "+m.getRating()+"\n");
        }
        RatingCompare ratingCompare=new RatingCompare();
        Collections.sort(list,ratingCompare);
        System.out.println("RatingWise Sorting");
        for(Movies m:list){
            System.out.println("movie name:" +m.getMn()+" "+"year:"+m.getYear()+" "+"rating: "+m.getRating()+"\n");
        }
        NameCompare nameCompare=new NameCompare();
        Collections.sort(list,nameCompare);
        System.out.println("Name wise sorting");
        for(Movies m:list){
            System.out.println("movie name:" +m.getMn()+" "+"year:"+m.getYear()+" "+"rating: "+m.getRating()+"\n");
        }


    }
}
