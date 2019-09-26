package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() { //Тестируем add(Item item)
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceItemWithItem2() {// При replace заменяем в старой заявке имя, описание и остальные поля.
        //перенесли generateID в Item, переделать этот тест.
        System.out.println("----------------ЗАМЕНА ЗАЯВКИ------------");
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1");
        Item item2 = new Item("test2");
        Item saved = tracker.add(item);
        String id = saved.getId();
        item2.setId(id); //Присваиваем новой заявке старый Id
        System.out.println("ID item: " + id + "; name item: " + item.getName());
        tracker.replace(id, item2);
        System.out.println("New ID " + item2.getId()+" item:"+item2.getName()); //Мы заменяем заявку. Но если хотим вывести на печать ID, то надо делать add()?!
        assertThat(item2.getName(), is("test2")); //
    }

    @Test
    public void whenDeleteId() {
        System.out.println("----------------УДАЛЕНИЕ ЗАЯВКИ------------");
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = tracker.add(new Item("test1")); //Эти три строки повторяются в каждом тесте. Можно вынести их в класс?
        Item item2 = tracker.add(new Item("test2"));
        Item item3 = tracker.add(new Item("test3"));
        Item item4 = tracker.add(new Item("test4"));
        Item item5 = tracker.add(new Item("test5"));
        String id = item.getId();
        tracker.delete(id);
        Item result = tracker.findById(id);
        assertThat(result, is(nullValue()));
    }

    @Test
    public void whenFindByName() {
        System.out.println("----------------ПОИСК ЗАЯВКИ ПО НАЗВАНИЮ------------");
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = tracker.add(new Item("test1"));
        Item item2 = tracker.add(new Item("test2"));
        Item item3 = tracker.add(new Item("test3"));
        Item item4 = tracker.add(new Item("test2"));
        Item item5 = tracker.add(new Item("test5"));
        Item item6 = tracker.add(new Item("test2"));
        Item[] initialArray = {item, item2, item3, item4, item5, item6};
        Item[] expectedResult = {item2, item4, item6};
        Item[] testedResult = tracker.findByName("test2");
    }
}