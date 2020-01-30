package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenTripleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("124", "Health"));
        orders.add(new Order("22", "Happiness"));
        orders.add(new Order("33", "Luck"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("124"), is(new Order("124", "Health")));
        assertThat(map.get("22"), is(new Order("22", "Happiness")));
        assertThat(map.get("33"), is(new Order("33", "Luck")));
    }
}
