package ru.job4j.search;

import java.util.LinkedList;

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

        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                index = tasks.indexOf(element);
                break;

            } else {
                index = tasks.size();
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
        // Task urgent = tasks.get(0);
        return tasks.remove(0);
    }
}



