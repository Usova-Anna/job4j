package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] tempL = left.split(" ");
        String[] tempR = right.split(" ");
        String strNumL = tempL[0];
        String strNumR = tempR[0];
        String[] withoutDotsL = strNumL.split("\\.");
        String[] withoutDotsR = strNumR.split("\\.");
        strNumL = "";
        strNumR = "";
        for (String x : withoutDotsL) {
            strNumL = strNumL + x;
        }
        for (String x : withoutDotsR) {
            strNumR = strNumR + x;
        }
        int resultL = Integer.valueOf(strNumL);
        int resultR = Integer.valueOf(strNumR);
        return Integer.compare(resultL, resultR);
    }
}