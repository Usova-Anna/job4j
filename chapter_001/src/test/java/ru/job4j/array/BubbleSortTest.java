package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BubbleSortTest {
    @Test
    public void whenArrayIs9625341() {
        BubbleSort bubble = new BubbleSort();
        int[] array = {9, 6, 2, 5, 3, 4, 1};
        int[] testedArray = bubble.sorted(array);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 9};
        assertThat(testedArray, is(expectedArray));
    }
}

