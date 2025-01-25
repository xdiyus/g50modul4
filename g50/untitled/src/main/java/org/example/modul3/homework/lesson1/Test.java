package untitled.src.main.java.org.example.modul3.homework.lesson1;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {


        try {
            m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private static void m1() {
        m2();
    }

    private static void m2() {

        try {
            m3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void m3() {
        StudentService students = new StudentServiceImpl();

        students.display();
        Student student1 = new Student(18, "Diana", "+998900987988");
        Student student2 = new Student(20, "Eldor", "+998334568941");
        students.display();
        students.add(student1);
        students.add(student2);
        students.display();
        students.getById(UUID.randomUUID());
    }
}
