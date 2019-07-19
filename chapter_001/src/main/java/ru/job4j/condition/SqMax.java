package ru.job4j.condition;

public class SqMax {
    /**Находит максимум из четырёх чисел.
     *
     * @param first первое число
     * @param second второе число
     * @param third третье число
     * @param forth четвёртое число
     * @return максимум из четырёх
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            } else if (third>forth){
                result = third;
            }
        } else if (second > third) {
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}
