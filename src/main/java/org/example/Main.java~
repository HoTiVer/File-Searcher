package org.example;

import Directory.FileDirectory;
import Searcher.FileSearcher;
import Window.ConsoleWindow;
import java.io.Console;
import java.io.File;
import java.io.SyncFailedException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleWindow window = new ConsoleWindow();
        FileSearcher fileSearcher = new FileSearcher();

        FileDirectory fileDirectory = new FileDirectory();

        File rootDirectory = new File("C:\\");
        fileDirectory.getRootDirectory();


        String searchTerm = "qt";

        window.startConsoleWindow();

        //List<File> resultFiles = fileSearcher.searchFiles(rootDirectory, searchTerm);

        // Выводим найденные файлы
//        for (File file : resultFiles) {
//            System.out.println("Найден файл: " + file.getAbsolutePath());
//        }

    }
}