package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TaskTest {
    @Test
    public void whenHigherPriority() {

        PriorityQueue pq = new PriorityQueue();
        pq.put(new Task("low", 5));
        pq.put(new Task("urgent", 1));
        pq.put(new Task("middle", 3));
        Task result = pq.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenHigherPriorityIsFirst() {

        PriorityQueue pq = new PriorityQueue();
        pq.put(new Task("high", 1));
        pq.put(new Task("high", 1));
        pq.put(new Task("low", 3));
        pq.put(new Task("middle", 2));
        Task result = pq.take();
        assertThat(result.getDesc(), is("high"));
    }

    @Test
    public void whenHigherPriorityIsLast() {

        PriorityQueue pq = new PriorityQueue();
        pq.put(new Task("low", 3));
        pq.put(new Task("low", 4));
        pq.put(new Task("middle", 2));
        pq.put(new Task("urgent", 1));
        Task result = pq.take();
        assertThat(result.getDesc(), is("urgent"));

    }
}


