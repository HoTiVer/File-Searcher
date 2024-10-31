package Directory;

import java.io.File;

public class FileDirectory {
    final File rootDirectory;

    public FileDirectory(){
        rootDirectory = new File("C:\\");
    }

    public File getRootDirectory() {
        return rootDirectory;
    }
}
