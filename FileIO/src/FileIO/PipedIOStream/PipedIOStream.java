package FileIO.PipedIOStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedIOStream {

    public static void main(String[] args) {
        PipedInputStream pipedInputStream=new PipedInputStream();
        PipedOutputStream pipedOutputStream=new PipedOutputStream();
        try{
            pipedInputStream.connect(pipedOutputStream);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        Thread producer=new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    pipedOutputStream.write(("data" + i + "\n").getBytes());
                    Thread.sleep(1000);
                }
                pipedOutputStream.close();
               }
                catch (IOException | InterruptedException e){
                    e.printStackTrace();
                }

        });

        Thread consumer=new Thread(() ->{
            int data;
            try {
                while ((data=pipedInputStream.read())!=-1){
                    System.out.print((char)data+" ");
                }
                pipedInputStream.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }


        });

        producer.start();
        consumer.start();
    }
}
