package untitled.src.main.java.org.example.modul3.homework.lesson9.soli.ex3;
//Liskov Substitution Principle (Принцип подстановки Лисков)Если наследники не соответствуют поведению базового класса тогда мы не знаем что ожидать


public class Liskov {

    abstract class Vehicle {

        private String name;

        public Vehicle(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        abstract void move();
    }

    class Car extends Vehicle {
        public Car(String name) {
            super(name);
        }

        @Override
        void move() {
            System.out.println(getName() + " tezligi = 1");
        }
    }

    class Boat extends Vehicle {
        public Boat(String name) {
            super(name);
        }

        @Override
        void move() {
            System.out.println(getName() + " tezligi = 3");
        }
    }

    class Bicycle extends Vehicle {
        public Bicycle(String name) {
            super(name);
        }

        @Override
        void move() {
            System.out.println(getName() + " tezligi = 6");
        }


    }


}



