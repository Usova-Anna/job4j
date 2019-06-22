package ru.job4j.converter;


public class Converter {
    /** Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return евро.
     */
    public double rubleToEuro(int value) {
        double kursEuro = 70;
        return value / kursEuro;
    }

    /** Конвертируем рубли в доллары.
     * @param value доллары
     * @return рубли.
     */
    public double rubleToDollar(int value) {
        double kursDollara = 60;
        return value / kursDollara;
    }
    /** Конвертируем доллары в рубли.
     * @param value  рубли.
     * @return доллары.
     */
    public double dollarToRuble(int value) {
        double kursRublia = 60;
        return value * kursRublia;
    }

    /** Конвертируем евро в рубли.
     * @param value  рубли.
     * @return евро.
     */
    public double euroToRuble(int value) {
        double kursRublia = 70;
        return value * kursRublia;
    }
}
