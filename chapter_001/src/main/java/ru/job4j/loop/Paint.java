
package ru.job4j.loop;
import java.util.function.BiPredicate;
/**@author Anna
 * @version 1.0
 * @since 29th June
 * Класс рисует правосторонний и левосторонний прямоугольные треугольники,
 *а так же пирамиду.
 */
public class Paint {
    /**Рефакторированный код
     *
     * @param height высота пирамиды.
     * @param width ширина пирамиды.
     * @param predict условие проставления галки.
     * @return рисует пирамиду.
     */
    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }


    /**Рефакторированный метод рисует правосторонний прямоугольный треугольник
     * @param height высота пирамиды/треугольника.
     * @return псевдографический треугольник
     */
    public String rightTrl(int height) { //ширина равна высоте
        return this.loopBy(height, height, (row, column) -> row >= column);
    }

    /**Рефакторированный метод рисует левосторонний прямоугольный треугольник
     * @param height высота пирамиды/треугольника.
     * @return псевдографический треугольник
     */
    public String leftTrl(int height) { //ширина равна высоте
        return this.loopBy(height, height, (row, column) -> row >= height - column - 1);
    }
    /**Рефакторированный метод рисует пирамиду
     * @param height высота пирамиды.
     * @return псевдографическую пирамиду с шириной равной удвоенной высоте - 1.
     */
    public String pyramide(int height) {
        return this.loopBy(height, 2 * height - 1, (row, column) ->row >= height - column - 1 && row + height - 1 >= column);
    }
}

