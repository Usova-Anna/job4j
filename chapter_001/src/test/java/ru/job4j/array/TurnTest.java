package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TurnTest {
    @Test
    public void whenArrayIs6() {
        Turn turn = new Turn();
        int[] numbers = {2, 3, 4, 5, 6, 7};
        int[]testedArrayAfterTurn = turn.back(numbers);
        int[] expectedArrayAfterTurn = {7, 6, 5, 4, 3, 2};
        assertThat(testedArrayAfterTurn, is(expectedArrayAfterTurn));
    }

    @Test
    public void whenArrayIs5() {
        Turn turn = new Turn();
        int[] numbers = {2, 3, 4, 5, 6};
        int[] testedArrayAfterTurn = turn.back(numbers);
        int[] expectedArrayAfterTurn = {6, 5, 4, 3, 2};
        assertThat(testedArrayAfterTurn, is(expectedArrayAfterTurn));
    }
}
