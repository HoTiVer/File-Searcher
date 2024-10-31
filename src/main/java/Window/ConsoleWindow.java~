package Window;

import Searcher.FileSearcher;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ConsoleWindow extends JFrame {
    private JTextArea textArea;
    private JTextField textField;
    private String outputFileName;
    private FileSearcher fileSearcher;
    File rootDirectory = new File("C:\\");

    public ConsoleWindow() {
        // Настройка окна
        setTitle("Java Console");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем текстовую область для вывода
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Создаем текстовое поле для ввода команд
        textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                textArea.append("> " + input + "\n");
                textField.setText("");

                // Здесь можно обработать введенную команду
                processCommand(input);
            }
        });

        // Добавляем элементы на окно
        add(scrollPane, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);

        fileSearcher = new FileSearcher();
    }

    // Метод для обработки команд
    private void processCommand(String command) {
        // Пример вывода результата
        //textArea.append("Executing command: " + command + "\n");
        outputFileName = command;
        List<File> resultFiles = fileSearcher.searchFiles(rootDirectory, outputFileName);
        // Выводим найденные файлы
        for (File file : resultFiles) {
            textArea.append("Найден файл: " + file + "\n");
        }
        //textArea.append("Найден файл: " + command + "\n");
    }

    public String getOutputFileName(){
        return outputFileName;
    }

    public void startConsoleWindow(){
        SwingUtilities.invokeLater(() -> {
            ConsoleWindow console = new ConsoleWindow();
            console.setLocationRelativeTo(null);
            console.setVisible(true);
        });
    }
}
