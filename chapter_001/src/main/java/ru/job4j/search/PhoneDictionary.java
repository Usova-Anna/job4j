package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {

        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подошедщих пользователей.
     */
    public ArrayList<Person> find(String key) {

        ArrayList<Person> result = new ArrayList<>();
        for (Person x : persons) {
            if (x.getName().contains(key)) { //Поиск только по полю Имён
                result.add(x);
            }
            if (x.getSurname().contains(key)) { //Поиск только по полю Фамилий
                result.add(x);
            }
            if (x.getAddress().contains(key)) { //Поиск только по полю адресов
                result.add(x);
            }
            if (x.getPhone().contains(key)) { //Поиск по полю номеров
                result.add(x);
            }

        }
        return result;
    }
}