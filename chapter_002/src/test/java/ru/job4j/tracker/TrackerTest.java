package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() { //Тестируем add(Item item)
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
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
        Item item = new Item("test1", "testDescription", created);
        Item item2 = new Item("test2", "testDescription2", created);
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
        Item item = tracker.add(new Item("test1", "Заявка о пылесосе", created)); //Эти три строки повторяются в каждом тесте. Можно вынести их в класс?
        Item item2 = tracker.add(new Item("test2", "Заявка о телевизоре", created));
        Item item3 = tracker.add(new Item("test3", "Заявка о компьютере", created));
        Item item4 = tracker.add(new Item("test4", "Заявка о ремонте", created));
        Item item5 = tracker.add(new Item("test5", "Заявка о замене", created));
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
        Item item = tracker.add(new Item("test1", "testDescription", created));
        Item item2 = tracker.add(new Item("test2", "testDescription2", created));
        Item item3 = tracker.add(new Item("test3", "testDescription3", created));
        Item item4 = tracker.add(new Item("test2", "testDescription4", created));
        Item item5 = tracker.add(new Item("test5", "testDescription5", created));
        Item item6 = tracker.add(new Item("test2", "testDescription6", created));
        Item[] initialArray = {item, item2, item3, item4, item5, item6};
        Item[] expectedResult = {item2, item4, item6};
        Item[] testedResult = tracker.findByName("test2");
    }
}