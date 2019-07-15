package ru.job4j.array;

import static ru.job4j.condition.Min.findMinindex;


public class Merge {

    /**
     * Объединяет два ОТСОРТИРОВАННЫХ массива
     * @param left целочисленный отсортированный массив
     * @param right второй целочисленный отсортированный массив
     * @return объединённый отсортированный массив
     */
    int[] merge(int[] left, int[] right) {
        int sizeOfMerged = left.length + right.length; //определяем длину будущего объединённого массива
        int[] merged = new int[sizeOfMerged];
        int startPoint1 = 0, startPoint2 = 0; //Начальные точки для прохода по массивам
        int recordIndex = 0; //Ячейка записи в объединённом массиве
        int min1=left[0], min2=right[0]; //Минимумы в двух массивах
        int indexMin1=0, indexMin2=0; //индексы минимумов в двух массивах
        while (recordIndex < sizeOfMerged) {
            for (int i=startPoint1; i < left.length; i++) { //ищем мин в левом массиве
                indexMin1 = findMinindex(left,startPoint1);
                min1 = left[indexMin1];
            }
            for (int i=startPoint2; i < right.length; i++) { //ищем мин в правом массиве тем же методом
                indexMin2 = findMinindex(right, startPoint2);
                min2 = right[indexMin2];
            }
            if (min1 < min2) { //записываем в объединённый массив либо минимум из левого массива, либо из правого
                startPoint1--;
                merged[recordIndex] = left[indexMin1];
            } else {
                startPoint2--;
                merged[recordIndex] = right[indexMin2];
            }
            recordIndex++;

        }
return merged;
    }
}
