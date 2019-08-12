package ru.job4j.oop;

public class Maniac extends Doctor {
    public void kill(Materials material, Patient patient) {
        //убивает принятого в метод пациента, используя заданный инструмент
    }

    //пытаюсь переписать метод класса-дедушки (Profession), а не родителя(Doctor). Так можно?
    @Override
    public void pretend() {
        //не умеет притворяться, что много работы, но притворяется, что Surgeon или другой профессии
    }
}

