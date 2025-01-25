package untitled.src.main.java.org.example.modul3.homework.lesson1;

import java.util.UUID;

public class Student {

    private UUID id;
    private String name;
    private int age;
    private String phoneNumber;

    public Student(int age, String name, String phoneNumber) {
        this.age = age;
        this.id = UUID.randomUUID();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0) {
            throw new InvalidAgeException("Yosh 0 dan kichkina student mas!");
        }
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
