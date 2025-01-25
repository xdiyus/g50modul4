package modul4.classwork.less7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;

public class DateInputOutPut {
    public static void main(String[] args) {

        try (DataInputStream dataOutputStream = new DataInputStream(new FileInputStream("io/doc.txt"))) {
            System.out.println( dataOutputStream.readFloat());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

