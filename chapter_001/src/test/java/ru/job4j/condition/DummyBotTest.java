package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class DummyBotTest {
    @Test
    public void answerWhenHello() {
        DummyBot bot = new DummyBot();

        String answerTested = bot.answer("Привет, Бот.");
        String answerExpected = "Привет, умник.";
        assertThat(answerTested, is(answerExpected));
    }

    @Test
    public void answerWhenBye() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."), is("До скорой встречи."));
    }

    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Сколько будет 2+2?"), is("Это ставит меня в тупик. Задайте другой вопрос."));
    }
}
