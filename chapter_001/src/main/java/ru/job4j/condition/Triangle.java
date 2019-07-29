package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second=bp;
        this.third=cp;
    }
    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param sideA расстояние между точками a b
     * @param sideB расстояние между точками a c
     * @param sideC расстояние между точками b c
     * @return полуперимента.
     */
    public double period(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC) / 2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Треугольник существует только тогда, когда сумма двух любых его сторон больше третьей.
     *
     * @param a Длина от точки a до b.
     * @param b Длина от точки a до c.
     * @param c Длина от точки b до c.
     * @return true - такой треугольник существует, false - не может существовать.
     */
    private boolean exist(double a, double c, double b) {
        return ((a + b) > c && (a + c) > b && (b + c) > a);
    }

    /**
     * Метод вычисляет площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - a) * (p - b) * (p - c)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = Point.distance(x1, y1, x2, y2); //длина стороны a
        double b = Point.distance(x2, y2, x3, y3); //длина стороны b
        double c = Point.distance(x1, y1, x3, y3); //длина стороны c
        double p = period(a, b, c); //полупериметр
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // написать формулу для расчета площади треугольника
        }
        return rsl;
    }
}
