package untitled.src.main.java.org.example.modul3.homework.lesson8.ex1;

import java.util.*;

public class Employee {
    private String name;
    private String lastName;
    private List<Integer> age;
    private Set<String> country;
    private Map<Integer, String> homeAddress;


    public Employee(List<Integer> age, Set<String> country, Map<Integer, String> homeAddress, String lastName, String name) {
        this.age = age;
        this.country = country;
        this.homeAddress = homeAddress;
        this.lastName = lastName;
        this.name = name;
    }


    public List<Integer> getAge() {
        return age;
    }

    public void setAge(List<Integer> age) {
        this.age = age;
    }


    public Set<String> getCountry() {
        return country;
    }

    public void setCountry(Set<String> country) {
        this.country = country;
    }


    public Map<Integer, String> getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Map<Integer, String> homeAddress) {
        this.homeAddress = homeAddress;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Test2 {
        public static void main(String[] args) {

        }
    }
}

