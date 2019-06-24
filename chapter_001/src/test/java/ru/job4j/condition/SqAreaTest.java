package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class SqAreaTest {
    @Test
    public void findSquareAreaWhenp4k1s1() {
        assertThat(new SqArea().findSquare(6, 2), is(2d));
    }

}
