package ru.job4j.collection;
//212656 Паспорт и жители
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод добавляет гражданина в зависимости от того, был ли гражданин в citizens
     */
    public boolean add(Citizen citizen) {
        return citizens.putIfAbsent(citizen.getPassport(), citizen) == null;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}