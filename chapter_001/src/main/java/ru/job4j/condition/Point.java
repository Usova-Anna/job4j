package ru.job4j.condition;

public class Point {
    /**Вычисляет расстояние между точками в системе координат.
     *
     * @param x1 координата первой точки по оси х.
     * @param x2 координата второй точки по оси х.
     * @param y1 координата первой точки по оси у.
     * @param y2 координата второй точки по оси у.
     * @return возвращает длину прямой.
     */
    public double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1,  2) + Math.pow(y2 - y1,  2));

    }
}
