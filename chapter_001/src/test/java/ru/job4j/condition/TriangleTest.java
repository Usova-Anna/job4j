package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class TriangleTest {
    @Test
    public void whenAreaSet3PointsThenTriangleArea() {
        Triangle triangle = new Triangle(); //создаём объект треугольник.
        double resultTested = triangle.area(0, 0, 0, 2, 2, 0); //вычисляем площадь
        double expected = 2d; //задаём ожидаемый разультат
        assertThat(resultTested, closeTo(expected, 0.1)); //ожидаемый результат
    }
}
