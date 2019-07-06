package ru.job4j.array;

public class Check {
    /**Метод проверяет, что все элементы в массиве одинаковые.
     *
     * @param data массив с true и false.
     * @return true - все элементы одинаковые (true или false). False - элементы разные.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
