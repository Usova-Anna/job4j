package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SqMaxTest {
    @Test
    public void whenMaxisFirst() {
        int first = 10, second = 4, third = 3, fourth = 2;
        SqMax sqmax = new SqMax();
        int tested = SqMax.max(first, second, third, fourth);
        assertThat(tested, is(10));
    }

    @Test
    public void whenMaxisSecond() {
        int first = 4, second = 10, third = 3, fourth = 2;
        SqMax sqmax = new SqMax();
        int tested = SqMax.max(first, second, third, fourth);
        assertThat(tested, is(10));
    }

    @Test
    public void whenMaxisThird() {
        int first = 4, second = 3, third = 10, fourth = 2;
        SqMax sqmax = new SqMax();
        int tested = SqMax.max(first, second, third, fourth);
        assertThat(tested, is(10));
    }

    @Test
    public void whenMaxisFourth() {
        int first = 4, second = 3, third = 2, fourth = 10;
        SqMax sqmax = new SqMax();
        int tested = SqMax.max(first, second, third, fourth);
        assertThat(tested, is(10));
    }
}
