package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] testedArrayWDuplicates = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] testedResult = duplicate.removeDuplicates(testedArrayWDuplicates);
        String[] expectedResult = {"Привет", "Мир", "Супер"};
        assertThat(testedResult, is(expectedResult));
    }
}
