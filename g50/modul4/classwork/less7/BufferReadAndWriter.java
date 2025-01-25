package modul4.classwork.less7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReadAndWriter {
    public static int countLine(String file) {
        int lineCount = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());

            return 0;
        }
        return lineCount;
    }

    public static void main(String[] args) {

        String file = "C:/Users/usupo/IdeaProjects/untitled2/dianaa/dindin.txt";


        int lineCount = countLine(file);
        if (lineCount > 0) {
            System.out.println("Number of lines: " + lineCount);
        } else {
            System.out.println("Error: File is empty or doesn't exist.");
        }
    }
}
