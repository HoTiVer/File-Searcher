package Window;

import Directory.FileDirectory;
import Searcher.FileSearcher;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ConsoleWindow extends JFrame {
    private static JTextArea textArea;
    private JTextField textField;
    private String outputFileName;
    private FileSearcher fileSearcher;


    public ConsoleWindow() {
        setTitle("File searcher");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                textArea.append("> " + input + "\n");
                textField.setText("");

                processCommand(input);
            }
        });

        add(scrollPane, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);

        fileSearcher = new FileSearcher();
    }

    private void processCommand(String command) {
        outputFileName = command;
        Thread thread = new Thread(() -> {
            fileSearcher.searchFiles(FileDirectory.getRootDirectory(), outputFileName);
        });
        thread.start();
    }

    public static void writeInWindowConsole(File file){
        textArea.append("Found path to file: " + file + "\n");
    }

    public void startConsoleWindow(){
        SwingUtilities.invokeLater(() -> {
            ConsoleWindow console = new ConsoleWindow();
            console.setLocationRelativeTo(null);
            console.setVisible(true);
        });
    }
}
