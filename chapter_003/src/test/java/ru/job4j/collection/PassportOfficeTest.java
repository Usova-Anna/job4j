package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {
    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addWhenCitizenAlreadyExists() {
        Citizen man = new Citizen("1236 996655", "Ужесин Есть Присутствуевич");
        PassportOffice po = new PassportOffice();
        po.add(man);
        boolean actual = po.add(man);
        boolean expected = false; //не добавлен второй раз, т.к. уже присутствует
        assertThat(actual, is(expected));
    }
}
