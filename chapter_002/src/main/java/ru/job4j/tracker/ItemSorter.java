package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {

        List<Item> items = Arrays.asList(
                new Item("Sort things later"),
                new Item("Do it some day"),
                new Item("Just don't do it")
        );
        System.out.println("Not sorted:\n"+items+"\n");
        Collections.sort(items,new ItemComparator());
        System.out.println("Sorted using Comparator (ascending):\n"+items+"\n");
        Collections.sort(items, new ItemComparatorDescending());
        System.out.println("Sorted using Comparator (descending):\n"+items);
    }
}
