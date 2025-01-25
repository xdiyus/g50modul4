package modul4.classwork.less7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTes {
    public static void main(String[] args) {
       // Path path = Paths.get("io","doc.txt");
//        System.out.println(path);

//
//        try{
//            byte[] bytes = Files.readAllBytes(path);
//
//        } catch (IOException e) {


            Path inPUUT = Paths.get("io/doc.txt");
            Path inOutt = Paths.get("io2/doc/dia.txt");


            try {
                Files.copy(inPUUT,inOutt);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

