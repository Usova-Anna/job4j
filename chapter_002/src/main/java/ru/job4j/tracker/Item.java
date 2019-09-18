package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private String id;
    private String name;
    private String desc;
    private long time;

    public Item(String name, String desc, long time) {
        this.id = this.generateId();
        this.name = name;
        this.desc = desc;
        this.time = time;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override //А если без @override?
    public boolean equals(Object o) { //Сравнивает 2 объекта item (2 заявки)
        if (this == o) return true; //ссылаются ли объекты на одну и ту же память (адрес ячейки)
        if (o == null || getClass() != o.getClass())
            return false; //Если объект не содержит ссылку или объекты разных классов?
        Item item = (Item) o; //Приводим объект к типу Item, Чтобы использовать методы объекта
        return time == item.time &&
                Objects.equals(id, item.id) &&
                Objects.equals(name, item.name) &&
                Objects.equals(desc, item.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, time);//Что за hash?
    }
}





