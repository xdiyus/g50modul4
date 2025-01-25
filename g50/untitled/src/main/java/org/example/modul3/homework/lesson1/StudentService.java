package untitled.src.main.java.org.example.modul3.homework.lesson1;

import java.util.UUID;

public interface StudentService {
    void display();

    void add(Student student);

    void edit( UUID id, StudentDTO studentDTO);

    void delete(UUID id);

    void getById(UUID id);

}
