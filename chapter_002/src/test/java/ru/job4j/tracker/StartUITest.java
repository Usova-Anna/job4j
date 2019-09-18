package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Buy eggs and potatoes"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI startUI = new StartUI();
        startUI.init(input);
        Item tested = tracker.findAll()[0];
        Item expected = new Item("Buy eggs and potatoes", "For a pie",0);
        assertThat(tested.getName(),is(expected.getName()));


    }

}
