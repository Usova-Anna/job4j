package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MultiMaxTest {
    @Test
    public void whenFirstIsMax() {
        MultiMax check = new MultiMax();
        int tested = check.max(8, 6, 2);
        assertThat(tested, is(8));
    }
    @Test
    public void whenSecondIsMax() {
        MultiMax check = new MultiMax();
        int tested = check.max(8, 12, 2);
        assertThat(tested, is(12));
    }

    @Test
    public void whenThirdIsMax() {
        MultiMax check = new MultiMax();
        int tested = check.max(8, 6, 20);
        assertThat(tested, is(20));
    }


}



