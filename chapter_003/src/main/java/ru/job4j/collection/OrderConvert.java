package ru.job4j.collection;
//Преобразования List в Map. [#10093]
import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        //for orders
        String numFromList;
        for (Order order : orders) {
            numFromList = order.getNumber();
            map.put(numFromList, order);
        }
        return map;
    }
}
