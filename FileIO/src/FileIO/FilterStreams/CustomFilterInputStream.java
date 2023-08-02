package FileIO.FilterStreams;


import java.io.*;

public class CustomFilterInputStream extends FileInputStream {
    public CustomFilterInputStream(String filename) throws FileNotFoundException {
        super(filename);
    }
    @Override
    public int read() throws IOException {
        int data = super.read();
        if (data != -1) {
            // Double the value of the byte
            data = Character.toUpperCase((char) data);
        }
        return data;
    }
}
