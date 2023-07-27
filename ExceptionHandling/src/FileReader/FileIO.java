package FileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class FileIO {

    public void filere(String filename)  {
            String path="D://Lalit-patel-Assignment//ExceptionHandling//src//FileReader//"+filename+".txt";
            FileReader file=null;
            try {
                  file = new FileReader(path);
                  int ch;
                  while ((ch=file.read()) !=-1){
                        System.out.print((char) ch);
                  }
            } catch(Exception e) {
                e.printStackTrace();
        }
            finally {
                try{
                if (file != null) {
                    file.close();
                }} catch (Exception e){
                    e.printStackTrace();
                }
            }

    }


    public static void  main(String args[]){
          Scanner sc=new Scanner(System.in);
          String filename=sc.nextLine();
          FileIO fileIO=new FileIO();
          fileIO.filere(filename);
    }
}
