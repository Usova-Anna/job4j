//package ru.job4j.loop;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import java.util.StringJoiner;
//import static org.hamcrest.Matchers.is;
//
//
//public class PaintTest {
//    /**Тестирует правосторонний треугольник
//     *
//     */
//    @Test
//    public void whenPyramid4Right() {
//        Paint paint = new Paint();
//        String rightTestedTrl = paint.rightTrl(4);
//        System.out.println(rightTestedTrl); //печатаем тестируемый объект
//        assertThat(rightTestedTrl,  is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
//                .add("^   ")
//                .add("^^  ")
//                .add("^^^ ")
//                .add("^^^^")
//                .toString()
//        ));
//
//    }
//    /**Тестирует левосторонний треугольник
//     *
//     */
//    @Test
//    public void whenPyramid4Left() {
//        Paint paint = new Paint();
//        String leftTestedTrl = paint.leftTrl(4);
//        System.out.println(leftTestedTrl);
//        assertThat(leftTestedTrl, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
//                .add("   ^")
//                .add("  ^^")
//                .add(" ^^^")
//                .add("^^^^")
//                .toString()
//        ));
//    }
//
//    /**Тестирует пирамиду
//     *
//     */
//    @Test
//    public void whenPyramid4Whole() {
//        Paint paint = new Paint();
//        String testedPyramide = paint.pyramide(4);
//        System.out.println("Tested Pyramide is:\n" + testedPyramide);
//        String expectedPyramide = new StringJoiner(System.lineSeparator(), "", System.lineSeparator()).add("   ^   ").add("  ^^^  ").add(" ^^^^^ ").add("^^^^^^^").toString();
//        assertThat(testedPyramide,  is(expectedPyramide));
//    }
//}
