package ru.job4j.loop;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class CounterTest {
    @Test
    public void whenRangeIsFrom1To10() {
        Counter counter = new Counter();
        int tested = counter.addEven(1, 10);
        int expected = 2 + 4 + 6 + 8 + 10;
        assertThat(tested, is(expected));
    }
}
