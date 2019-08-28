package ru.job4j.inheritance;

public class Animal {
    public Animal() {
        System.out.println("Конструктор Animal");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Работает конструктор класса Animal после создания объекта Animal");

    }
}
