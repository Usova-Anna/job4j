package ru.job4j.condition;

public class SqArea {
    public double findSquare(double p, double k) {
        double h = p / (2 * (k + 1));
        double w = h * k;
        return h * w;
    }

}
