package ru.job4j.array;

import ru.job4j.condition.Min;

/**
 * Классический способ поиска элементов в массиве
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; //если элемента нет в массиве, то возвращаем -1
        for (int index = 0; index != (data.length); index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Поиск в указанном диапазоне. "Поиск индекса в диапазоне. [#156318]"
     *
     * @param data   массив чисел, в котором ищем
     * @param el     элемент, который ищем
     * @param start  начало диапазона, в котором ищем
     * @param finish конец диапазона, в котором ищем
     * @return индекс искомого элемента
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int result = -1; //если элемента нет в массиве, то возвращаем -1
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                result = i;
                System.out.println("Заданный элемент найден под индексом:" + i);
            }
        }
        return result;
    }

    /**
     * Сортировка выборкой. [#156320]
     *
     * @param data несортированный массив
     * @return сортированный по возрастанию массив.
     */
    public int[] sort(int[] data) {
        int index; //Индекс минимального элемента
        for (int i = 0; i < data.length - 1; i++) {
            index = Min.findMinindex(data, i); //find.indexOf(data,el,i,data.length-1);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
