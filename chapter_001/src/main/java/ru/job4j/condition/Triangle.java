package ru.job4j.condition;

public class Triangle {
    private Point first; //точка с координатами x,y
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
    public double area() {
        double rsl = -1;
     double ab = first.distance()
        double p = period(a, b, c); //полупериметр
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // написать формулу для расчета площади треугольника
        }
        return rsl;
    }
}
