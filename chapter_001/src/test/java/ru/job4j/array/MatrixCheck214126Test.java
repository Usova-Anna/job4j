package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MatrixCheck214126Test {


    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'Х', 'Х', 'Х'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck214126.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }
}