package modul4.homework.less7.ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCon {

    public static int countLine(String str) {
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(str))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.err.println("Error! " + e.getMessage());
            return 0;
        }
        return lineCount;
    }

    public static void main(String[] args) {
        String file = "C:\\Users\\usupo\\IdeaProjects\\untitled2\\dianaa\\dindin.txt";

        int line = countLine(file);
        if (line > 0) {
            System.out.println("Lines: " + line);
        } else {
            System.out.println("error");
        }
    }

}