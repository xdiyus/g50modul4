package untitled.src.main.java.org.example.modul3.homework.lesson1;

import java.util.Objects;
import java.util.UUID;

public class StudentServiceImpl implements StudentService {
    Student[] students = new Student[10];

    @Override
    public void display() {

        for (Student student : students) {
            if (Objects.nonNull(student)) {
                System.out.println(student);

            }
        }
    }

    @Override
    public void add(Student student) {

        for (Student student1 : students) {
            if (student1 != null && student.getPhoneNumber().equals(student1.getPhoneNumber())) {
                throw new StudentAlreadyExistException(student.getPhoneNumber());
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (Objects.isNull(students[i])) {
                students[i] = student;
                System.out.println("Student qoshildi");
                return;
            }

        }
    }


    @Override
    public void edit(UUID id, StudentDTO studentDTO) {
        for (Student student : students) {
            if (Objects.nonNull(student) && Objects.equals(student.getId(), id)) {
                student.setAge(studentDTO.getAge());
                student.setName(studentDTO.getName());
                student.setPhoneNumber(studentDTO.getPhoneNumber());
                System.out.println("Student qoshildi!");
                return;
            }
        }

    }

    @Override
    public void delete(UUID id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && Objects.equals(students[i].getId(), id)) {
                students[i] = null;
                System.out.println("Kiritilgan ID  studenti ochirildi");
            }
        }
    }

    @Override
    public void getById(UUID id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && Objects.equals(students[i].getId(), id)) {
                System.out.println("ID topoldi");

            }
        }
        throw new StudentNotFoundExceptionga("ID topilmdi! ");
    }
}
