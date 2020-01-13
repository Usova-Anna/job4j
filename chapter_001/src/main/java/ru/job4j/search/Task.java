
package ru.job4j.search;

public class Task {
    private String desc;
    private int priority;

    public Task(String description, int priority) {

        this.desc = description;
        this.priority = priority;
    }

    public String getDesc() {

        return desc;
    }

    public int getPriority() {

        return priority;
    }

}
