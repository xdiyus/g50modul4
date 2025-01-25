package untitled.src.main.java.org.example.modul3.repeat3modul.ex8.ex1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee1 {
    private String name;
    private String lastName;
    private List<Integer> age;
    private Set<String> profession;
    private Map<Integer, String> address;

    public Employee1(Map<Integer, String> address, List<Integer> age, String lastName, String name, Set<String> profession) {
        this.address = address;
        this.age = age;
        this.lastName = lastName;
        this.name = name;
        this.profession = profession;
    }

    public Map<Integer, String> getAddress() {
        return address;
    }

    public void setAddress(Map<Integer, String> address) {
        this.address = address;
    }

    public List<Integer> getAge() {
        return age;
    }

    public void setAge(List<Integer> age) {
        this.age = age;
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

    public Set<String> getProfession() {
        return profession;
    }

    public void setProfession(Set<String> profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        StringBuilder stringMap = new StringBuilder();
        for (Integer key : address.keySet()) {
            String value = address.get(key);
            stringMap.append(key).append("/").append(value);
        }
        return String.format("Name: %s\n" + "Last name: %s\n" + "Age: %s\n" + "Profession: %s\n" + "Adress: %s\n",
                name, lastName, age, profession, stringMap);
    }
}



