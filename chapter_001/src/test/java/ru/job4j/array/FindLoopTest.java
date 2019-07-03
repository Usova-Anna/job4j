package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class FindLoopTest {
    @Test
    public void whenElementFoundThen2() {
        FindLoop iskalka = new FindLoop();
        int testedFoundIndex = iskalka.indexOf(new int[] {30, 35, 16},  16);
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
}
