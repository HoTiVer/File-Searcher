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

        window.startConsoleWindow();
    }
}