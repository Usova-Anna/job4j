package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MergeTest {
    @Test
    public void whenLeftAndRightAreMerged() {
        int[] testedArray1 = {-20,-18,-6,0,1};
        int[] testedArray2 = {-19, -18, 0, 2};
        int[] expectedResult = {-20,-19,-18,-6,0,0,1,2};
        Merge midget = new Merge();
        int[] testedResult = midget.merge(testedArray1, testedArray2);
        assertThat (testedResult, is(expectedResult));

    }

}
