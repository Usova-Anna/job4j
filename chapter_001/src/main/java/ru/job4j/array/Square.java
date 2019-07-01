package ru.job4j.array;

public class Square {
    public double[] calculate(int bound) {
        double[] rst = new double[bound];
        //заполняем массив числами от 1 до bound в квадрате
        for (int i = 0; i != bound; i++) {
            rst[i] = Math.pow((i + 1), 2);
        }
        return rst;
    }
}
