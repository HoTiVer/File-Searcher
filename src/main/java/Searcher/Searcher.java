package Searcher;

import java.io.File;
import java.util.List;

public interface Searcher {
    public void searchFiles(File directory, String searchTerm);
    public void printInNewThread(File file);
}
