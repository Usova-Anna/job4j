package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    /**
     * Массив для хранения заявок
     */
    private Item[] items = new Item[10];
    /**
     * Указатель ячейки
     */
    private int position = 0;

    public Item add(Item item) {
        //Метод public Item add(Item) добавляет заявку, переданную в аргументах в массив заявок this.items;
        //В методе add нужно проставить уникальный ключ в объект Item item.
        //Уникальный ключ нужно генерировать на основании времени и произвольного числа.
        //
        //item.setId(this.generateId());
        //
        //В качестве ключа нельзя использовать индекс.
        System.out.println("position до добавления = " + position);
        this.items[position++] = item;
        System.out.println("position после добавления = " + position);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания, для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    public boolean replace(String id, Item item) {
        //   редактирование заявок -должен заменить ячейку в массиве this.items.
        //   Для этого необходимо найти ячейку в массиве по id.
        //   Метод должен вернуть boolean результат - удалось ли провести операцию.
        boolean result = false;
        for (int index = 0; index < this.items.length; index++) {
            if (this.items[index].getId().equals(id)) {
                this.items[index] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    public int indexOf(String id) {
        //Находит индекс заявки в массиве по id
        int index = -1;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Элемент с id" + id + "имеет индекс " + index);
        } else {
            System.out.println("Элемент с таким id не найден");
        }
        return index;
    }

    public boolean delete(String id) {
        //удаление заявок -
        //должен удалить ячейку в массиве this.items.
        // Для этого необходимо найти ячейку в массиве по id.
        // Cместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy().
        // Метод должен вернуть boolean результат - удалось ли провести операцию.
        boolean success = false;
        //Выводим массив на консоль до удаления элемента
        System.out.println("\nМассив заявок до удаления");
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                System.out.println("id: " + this.items[i].getId() + "; название: " + this.items[i].getName());
            }
        }
        //Поиск индекса удаляемого элемента по id
        int startPoint = indexOf(id);
//        Старый поиск индекса удаляемого элемента по id(до появления метода indexOf)
//        int startPoint=-1;
//        for (int i = 0; i<this.items.length;i++){
//            if (this.items[i].getId().equals(id)) {
//                startPoint=i;
//                System.out.println(("Искомый элемент с id: "+id+ " имеет индекс: "+startPoint));
//                break;
//            }
//        }
        //Удаление и смещение элементов на место удалённого
        if (startPoint != -1) {
            //смещение элементов
            System.out.println("\nУдаляем значение из ячейки с индексом " + startPoint);
            this.items[startPoint] = null;
            success = true;
            for (int i = startPoint; i < this.items.length - 1; i++) {
                this.items[i] = this.items[i + 1];
            }
            this.items[this.items.length - 1] = null;
            position--;
        } else {
            System.out.println("\nНет заявки с таким id");
        }
        //Выводим массив на консоль после удаления элемента
        System.out.println("\nМассив заявок после удаления элемента");
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                System.out.println("id:" + this.items[i].getId() + "; название: " + this.items[i].getName());
            } else {
                System.out.println("Null");
            }
        }
        return success;
    }

    public Item[] findAll() {
        //   получение списка всех заявок - возвращает копию массива this.items без null элементов;
        Item[] notNullitems = new Item[position];
        System.out.println("position = " + position);
        int size = 0;
        for (Item i : this.items) {
            if (i != null) {
                notNullitems[size++] = i;
            }
        }
        System.arraycopy(notNullitems, 0, notNullitems, 0, size);
        return notNullitems;
    }

    public void showAll() {
        Item[] result = findAll(); //обращаемся к методу без объекта, т.к. это метод текущего класса (можно this.findAll()
        for (Item bumajka : result) {
            System.out.println(bumajka); //вызывает .toString()
        }
    }

    public Item[] findByName(String key) {
        //      проверяет в цикле все элементы массива this.items,
        //      сравнивая name (используя метод getName класса Item)
        //      с аргументом метода String key.
        //      Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
        Item[] rsl = new Item[position];
        int index = 0;
        System.out.println("ИЩЕМ ЗАЯВКУ... РЕЗУЛЬТАТ:");
        for (int i = 0; i < items.length - 1; i++) {
            if (this.items[i] != null && this.items[i].getName().equals(key)) {
                rsl[index++] = this.items[i];
                System.out.println("ID " + this.items[i].getId());
            }
        }
        return Arrays.copyOf(rsl, index);
    }

    public Item findById(String id) {//проверяет в цикле все элементы массива this.items,
        // сравнивая id с аргументом String id и возвращает найденный Item.
        // Если Item не найден - возвращает null.
        Item found = null;
        for (Item i : this.items) {
            if (i != null && i.getId().equals(id)) {
                found = i;
                break;
            }
        }
        return found;// По умолчанию вернёт null.
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker(); //содержит заявки
        Item item = new Item("Ремонт телевизора");
        tracker.add(item); //добавляем заявку в трекер
        tracker.showAll(); //выдаёт @f57...
        Item[] result = tracker.findAll();
        for (Item zayavka : result) {
            System.out.println(zayavka.getName()); //печатает не индексы, а сами элементы, обращаясь к полю name!!!!
        }
    }
}