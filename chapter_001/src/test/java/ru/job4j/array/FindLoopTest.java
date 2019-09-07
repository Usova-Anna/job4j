package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {
    @Test
    public void whenElementFoundThen2() {
        FindLoop iskalka = new FindLoop();
        int testedFoundIndex = iskalka.indexOf(new int[]{30, 35, 16}, 16);
        int expectedFoundIndex = 2;
        assertThat(testedFoundIndex, is(expectedFoundIndex));
    }

    @Test
    public void whenElementNotFoundThenMinus1() {
        FindLoop iskalka = new FindLoop();
        int testedFoundIndex = iskalka.indexOf(new int[]{5, 7, 2}, 9);
        int expectedFoundIndex = -1;
        assertThat(testedFoundIndex, is(expectedFoundIndex));
    }

    @Test
    public void whenFind3() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{3, 4, -8};
        int result[] = find.sort(input);
        int[] expect = new int[]{-8, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{3, 4, 1, 2, 5};
        int result[] = find.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}
