package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isUnique(String originText, String duplicateText) {

        boolean rsl = false; //тексты одинаковые
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String originWord : origin) {
            check.add(originWord); //получаем HashSet с уникальными словами текста origin
        }
        for (String checkedWord : text) {
            if (!check.contains(checkedWord)) { //если текст не содержит слово
                rsl = true; //то текст уникальный
                break;
            }

        }
        return rsl;
    }
}
