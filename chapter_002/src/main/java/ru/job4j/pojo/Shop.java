package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public Product[] delete(Product[] products, int index) {
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом " + index);
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            Product product = products[i + 1];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                products[i] = products[i + 1];
               } else {
                System.out.println("null");
            }
        }
        System.out.println("Массив после удаления:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
        return products;
    }
}



