package modul4.classwork.less7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderClass {
    public static void main(String[] args) {

        try (Reader reader = new FileReader("io/doc.txt");
             Writer writer = new FileWriter("io/kdoc.txt", true)) {

//            StringBuilder sb = new StringBuilder();
//            while (reader.ready()) {
//                sb.append((char) reader.read());
//            }
//            System.out.println(sb);

            reader.transferTo(writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
