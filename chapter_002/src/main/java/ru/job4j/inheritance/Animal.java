package ru.job4j.inheritance;

public class Animal {
    String name;

    public Animal(String name) {
        System.out.println("Конструктор Animal с параметром-именем");
        this.name = name;
    }

    public Animal() {
        System.out.println("Дефолтный конструктор Animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Зверь");
        System.out.println("Работает конструктор класса Animal после создания объекта Animal");
    }
}
