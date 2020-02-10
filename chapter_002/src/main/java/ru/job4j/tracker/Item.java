package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private String id;
    private String name;


    public Item(String name) {
        this.id = this.generateId();
        this.name = name;

    }

    public String generateId() {
        //Реализовать метод генерации.
        String id = String.valueOf((int) (Math.random() * 100500 + 1));
        return id;
    }

    public String getId() {
        return id; //Это this.id?
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

@Override
    public String toString() {
        return "\n{"+ this.name+"}";
}




}





