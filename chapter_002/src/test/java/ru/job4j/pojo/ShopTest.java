package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class ShopTest {
    @Test
    public void whenDeleteIndex3() {
        Shop shop = new Shop();
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("BUtter", 10);
        products[4] = new Product("Oil", 4);
        Product[] expected = {products[0], products[1], products[2], products[4], null};
        Product[] tested = shop.delete(products, 3);
        assertThat(tested, is(expected));
    }
}
