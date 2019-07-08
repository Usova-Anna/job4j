package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean diagonal1 = true; //Принимаем по умолчанию, что в первой диагонали элементы одинаковые.
        boolean diagonal2 = true; //Принимаем по умолчанию, что во второй диагонали элементы одинаковые.
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == j) { //анализируем первую диагональ
                    if (data[i][j] != diagonal1) { //Если текущий элемент не совпадает с первым, результат по первой диагонали - false.
                        diagonal1 = false;
                    }
                }

                if (i + j == data[i].length - 1) { //анализируем вторую диагональ
                    if (data[i][j] != diagonal2) { //Если текущий элемент не совпадает с первым, результат по второй диагонали - false.
                        diagonal2 = false;
                    }
                }
            }
        }

        return diagonal1 && diagonal2;
    }
}
