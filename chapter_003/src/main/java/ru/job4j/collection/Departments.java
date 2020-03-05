package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                System.out.println(el);
                start = start + el;
                tmp.add(start);
                start = start + "/";
            }
        }
        System.out.println();
        for (String x : tmp) {
            System.out.println(x);
        }
        List<String> rsl = new ArrayList<>(tmp);
        sortAsc(rsl);
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {

        Collections.sort(orgs, Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp().thenComparing(Comparator.naturalOrder()));
    }
}
