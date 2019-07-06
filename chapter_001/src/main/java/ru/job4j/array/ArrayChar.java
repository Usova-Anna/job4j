package ru.job4j.array;

/**@author Anna
 * @since 05 July 2019
 */
public class ArrayChar {
    /**метод проверяет, что слово начинается c определенной последовательности.
     *
     * @param word проверяемая строка.
     * @param prefix искомое начало строки.
     * @return true(найдено в начале) или false (не найдено).
     */
    public boolean startsW(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int ip = 0; ip < pref.length; ip++) { //index prefix'a
        if (pref[ip] != wrd[ip]) {
            result = false;
            break;
        }
        }
        return result;
    }
}
