package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("K1/SK1", "K1/SK2","K1/SK1/SSK2", "K1/SK1/SSK1");
        fillGaps(list);
        sortAsc(list);
    }
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value:deps) {
            String start = "";
           // boolean isFirst = true;
            for (String el:value.split("/")){
                System.out.println(el);
            //    if (isFirst) {
                    tmp.add(el);
              //      isFirst = false;
              //  }

            }
        }
        List<String> rsl = new ArrayList<>(tmp);
        return rsl;
    }

    public static void sortAsc(List<String> orgs) {
Collections.sort(orgs, Comparator.naturalOrder());

    }
    public static void sortDesc(List<String> orgs) {
Collections.sort(orgs, new DepDescComp().thenComparing(Comparator.naturalOrder()));
    }
}
