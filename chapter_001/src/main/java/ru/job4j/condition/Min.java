package ru.job4j.condition;

public class Min {
    /**
     * Ищет индекс минимума в массиве, начиная с указанного индекса.
     *
     * @param array массив типа int.
     * @param start точка начала поиска в массиве.
     * @return индекс минимального элемента.
     */
    public static int findMinindex(int[] array, int start) {
        int indexMin = start;
        int min = array[start];
        for (int i = start; i < array.length; i++) { //ищем мин в массиве
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    /**
     * Ищет минимальный элемент в массиве, начиная с указанного индекса.
     *
     * @param array массив
     * @param start начальный индекс для поиска
     * @return минимум (значение).
     */
    public static int findMinElement(int[] array, int start) {
        int min = array[start];
        for (int i = start; i < array.length; i++) { //ищем мин в массиве
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
