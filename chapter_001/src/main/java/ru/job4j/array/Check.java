package ru.job4j.array;

public class Check {
    /**Метод проверяет, что все элементы в массиве одинаковые.
     *
     * @param data массив с true и false.
     * @return true - все элементы одинаковые (true или false). False - элементы разные.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i != data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                break;
            }
            if (i == data.length - 2) {
                result = true;
            }
        }
        return result;
    }
}
