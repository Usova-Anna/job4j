package ru.job4j.collection;

import java.util.Comparator;

/**
 * Сравнивая департаменты первой иерархии, сортирует по убыванию
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] tempO1 = o1.split("/");
        String[] tempO2 = o2.split("/");
        String o1the1St = tempO1[0];
        String o2the1St = tempO2[0];
        int result = o2the1St.compareTo(o1the1St);
        if (result == 0) {
            String o1TheRest = "";
            String o2TheRest = "";
            for (int i = 1; i < tempO1.length; i++) {
                o1TheRest = o1TheRest + tempO1[i] + "/";
            }
            for (int i = 1; i < tempO2.length; i++) {
                o2TheRest = o2TheRest + tempO2[i] + "/";
            }
            result = o1TheRest.compareTo(o2TheRest);
        }
        return result;
    }
}
