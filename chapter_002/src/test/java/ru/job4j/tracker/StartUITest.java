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
        Item expected = new Item("Buy eggs and potatoes");
        assertThat(tested.getName(),is(expected.getName()));
    }
}



//package ru.job4j.tracker;
//import org.junit.Test;
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.*;
//
//public class ActionsTest {
//    @Test
//    public void whenAddItem() {
//        String[] answers = {"Fix PC", "PC 486","0"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        StartUI.add(input, tracker);
//        Item created = tracker.findAll()[0];
//        Item expected = new Item("Fix PC", "PC 486", 0);
//        assertThat(created.getName(), is(expected.getName()));
//    }
//
//    @Test
//    public void whenEdit() {
//        this.whenAddItem()[0].getId();
//        String[] answers = {};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//
//        StartUI.edit(input, tracker);
//    }
//    @Test
//    public void whenDelete() {
//        //узнаём id
//        String[] answers = {"12345"};//вводим id
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        //запоминаем i удаляемого элемента
//        StartUI.delete(input, tracker);
//        Item[] expectedAfterDelete = ?
//        Item[] testedAfterDelete = ?
//        assertThat(expectedAfterDelete.getName()[i], is (null));
//    }
//}
