package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArrayCharTest {
    @Test
    public void whenStartsWithPrefix() {
        ArrayChar line = new ArrayChar();
        String checkedLine = "Хорошее начало";
        String checkedPrefix = "Хорош";
        boolean testedResult = line.startsW(checkedLine, checkedPrefix);
        assertThat(testedResult, is(true));
    }

    @Test
    public void whenDoesNotStartWithPrefix() {
        ArrayChar line = new ArrayChar();
        String checkedLine = "Хорошее начало";
        String checkedPrefix = "хорош";
        boolean testedResult = line.startsW(checkedLine, checkedPrefix);
        assertThat(testedResult, is(false));
    }

}
