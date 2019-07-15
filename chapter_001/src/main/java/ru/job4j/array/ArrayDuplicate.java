package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] removeDuplicates(String[] duplicated) {
        int unique = duplicated.length;

        for (int out = 0; out < unique; out++) { //конец внешнего цикла - последняя ячейка
            for (int inner = out + 1; inner < unique; inner++) {
                if (duplicated[out].equals(duplicated[inner])) {
                    duplicated[inner] = duplicated[unique - 1];
                    unique--; //обрезаем цикл
                    inner--; //ещё раз проверяем заменённый элемент
                }
            }
        }
        return Arrays.copyOf(duplicated, unique);
    }


}
