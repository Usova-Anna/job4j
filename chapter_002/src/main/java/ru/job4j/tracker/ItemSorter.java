package ru.job4j.tracker;

import java.util.Collections;
import java.util.List;

public class ItemSorter {

    //сортировка по возрастанию
    public List<Item> sortAZ(List<Item> items) {
        System.out.println("Not sorted:" + System.lineSeparator() + items + System.lineSeparator());
        Collections.sort(items, new ItemComparator());
        System.out.println("Sorted using Comparator (ascending):" + System.lineSeparator() + items + System.lineSeparator());
        return items;
    }

    //сортировка по убыванию
    public List<Item> sortZA(List<Item> items) {
        System.out.println("Not sorted:" + System.lineSeparator() + items + System.lineSeparator());
        Collections.sort(items, new ItemComparatorDescending());
        System.out.println("Sorted using Comparator (descending):" + System.lineSeparator() + items);
        return items;
    }
}
