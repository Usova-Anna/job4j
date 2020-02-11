package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Пётр");
        list.add("Иван");
        list.add("Степан");

        for (String x:list) {
            System.out.println(x);
        }
    }
}
