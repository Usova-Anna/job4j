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
        double kursDoll = 60;
        return value / kursDoll;
    }
    /** Конвертируем доллары в рубли.
     * @param value  рубли.
     * @return доллары.
     */
    public double dollarToRuble(int value) {
        double kursRub = 60;
        return value * kursRub;
    }

    /** Конвертируем евро в рубли.
     * @param value  рубли.
     * @return евро.
     */
    public double euroToRuble(int value) {
        double kursRoub = 70;
        return value * kursRoub;
    }
}
