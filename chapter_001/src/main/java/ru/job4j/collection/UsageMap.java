package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("arseniy@mail.ru", "Иванов Арсений Евгеньевич");
        map.put("arseniy@mail.ru", "Иванов Арсений Евгеньевич");//дублируем значение, которое внесётся только единожды
        map.put("egor@yandex.ru", "Кузнецов Егор Иванович");
        map.put("emelya@gmail.com", "Васин Емеля Дмитриевич");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Ключ " + key + "; значение - " + value);
        }
    }
}
