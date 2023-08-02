package FileIO.Invert;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class InvertInputStream {

    public static void main(String[] args) {
        String filepath ="D:\\Lalit-patel-Assignment\\FileIO\\src\\FileIO\\Invert\\in.txt";
        String fileout="D:\\Lalit-patel-Assignment\\FileIO\\src\\FileIO\\Invert\\out.txt";
        List<String> reverse=new ArrayList<>();
        BufferedReader bfr=null;
        try {
            bfr=new BufferedReader(new FileReader(filepath));
            BufferedWriter wrt=new BufferedWriter(new FileWriter(fileout));
            String line;
            while((line=bfr.readLine())!=null){
                reverse.add(line);
            }
            Collections.reverse(reverse);
            for(String l:reverse){
                wrt.write(l);
                wrt.newLine();
            }
            wrt.close();
            bfr.close();


        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
