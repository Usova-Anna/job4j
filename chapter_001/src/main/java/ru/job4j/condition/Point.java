package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    /**Вычисляет расстояние между точками в системе координат.
     *
     * @param x1 координата первой точки по оси х.
     * @param x2 координата второй точки по оси х.
     * @param y1 координата первой точки по оси у.
     * @param y2 координата второй точки по оси у.
     * @return возвращает длину прямой.
     */
    /**
     * Это поля объекта. Они доступны только конкретному объекту.
     */
    private int x, y;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point [%s, %s]", this.x, this.y));
    }
}
