package ru.job4j.condition;

public class MultiMax {

    public int max(int first, int second, int third) {
        int result = second > first ? second : first;
        result = third > result ? third : result;
        return result;
    }
}
