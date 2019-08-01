//package ru.job4j.condition;
//
//
//public class Point {
//    /**Вычисляет расстояние между точками в системе координат.
//     *
//     * @param x1 координата первой точки по оси х.
//     * @param x2 координата второй точки по оси х.
//     * @param y1 координата первой точки по оси у.
//     * @param y2 координата второй точки по оси у.
//     * @return возвращает длину прямой.
//     */
//    /**
//     * Это поля объекта. Они доступны только конкретному объекту.
//     */
//    private int x, y,z;
//
//    /**
//     * Конструктор, который принимает начальное состояние объекта "точка"
//     *
//     * @param first  координата x
//     * @param second координата y
//     */
//    public Point(int first, int second) {
//        this.x = first;
//        this.y = second;
//    }
//
//    public Point (int first, int second, int third) {
//        this.x=first;
//        this.y=second;
//        this.z=third;
//    }
//
//    public double distance(Point that) {
//        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y2 - this.y1, 2)); //this.x = поле объекта a. that.x = поле объекта b.
//        //This - текущий объект
//    }
//
//    public static double distance3d(Point that) {
//return Math.sqrt(Math.pow(this.x2-this.x1,2)+Math.pow(this.y2-this.y1,2)+Math.pow(this.z2-this.z1,2));
//    }
//
//    public void info() {
//        System.out.println(String.format("Point [%s, %s]", this.x, this.y));
//    }
//}
