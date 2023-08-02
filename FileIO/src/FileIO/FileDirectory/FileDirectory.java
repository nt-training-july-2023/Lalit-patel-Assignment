package FileIO.FileDirectory;
import java.io.File;

public class FileDirectory {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\lalit\\OneDrive\\Documents";

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {

                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified directory does not exist.");
        }
    }
}

