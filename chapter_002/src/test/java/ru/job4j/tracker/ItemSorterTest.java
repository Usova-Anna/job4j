package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSorterTest {
    @Test
    public void when3ItemsAscending() {
        List<Item> itemsToSort = Arrays.asList(
                new Item("Sort things later"),
                new Item("Do it some day"),
                new Item("Just don't do it")
                                              );
        ItemSorter it = new ItemSorter();
        List<Item> result = it.sortAZ(itemsToSort);
        List<Item> expected = Arrays.asList(
                new Item("Do it some day"),
                new Item("Just don't do it"),
                new Item("Sort things later")
                                           );
        assertThat(result.get(0).getName(), is(expected.get(0).getName()));
        assertThat(result.get(1).getName(), is(expected.get(1).getName()));
        assertThat(result.get(2).getName(), is(expected.get(2).getName()));
    }

    @Test
    public void when3ItemsDescending() {
        List<Item> itemsToSort = Arrays.asList(
                new Item("Sort things later"),
                new Item("Do it some day"),
                new Item("Just don't do it")
                                              );
        ItemSorter it = new ItemSorter();
        List<Item> result = it.sortZA(itemsToSort);
        List<Item> expected = Arrays.asList(
                new Item("Sort things later"),
                new Item("Just don't do it"),
                new Item("Do it some day")
                                           );
        assertThat(result.get(0).getName(), is(expected.get(0).getName()));
        assertThat(result.get(1).getName(), is(expected.get(1).getName()));
        assertThat(result.get(2).getName(), is(expected.get(2).getName()));
    }
}
