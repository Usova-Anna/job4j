package ru.job4j.condition;

public class Min {
    /**Ищет индекс минимума в массиве, начиная с указанного элемента.
     *
     * @param array массив типа int.
     * @param start точка начала поиска в массиве.
     * @return индекс минимального элемента.
     */
        public static int findMinindex(int[] array, int start) {
int indexMin = start;
int min = array[start];
            for (int i=start; i<array.length; i++) { //ищем мин в массиве
    if (array[i]<min) {
        min = array[i];
        indexMin=i;
    }}

            return indexMin;

        }

    }
