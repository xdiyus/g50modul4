package modul4.homework.less7.ex3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LongWordd {


    public static String findLong(String file) {
        String longW = "";
        StringBuilder currentWord = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if (Character.isLetterOrDigit(ch)) {
                        currentWord.append(ch);
                    } else {
                        if (currentWord.length() > longW.length()) {
                            longW = currentWord.toString();
                        }
                        currentWord.setLength(0);
                    }
                }
                if (currentWord.length() > longW.length()) {
                    longW = currentWord.toString();
                }
            }


        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return longW;
    }


    public static void main(String[] args) {

        String file = "C:/Users/usupo/IdeaProjects/untitled2/dianaa/dindin.txt";


        String uzunWord = findLong(file);


        if (!uzunWord.isEmpty()) {
            System.out.println("Eng uzun so'z: " + uzunWord);
        } else {
            System.out.println("Error! ");
        }
    }

}
