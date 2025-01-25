package modul4.homework.less7.ex1;

import java.io.File;

public class FileSearch {

    public static void searchFile(String directory, String searchText) {
        File file = new File(directory);

        if (!file.exists() || !file.isDirectory()) {
            throw new IllegalArgumentException("Bunaqa directory yoq!" + file);
        }
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {

                if (file1.getName().toLowerCase().contains(searchText.toLowerCase())) {
                    System.out.println("Topildi: " + file1.getAbsolutePath());
                }
                if (file1.isDirectory()) {
                    searchFile(file1.getAbsolutePath(), searchText);
                }
            }
        }
    }

    public static void main(String[] args) {

        String directory = "C:\\Users\\usupo\\IdeaProjects\\untitled2\\g50\\modul4\\homework\\less7\\ex1";
        String search = "DianaYus";
        searchFile(directory, search);
    }
}
