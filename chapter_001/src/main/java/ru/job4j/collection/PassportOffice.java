package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false; //процедура добавления не произведена
        boolean exists = true; //Такой гражданин уже есть в базе
        for (String key:citizens.keySet()) {
            if (!key.equals(citizen.getPassport())) {
                exists=false; //Такого гражданина нет
            }
        }
        if (!exists) { //Если такого гражданина нет
            citizens.put(citizen.getPassport(), citizen); //то добавляем его
            rsl = true;//добавлен
        }
        return rsl;
    }


    public Citizen get(String passport) {
        return null;
    }
}