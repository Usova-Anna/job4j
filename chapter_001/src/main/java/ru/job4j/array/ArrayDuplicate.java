package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] removeDuplicates(String[] arrayWithDuplicates) {
        int unique = arrayWithDuplicates.length;

        for (int out = 0; out < unique; out++) { //конец внешнего цикла - последняя ячейка
            for (int inner = out + 1; inner < unique; inner++) {
                if (arrayWithDuplicates[out].equals(arrayWithDuplicates[inner])) {
                    arrayWithDuplicates[inner] = arrayWithDuplicates[unique - 1];
                    unique--; //обрезаем цикл
                    inner--; //ещё раз проверяем заменённый элемент
                }
            }
        }
        return Arrays.copyOf(arrayWithDuplicates, unique);
    }


}
