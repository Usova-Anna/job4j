package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void whenFirst3Second1Then3() {
        Max chislo = new Max();
        int resultTested = chislo.max(3, 1);
        assertThat(resultTested, is(3));
    }
    @Test
    public void whenFirst1Second4Then4() {
        Max chislo = new Max();
        int resultTested = chislo.max(1, 4);
        assertThat(resultTested, is(4));
    }

    @Test
    public void whenEqual() {
        Max chislo = new Max();
        int resultTested = chislo.max(-5, -5);
        assertThat(resultTested, is(-5));
    }

    @Test
    public void whenComparing4AndMaxIs1st() {
        Max chislo = new Max();
        int resultTested = chislo.max(9,2,-6,3);
        assertThat(resultTested, is(9));
    }
    @Test
    public void whenComparing4AndMaxIs2nd() {
        Max chislo = new Max();
        int resultTested = chislo.max(-9,9,6,3);
        assertThat(resultTested, is(9));
    }
    @Test
    public void whenComparing4AndMaxIs3rd() {
        Max chislo = new Max();
        int resultTested = chislo.max(-9,2,6,3);
        assertThat(resultTested, is(6));
    }

    @Test
    public void whenComparing4AndMaxIs4th() {
        Max chislo = new Max();
        int resultTested = chislo.max(-9,2,-6,3);
        assertThat(resultTested, is(3));
    }

}
