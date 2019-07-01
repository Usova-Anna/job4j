//
//        package ru.job4j.loop;
//import java.util.function.BiPredicate;
///**@author Anna
// * @version 1.0
// * @since 29th June
// * Класс рисует правосторонний и левосторонний прямоугольные треугольники,
// *а так же пирамиду.
// */
//public class Paint {
//    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
//        StringBuilder screen = new StringBuilder();
//        for (int row=0; row != height; row++) {
//            for (int column = 0; column != width; column++) {
//                if (predict.test(row, column)) {
//                    screen.append("^");
//                } else {
//                    screen.append(" ");
//                }
//                }
//            screen.append(System.lineSeparator());
//            }
//        return screen.toString();
//        }
//    }
//
//    /**Метод рисует правосторонний прямоугольный треугольник
//     * @param height высота пирамиды/треугольника.
//     * @return псевдографический треугольник
//     */
//    public String rightTrl(int height) { //ширина равна высоте
//        StringBuilder screen = new StringBuilder(); //буфер для результата
//
//        // внешний цикл двигается по строкам.
//        for (int row = 0; row != height; row++) {
//
//            // внутренний цикл определяет положение ячейки в строке.
//            for (int column = 0; column != height; column++) {
//                if (row >= column) {
//                    screen.append("^");
//                } else {
//                    screen.append(" ");
//                }
//            }
//            screen.append(System.lineSeparator());
//        }
//        return screen.toString();
//    }
//
//    /**Метод рисует левосторонний прямоугольный треугольник
//     * @param height высота пирамиды/треугольника.
//     * @return псевдографический треугольник
//     */
//    public String leftTrl(int height) { //ширина равна высоте
//        StringBuilder screen = new StringBuilder();
//
//        for (int row = 0; row != height; row++) {
//            for (int column = 0; column != height; column++) {
//                if ((row + column) >= (height - 1)) {
//                    screen.append("^");
//                } else {
//                    screen.append(" ");
//                }
//            }
//            screen.append(System.lineSeparator());
//        }
//        return screen.toString();
//    }
//    /**Метод рисует пирамиду
//     * @param height высота пирамиды.
//     * @return псевдографическую пирамиду с шириной равной удвоенной высоте - 1.
//     */
//    public String pyramide(int height) {
//        StringBuilder screen = new StringBuilder();
//        int width = height * 2 - 1;
//        for (int row = 0; row != height; row++) {
//            for (int column = 0; column != width; column++) {
//                if ((row + column) >= (height - 1) && (column <= (width / 2 + row))) { //У нас тут своя атмосфера
//                    screen.append("^");
//                } else {
//                    screen.append(" ");
//                }
//            }
//            screen.append(System.lineSeparator());
//        }
//        return screen.toString();
//
//    }
//}
//
