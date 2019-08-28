package ru.job4j.inheritance;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Вызвался super() класса predator");
    }
    public static void main(String[] args) {

        Predator predator = new Predator();
        System.out.println("Работает конструктор класса Predator");
    }
}
