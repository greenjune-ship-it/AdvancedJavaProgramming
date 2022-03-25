package working_with_files_and_directories.directoriesexample;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {

    public static void main(String[] args) {

        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };

        // list files in a directory
        String[] contents = new File(".").list(filter);
        for (String file : contents) {
            System.out.println(file);
        }

        // create new directory
        new File("myDirectory").mkdir();

    }

}
