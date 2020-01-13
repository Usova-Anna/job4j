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
            if (x.getName().contains(key) || x.getSurname().contains(key) || x.getAddress().contains(key) || x.getPhone().contains(key)) { //Поиск только по полям: имя, фамилия, адрес, номер
                result.add(x);

            }

        }
        return result;
    }
}