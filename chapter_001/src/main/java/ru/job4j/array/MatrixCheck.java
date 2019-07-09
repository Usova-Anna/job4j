package ru.job4j.array;

public class MatrixCheck {
    /**Метод проверяет, что в обеих диагоналях элементы одинаковые (true или false).
     *
     * @param data принимает квадратный массив с булевыми значениями.
     * @return true или false - обе диагонали заполнены однородными данными или нет.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true; //Принимаем по умолчанию, что в обеих диагоналях элементы одинаковые.
        for (int i = 0; i < data.length; i++) {
            if ((data[0][0] != data[i][i]) || (data[0][data[0].length - 1] != data[i][data[i].length - 1 - i])) {
                result = false; break;
            }
        }

        return result;
    }
}
