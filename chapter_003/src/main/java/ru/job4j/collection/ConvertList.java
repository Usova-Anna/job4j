package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList { //массивы в списке list могут быть разного размера.
    public static List<Integer> convert(List<int[]> list) {

        List<Integer> rsl = new ArrayList<>();
        for (int[] row : list) {
            for (int element : row) {
                rsl.add(element);
            }
        }
        return rsl;
    }
}