package ru.job4j.array;

public class BubbleSort {
    public int[] sorted(int[] array) {
        int end = array.length - 2; //начальное значение конца внутреннего цикла - предпоследняя ячейка
        int temp;
        for (int outer = 0; outer <= array.length - 2; outer++) { //конец внешнего цикла - предоследняя ячейка
            for (int inner = 0; inner <= end; inner++) {
                if (array[inner] > array[inner + 1]) {
                        temp = array[inner];
                    array[inner] = array[inner + 1];
                    array[inner + 1] = temp;
                }
            }
            end = end - 1;
        }
        return array;
    }
}
