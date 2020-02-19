package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int result = 0;
        int leftLength = left.length();
        int rightLength = right.length();
        int end = Math.min(leftLength, rightLength);
        char currentLeftChar = 0;
        char currentRightChar = 0;
        //сравнение пока длина одинаковая
        for (int i = 0; i < end; i++) {
            currentLeftChar = left.charAt(i);
            currentRightChar = right.charAt(i);
            result = Character.compare(currentLeftChar, currentRightChar);
            if (result != 0) {
                break;
            }
        }
        //если длина исходных строк разная, а первые символы одинаковые
        if (result == 0) {
            return leftLength - rightLength;
        }
        return result;
    }
}