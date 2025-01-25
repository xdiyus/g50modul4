package untitled.src.main.java.org.example.modul3.homework.lesson1;

public class StudentAlreadyExistException extends RuntimeException {
    public StudentAlreadyExistException(String phoneNumber) {
        super(String.format("%s phoned student already exists", phoneNumber));
    }
}
