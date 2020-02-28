package ru.job4j.collection;

import java.util.Comparator;

/**
 * Сравнивая департаменты первой иерархии, сортирует по убыванию
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] temp_o1 = o1.split("/");
        String[] temp_o2 = o2.split("/");
        return temp_o2[0].compareTo(temp_o1[0]);
    }
}
