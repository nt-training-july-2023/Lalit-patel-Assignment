package FileHandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

    public static void main(String Args[]) {
        String path=new String("D://Lalit-patel-Assignment//ExceptionHandling//src//FileHandling//in.txt");
        String pathout=new String("C://Users//lalit//OneDrive//Desktop//out.txt");
        FileOutputStream fout=null;
        FileInputStream fin=null;

        try {
            fin=new FileInputStream(path);
            fout=new FileOutputStream(pathout);
            readFile(fin,fout);
        }
        catch (FileNotFoundException e){
            System.out.println("FileNotFound exception found : " +e.getMessage());
        }

    }

    public static void readFile(FileInputStream fin,FileOutputStream fout){
        try{
            int ch;
            while((ch=fin.read())!=-1){
                System.out.print((char)ch);
                fout.write(ch);
            }
            System.out.println();
            System.out.println("written successfully into the file out.txt");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fin.close();
                fout.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }

}
