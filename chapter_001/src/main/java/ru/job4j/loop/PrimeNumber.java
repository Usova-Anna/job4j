package ru.job4j.loop;

public class PrimeNumber {

    /**Ищем простое число.
     *
     * @param finish последнее число
     * @return сколько простых чисел было.
     */
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            count++; //Принимаем заранее, что число простое.
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count--; //Минусуем, если число разделилось на делители в if.
                    break; //Выход из внутреннего цикла
                }

            }
        }
        return count;
    }
}
