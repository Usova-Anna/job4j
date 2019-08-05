package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {

       return first > second ? first : second;

    }

    /**Находит максимум из трёх чисел
     *
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @return максимальное из трёх, используя метод в методе.
     */
    public int max (int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**Находит максимум из четырёх чисел
     */
public int max( int first, int second, int third, int fourth) {
    return max(first,max(second,max(third, fourth)));
}



}
