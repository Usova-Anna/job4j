package ru.job4j.loop;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void whenNis0() {
        Factorial resultatik = new Factorial();
        int tested = resultatik.calc(0);
        assertThat(tested, is(1));
    }

    @Test
    public void whenNis1() {
        Factorial resultatik = new Factorial();
        int tested = resultatik.calc(1);
        assertThat(tested, is(1));
    }

    @Test
    public void whenNis5() {
        Factorial resultatik = new Factorial();
        int tested = resultatik.calc(5);
        assertThat(tested, is(120));
    }
}
