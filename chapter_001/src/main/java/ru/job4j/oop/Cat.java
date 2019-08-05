package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    /**
     * Этим методом заполняем поле food объекта класса Cat.
     */
    public void eat(String meat) {
        this.food = meat;
    }

    public void showFood() {
        System.out.println(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void showNick() {
        System.out.println("His name is " + this.name);
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        peppy.giveNick("Пеппи");
        sparky.giveNick("Блестящий");
        peppy.food = "Котлета"; //Пробую прямое обращение к полю объекта
        sparky.eat("Вискас"); //Обращение к полю food через метод eat
        peppy.showNick();
        peppy.showFood();
        sparky.showNick();
        sparky.showFood();
    }
}

