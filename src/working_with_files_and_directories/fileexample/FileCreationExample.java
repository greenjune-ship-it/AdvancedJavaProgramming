package working_with_files_and_directories.fileexample;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {

    public static void main(String[] args) {

        // abstract representation of file, no file has been created
        File myFile = new File("myFile.txt");
        try {
            // createNewFile method actually returns a Boolean value, not a file object
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
