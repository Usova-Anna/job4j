package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {

    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        double[] arrayTested = square.calculate(bound);
        double[] arrayExpected = new double[]{1, 4, 9};
        assertThat(arrayTested, is(arrayExpected));
    }

}
