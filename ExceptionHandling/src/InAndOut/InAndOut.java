package InAndOut;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class InAndOut {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String pathin=new String("D://Lalit-patel-Assignment//ExceptionHandling//src//InAndOut//in.txt");
        String pathout=new String("D://Lalit-patel-Assignment//ExceptionHandling//src//InAndOut//out.txt");
        FileOutputStream fout=null;
        FileInputStream fin=null;

        try {
//             byte[] buffer=new byte[1024];
             fin=new FileInputStream(pathin);
             fout=new FileOutputStream(pathout);
             int ch;
             while ((ch=fin.read())!=-1){
                   fout.write(ch);
             }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally{
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
