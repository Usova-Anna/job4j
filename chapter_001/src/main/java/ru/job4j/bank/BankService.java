package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    //все пользователей системы с привязанными к ним счетами.
    private Map<User, List<Account>> users = new HashMap<>();

    // добавить пользователя в систему
    public void addUser(User user) {
//Map.put(Пользователь, список счетов).
// По умолчанию нужно добавить пустой список - new ArrayList<Account>().
        //В методе должна быть проверка, что такого пользователя еще нет в системе.

    }

    //Должен добавить новый счет к пользователю.
    public void addAccount(String passport, Account account) {
        //Первоначально пользователя нужно найти по паспорту.
        // Для этого нужно использовать метод findByPassport.
        //После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
        // В этом методе должна быть проверка, что такого счета у пользователя еще нет.
    }


    // ищет пользователя по номеру паспорта.
    public User findByPassport(String passport) {

        // Здесь нужно использовать перебор всех элементов через цикл for-earch и метод Map.keySet.
        return null;
    }

    // ищет счет пользователя по реквизитам.
    public Account findByRequisite(String requisite) {
        // Сначала нужно найти пользователя.
// Потом получить список счетов этого пользователя и в нем найти нужный счет.
        return null;
    }
//Метод для перечисления денег с одного счёта на другой счёт.
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        //Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят), то метод должен вернуть false.
        //
        //Посмотрите на методы Map.putIfAbsent и List.indexOf, как их можно применить в этом задании.
        //
        //Метод putIfAbsent позволяет проверить, если ли такой ключ в карте или нет и если его нет, то произвести вставку данных.
        //Этот метод позволяет уменьшить количество кода.
        //
        //Метод List.indexOf позволяет найти индекс элемента по значению.
        // Проверка элементов в этом методе происходит по методу equals. Обратите
        // внимание, что в моделях User и Account используется только одно поле passport и requisite
        // для сравнения объектов.
        // Это позволяет использовать эти методы, без информации о всех полях.
        return rsl;
    }




}
