package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {

        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Пётр", "Арсентьев", "534872", "Брянск"));
        ArrayList<Person> found = phones.find("Пётр");
        assertThat(found.get(0).getSurname(), is("Арсентьев"));
    }

    @Test
    public void whenFindBySurname() {

        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Пётр", "Арсентьев", "534872", "Брянск"));
        ArrayList<Person> found = phones.find("рсен");
        assertThat(found.get(0).getPhone(), is("534872"));
    }

    @Test
    public void whenFindByPhone() {

        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Пётр", "Арсентьев", "534872", "Брянск"));
        ArrayList<Person> found = phones.find("872");
        assertThat(found.get(0).getSurname(), is("Арсентьев"));
    }

    @Test
    public void whenFindByAddress() {

        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Пётр", "Арсентьев", "534872", "Брянск"));
        ArrayList<Person> found = phones.find("ря");
        assertThat(found.get(0).getSurname(), is("Арсентьев"));
    }
}
