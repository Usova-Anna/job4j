package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int result = 0;
        if (left == null && right == null) {
            return 0;
        } else if (left == null || left.isEmpty()) {
            return -1;
        } else if (right == null || right.isEmpty()) {
            return 1;
        }
        int leftLength = left.length();
        int rightLength = right.length();
        char[] leftArray = new char[leftLength];
        char[] rightArray = new char[rightLength];
        int end = leftLength > rightLength ? rightLength : leftLength;
        //запись входящих String в char-массивы
        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = left.charAt(i);
        }
        for (int j = 0; j < rightLength; j++) {
            rightArray[j] = right.charAt(j);
        }
        //сравнение пока длина одинаковая
        for (int i = 0; i < end; i++) {
            result = Character.compare(leftArray[i], rightArray[i]);
            if (result != 0) {
                break;
            }
        }
        if (result==0){
            return leftLength-rightLength;
        }
        return result;
    }
}