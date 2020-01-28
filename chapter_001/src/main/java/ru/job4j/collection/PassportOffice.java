package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод добавляет гражданина вне зависимости от того, был ли гражданин в citizens
     */
    public boolean add(Citizen citizen) {
        citizens.put(citizen.getPassport(), citizen);
        return true;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}