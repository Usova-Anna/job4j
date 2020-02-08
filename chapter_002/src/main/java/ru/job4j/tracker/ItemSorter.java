package ru.job4j.tracker;

import java.util.Collections;
import java.util.List;

public class ItemSorter {

    //сортировка по возрастанию
    public List<Item> sortAZ(List<Item> items) {
        System.out.println("Not sorted:\n" + items + "\n");
        Collections.sort(items, new ItemComparator());
        System.out.println("Sorted using Comparator (ascending):\n" + items + "\n");
        return items;
    }

    //сортировка по убыванию
    public List<Item> sortZA(List<Item> items) {
        System.out.println("Not sorted:\n" + items + "\n");
        Collections.sort(items, new ItemComparatorDescending());
        System.out.println("Sorted using Comparator (descending):\n" + items);
        return items;
    }
}
