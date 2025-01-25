package untitled.src.main.java.org.example.modul3.homework.lesson8.ex4;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Copy {
    public static class Employee implements Cloneable {

        private String name;
        private int age;
        private Department department;

        public Employee(int age, String name, Department department) {
            this.age = age;
            this.department = department;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        @Override
        public Employee clone() {
            try {
                Employee clone = (Employee) super.clone();
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                //clone.setDepartment(this.department.clone());
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", department=" + department +
                    '}';
        }
    }


    public static class Department implements Cloneable {
        private int numDeparment;
        private String freeTime;


        public Department(String freeTime, int numDeparment) {
            this.freeTime = freeTime;
            this.numDeparment = numDeparment;
        }


        public String getBestDeparment() {
            return freeTime;
        }

        public void setBestDeparment(String freeTime) {
            this.freeTime = freeTime;
        }

        public int getNumDeparment() {
            return numDeparment;
        }

        public void setNumDeparment(int numDeparment) {
            this.numDeparment = numDeparment;
        }


        @Override
        public String toString() {
            return "Department{" +
                    "freeTime='" + freeTime + '\'' +
                    ", numDeparment=" + numDeparment +
                    '}';
        }

        @Override
        public Department clone() {
            try {
                Department clone = (Department) super.clone();
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }


    public static void main(String[] args) {
        Employee employee4 = new Employee(18, "Diana", new Department("Monday", 2));
        Employee employee5 = employee4.clone();
        employee4.setAge(15);
        employee4.getDepartment().setNumDeparment(16);
        System.out.println("employee4 = " + employee4);
        System.out.println("employee5 = " + employee5);

    }
}



