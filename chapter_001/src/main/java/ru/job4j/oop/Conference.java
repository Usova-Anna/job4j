package ru.job4j.oop;

public class Conference {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Вася");
        System.out.println(engineer.invent());
        System.out.println("Имя инженера: " + engineer.getName());
    }
}