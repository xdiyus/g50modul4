package exem.HashSet;

import javax.management.ObjectName;
import java.util.Objects;

public class HashSet {

    private String name;
    private int age;

    public HashSet(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
       return Objects.hash(age,name);
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }if(obj == null){
            return false;
        }if(!(obj instanceof HashSet hashSet)){
            return false;
        }
        return Objects.equals(name, hashSet.name) && Objects.equals(age,hashSet.age);




    }




}
