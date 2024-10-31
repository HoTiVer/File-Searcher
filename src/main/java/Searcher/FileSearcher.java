package Searcher;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher implements Searcher{
    @Override
    public List<File> searchFiles(File directory, String searchTerm) {
        List<File> foundFiles = new ArrayList<>();

        if (directory.isDirectory() && directory.canRead()) {
            // Получаем список файлов и проверяем на null
            File[] files = directory.listFiles();
            if (files != null) {
                // Перебираем все файлы и папки внутри текущей директории
                for (File file : files) {
                    if (file.isDirectory()) {
                        // Рекурсивный вызов для вложенной директории
                        foundFiles.addAll(searchFiles(file, searchTerm));
                    } else {
                        // Если это файл, проверяем его имя
                        if (file.getName().contains(searchTerm)) {
                            foundFiles.add(file);
                            //Потім видалити
                            System.out.println(file);
                        }
                    }
                }
            }
        }
        return foundFiles;
    }
}
