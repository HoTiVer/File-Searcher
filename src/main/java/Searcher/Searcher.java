package Searcher;

import java.io.File;

public interface Searcher {
    public void searchFiles(File directory, String searchTerm);
    public void printFilePath(File file);
}
