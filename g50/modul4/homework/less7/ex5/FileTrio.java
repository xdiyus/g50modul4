package modul4.homework.less7.ex5;

import java.io.*;

public class FileTrio {
    public static void main(String[] args) {


        String file1 = "gigida/f1.txt";
        String file2 = "gigida/f2.txt";
        String outputFile = "gigida/f3.txt";

        try (
                BufferedReader reader1 = new BufferedReader(new FileReader(file1));
                BufferedReader reader2 = new BufferedReader(new FileReader(file2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }


            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Birlashtirildi: " + outputFile);
        } catch (
                IOException e) {
            System.err.println("Error : " + e.getMessage());
        }
    }

}
