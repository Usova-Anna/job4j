package ru.job4j.oop;

public class Builder extends Engineer {
    public House build(Materials material) {
        //строит дом
        return new House();
    }
}
