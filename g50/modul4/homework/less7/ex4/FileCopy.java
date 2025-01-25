package modul4.homework.less7.ex4;

import java.io.*;

public class FileCopy {
    public static void copyFile(String inputW, String outputW) {
        File inputFayl = new File(inputW);
        File outputFayl = new File(outputW);


        if (!inputFayl.exists()) {
            System.out.println("Topilmadi");
            return;
        }

        try (FileReader fileReader = new FileReader(inputFayl);
             FileWriter fileWriter = new FileWriter(outputFayl)) {

            int character;

            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("Fayl muvaffaqiyatli nusxalandi!");

        } catch (IOException e) {
            System.err.println("Xatolik: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        String inputW = "C:\\Users\\usupo\\IdeaProjects\\untitled2\\dianaa\\dindin.txt";
        String outputW = "C:\\Users\\usupo\\IdeaProjects\\untitled2\\dianaa\\dianaa1\\di.txt";

        copyFile(inputW, outputW);
    }
}
