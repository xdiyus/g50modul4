package untitled.src.main.java.org.example.modul3.homework.lesson8.ex3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee3 {

    private List<Integer> yearsOfExperience;
    private Set<String> visitedCountries;
    private Map<Integer, String> officeLocations;
    private String surname;
    private String firstName;


    public Employee3(String firstName, Map<Integer, String> officeLocations, String surname, Set<String> visitedCountries, List<Integer> yearsOfExperience) {
        this.firstName = firstName;
        this.officeLocations = officeLocations;
        this.surname = surname;
        this.visitedCountries = visitedCountries;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Map<Integer, String> getOfficeLocations() {
        return officeLocations;
    }

    public void setOfficeLocations(Map<Integer, String> officeLocations) {
        this.officeLocations = officeLocations;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<String> getVisitedCountries() {
        return visitedCountries;
    }

    public void setVisitedCountries(Set<String> visitedCountries) {
        this.visitedCountries = visitedCountries;
    }

    public List<Integer> getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(List<Integer> yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}