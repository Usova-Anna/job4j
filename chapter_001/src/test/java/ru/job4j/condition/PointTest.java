package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {
    @Test
    public void whenX5Y4X2Y3() {
        Point point = new Point();
        double tested = point.distance(5, 2, 4, 3);
        double expected = 3.1622776601683795;
        assertThat(tested, is(expected));
    }
}
