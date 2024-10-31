package Searcher;

import java.io.File;
import java.util.List;

public interface Searcher {
    public List<File> searchFiles(File directory, String searchTerm);
}
