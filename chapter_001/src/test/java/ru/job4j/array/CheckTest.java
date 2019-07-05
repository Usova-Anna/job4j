package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckTest {
    @Test
    public void whenNumberOfElementsIsEven() {
        Check check = new Check();
        boolean[] checkedArray = {false, false, false, false};
        boolean testedResult = check.mono(checkedArray);
        boolean expectedResult = true;
        assertThat(testedResult, is(expectedResult));
    }

    @Test
    public void whenNumberOfElementsIsOdd() {
        Check check = new Check();
        boolean[] checkedArray = {false, false, false};
        boolean testedResult = check.mono(checkedArray);
        boolean expectedResult = true;
        assertThat(testedResult, is(expectedResult));
    }
}
