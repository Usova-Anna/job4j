package ru.job4j.array;


public class Matrix {
    /** Таблица умножения, созданная перемножением индексов.
     *
     * @param size размер таблицы.
     * @return результаты умножения.
     */
    public int[][] multiply(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "\t"); //Хочется посмотреть что получилось
            }
            System.out.println(System.lineSeparator());
        }
        return table;
    }
}
