package ru.job4j.array;

/**Проверяет, что строка в двухмерном массиве целиком заполнена символом 'Х'.
 *
 */
public class MatrixCheck214126 {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for ( int column=0;column<board.length;column++ ) {

                if (board[row][column]!='Х'){
return false;
                }

        }
        return result;
    }
}