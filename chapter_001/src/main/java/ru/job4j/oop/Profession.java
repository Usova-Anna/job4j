package ru.job4j.oop;

public class Profession {
    public String name;
    public String surname;
    public String education;
    public String birthday;

    public Profession(String name) {
        this.name = name;
    }

    public Profession() {
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String education() {
        return this.education;
    }

    public String birthday() {
        return this.birthday;
    }

    public void getJob() {
        //устраивается на работу
    }

    public void makeImpression() {
        //представляется
    }

    public void pretend() {
        //притворяется, что много работы
    }

    public void takeSalary() {
        //получает зарплату
    }
}
