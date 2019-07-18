package ru.job4j.array;

public class Merge {
    /**
     * Объединяет два ОТСОРТИРОВАННЫХ массива
     *
     * @param left  целочисленный отсортированный массив
     * @param right второй целочисленный отсортированный массив
     * @return объединённый отсортированный массив
     */
    int[] merge(int[] left, int[] right) {
        int sizeOfMerged = left.length + right.length; //определяем длину будущего объединённого массива
        int[] merged = new int[sizeOfMerged];
        int startPoint1 = 0, startPoint2 = 0; //Начальные точки для прохода по массивам
        int recordIndex = 0; //Ячейка записи в объединённом массиве
        while (recordIndex < sizeOfMerged) {
            if (startPoint1 >= left.length) {   //Если левый массив закончился
                merged[recordIndex] = right[startPoint2];
                startPoint2++;
            } else if (startPoint2 >= right.length) { //...или правый закончился.
                merged[recordIndex] = left[startPoint1];
                startPoint1++;
            } else if (left[startPoint1] < right[startPoint2]) { //Если массив не закончился и текущий элемент левого меньше правого
                merged[recordIndex] = left[startPoint1];
                startPoint1++;
            } else if (right[startPoint2] <= left[startPoint1]) { //Если массив не закончился и текущий элемент левого не меньше правого
                merged[recordIndex] = right[startPoint2];
                startPoint2++;
            }
            recordIndex++;
        }
        return merged;
    }
}
