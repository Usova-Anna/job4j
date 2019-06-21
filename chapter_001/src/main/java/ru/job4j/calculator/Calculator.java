package ru.job4j.calculator;


/** Это класс Calculator,

 * он будет что-то считать.
 *@author Anna Usova

 *@since 17th June 2019

 *@version 1.0

 */


public class Calculator {
    /**Это метод add.
     *Он принимает параметры:
     *@param first первое слагаемое.
     *@param second второе слагаемое.
     */

    public double add(double first, double second) {
        return first + second;
    }

    /**Это метод divide.
     * Он приинмает парамтеры:
     * @param divisor делимое.
     * @param divider делитель.
     * @return результат.
     */

    public double divide(double divisor, double divider) {
        return divisor / divider;
    }
    /**Это метод multiply.
     * Он приинмает парамтеры:
     * @param firstMultiplier первый множитель.
     * @param secondMultiplier второй множитель.
     * @return результат.
     */
    public double multiply(double firstMultiplier, double secondMultiplier) {
        return firstMultiplier * secondMultiplier;
    }

    /**Это метод subtract.
     * Он приинмает парамтеры:
     * @param initial уменьшаемое.
     * @param deducted вычитаемое.
     * @return результат.
     */
    public double subtract(double initial, double deducted) {
        return initial - deducted;
    }

    /**Это главный метод.

     *Он принимает параметры:

     *@param args аргументы

     */
    public static void main(String[] args) {


        System.out.println("Hello there!");

    }





}