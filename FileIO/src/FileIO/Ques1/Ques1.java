package FileIO.Ques1;

import java.io.*;

public class Ques1 {

    public static void main(String[] args) {
        String  fl="D://Lalit-patel-Assignment//FileIO//src//FileIO//in.txt";
        String outfl="D://Lalit-patel-Assignment//FileIO//src//FileIO//out.txt";


        try (FileInputStream inputStream =new FileInputStream(fl)){
             long bytesize=inputStream.available();
             byte[] bytearr=new byte[(int)bytesize];
             inputStream.read(bytearr);
             ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(bytearr);
             int data;
            FileOutputStream outputStream=new FileOutputStream(outfl);
             while((data=byteArrayInputStream.read()) !=-1){
                 System.out.print(data+" ");
                 outputStream.write(data);

             }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
