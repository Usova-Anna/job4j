package ru.job4j.search;

import java.util.LinkedList;

//Очередь с приоритетом на LinkedList[#147943]

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позицию определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {

        int index = 0;//индекс вставки элемента, чтобы не запускать цикл повторно функцией indexOf

        for (Task element : tasks) {
            if (task.getPriority() > element.getPriority()) {
                index++;
            } else {
                break;

            }
        }
        this.tasks.add(index, task);
    }

    /**
     *
     *
     * @return Возвращает первый элемент из списка и удаляет его
     */

    public Task take() {

        return tasks.remove(0);
    }
}



