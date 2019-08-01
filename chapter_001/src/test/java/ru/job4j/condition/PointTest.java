//package ru.job4j.condition;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertThat;
//import static org.hamcrest.Matchers.is;
//
//public class PointTest {
//    @Test
//    public void whenX5Y4X2Y3() {
//        Point a = new Point(0, 0);
//        Point b = new Point(2,2);
//        double tested = a.distance(b);
//        double expected = 3.1622776601683795;
//        assertThat(tested, is(expected));
//    }
//
//    @Test
//    public void whenX5Y4z1X2Y3z5() {
//        Point point = new Point(0, 0);
//        double tested = point.distance(5, 2, 4, 3);
//        double expected = 3.1622776601683795;
//        assertThat(tested, is(expected));
//    }
//
//    @Test
//    public void whenShowInfo() {
//        Point one = new Point(1, 1);
//        one.info();
//        Point another = new Point(2, 4);
//        another.info();
//    }
//}
