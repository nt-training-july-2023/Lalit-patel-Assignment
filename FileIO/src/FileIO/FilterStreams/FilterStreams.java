package FileIO.FilterStreams;

import java.io.*;



public class FilterStreams {

    public static void main(String[] args) {
        String fl="D://Lalit-patel-Assignment//FileIO//src//FileIO//FilterStreams//in.txt";
        String outfile="D://Lalit-patel-Assignment//FileIO//src//FileIO//FilterStreams//out.txt";
//        FileInputStream fileInputStream=null;


        try{
            FileOutputStream fout=new FileOutputStream(outfile);
            CustomFilterInputStream inputStream=new CustomFilterInputStream(fl);
            int data;
            while ((data=inputStream.read())!=-1){
                fout.write(data);
                System.out.print((char)data);

            }
        }
        catch (IOException e){
            System.out.println("there is some issuse in ioStream"+ e.getMessage());
            e.printStackTrace();
        }
    }
}
