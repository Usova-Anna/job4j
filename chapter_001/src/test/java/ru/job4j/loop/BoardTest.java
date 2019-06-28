package ru.job4j.loop;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/** @author Anna
 * @version 1.0
 * @since 28th June 2019
 */
public class BoardTest {
    @Test
    public void when3X3() {
        Board board = new Board();
        String testedCheck = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(testedCheck, is(String.format("X X%s X %sX X%s", ln, ln, ln)));
    }
    @Test
    public void when4X5() {
        Board board = new Board();
        String testedCheck = board.paint(4, 5);
        String ln = System.lineSeparator();
        assertThat(testedCheck, is(String.format("X X %s X X%sX X %s X X%sX X %s", ln, ln, ln, ln, ln)));

    }
}
