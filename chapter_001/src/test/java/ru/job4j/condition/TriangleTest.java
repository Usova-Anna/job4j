package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class TriangleTest {
    @Test
    public void whenAreaSet3PointsThenTriangleArea() {
        Point a = new Point (0,0); //точки
        Point b = new Point (0,2);
        Point c = new Point (2,0);
        Triangle triangle = new Triangle(a,b,c); //создаём объект треугольник.
        double resultTested = triangle.area(); //вычисляем площадь
        double expected = 2d; //задаём ожидаемый разультат
        assertThat(resultTested, closeTo(expected, 0.1)); //ожидаемый результат
    }
}
