package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {


    /**
     * Это поля объекта. Они доступны только конкретному объекту.
     */
    private int x, y, z;

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

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**Считает расстояние между двумя точками в двухмерном пространстве
     *
     * @param that объект точка с координатами в двумерном пространстве. Первая точка берётся из поля this.x, из объекта к которому вызывается метод.
     * @return расстояние.
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)); //this.x = поле объекта a. that.x = поле объекта b.
        //This - текущий объект
    }
    /**Считает расстояние между двумя точками в трёхмерном пространстве
     *
     * @param that объект точка с координатами в трёъмерном пространстве. Первая точка берётся из поля this.x, из объекта к которому вызывается метод.
     * @return расстояние.
     */
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }


    public void info() {
        System.out.println(String.format("Point [%s, %s]", this.x, this.y));
    }
}
