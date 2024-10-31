package Searcher;

import Window.ConsoleWindow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
                            printInNewThread(file);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void printInNewThread(File file) {
        Thread thread = new Thread(() -> {
            ConsoleWindow.writeInWindowConsole(file);
        });
        thread.start();
    }
}
