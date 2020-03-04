package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] tempL = left.split(" ");
        String[] tempR = right.split(" ");
        String strNumL = tempL[0];
        String strNumR = tempR[0];
        strNumL=strNumL.replaceAll("\\.","");
        strNumR=strNumR.replaceAll("\\.","");

        int resultL = Integer.valueOf(strNumL);
        int resultR = Integer.valueOf(strNumR);
        return Integer.compare(resultL, resultR);
    }
}