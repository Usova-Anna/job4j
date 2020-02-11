package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) { //cells - количество ячеек в группе
        int groups = (int) Math.ceil((double) list.size() / cells);
        System.out.println("Количество групп - " + groups);
        int[][] array = new int[groups][cells];
        int row = -1, cell = 0;
        int itemIndex = 0; //для избегания применения .indexOf()
        for (Integer num : list) {
            if (itemIndex % cells == 0) {
                row++;
                cell = 0;
            } else {
                cell++;
            }
            array[row][cell] = num;
            itemIndex++;
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)); //List.of
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
