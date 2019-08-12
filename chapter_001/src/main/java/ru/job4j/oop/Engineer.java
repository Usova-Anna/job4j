package ru.job4j.oop;

public class Engineer extends Profession {

    public Engineer(String name) {
        super(name);
    }
    public Engineer() {
    }

    public void fix(Materials material) {
        //ремонтирует
    }

    public String invent() {
        //изобретает
        return "Я что-то придумал!";
    }


}
