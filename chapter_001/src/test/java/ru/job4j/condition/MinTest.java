package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinTest {
    @Test
    public void whenMinIs2nd() {
        int[] testedArray = {3,1,2};
        int testedResult = Min.findMinindex(testedArray, 1);
        int expectedResult = 1;
        assertThat(testedResult, is(expectedResult));
    }
}
