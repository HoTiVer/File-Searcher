package Searcher;

import Window.ConsoleWindow;
import java.io.File;

public class FileSearcher implements Searcher{
    @Override
    public void searchFiles(File directory, String searchTerm) {
        if (directory.isDirectory() && directory.canRead()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchFiles(file, searchTerm);
                    } else {
                        if (file.getName().contains(searchTerm)) {
                            printFilePath(file);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void printFilePath(File file) {
        ConsoleWindow.writeInWindowConsole(file);
    }
}
