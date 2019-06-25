package ru.job4j.condition;

/**@author Anna
 * @version 1.0
 * @since 25th June 2019
 */
public class DummyBot {
    /**
     * В этом методе бот отвечает на вопросы.
     * @param question вопросы от клиента.
     * @return ответ.
     */
    public String answer(String question) {
        String defaultAnswer = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Привет, Бот.")) {
            defaultAnswer = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            defaultAnswer = "До скорой встречи.";
        }
        return defaultAnswer;
    }
}
