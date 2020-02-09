package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    //все пользователей системы с привязанными к ним счетами.
    private Map<User, List<Account>> users = new HashMap<>();

    // добавить пользователя в систему
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    //Должен добавить новый счет к пользователю.
    public void addAccount(String passport, Account account) {
        User owner = findByPassport(passport);
        if (owner != null && !users.get(owner).contains(account)) { //если у этого клиента в его списке счетов отсутствует добавляемый счёт
            users.get(owner).add(account);
        } else {
            System.out.println("Отсутствует owner или уже есть такой счёт");
        }
    }

    // ищет пользователя по номеру паспорта.
    public User findByPassport(String passport) throws NullPointerException {
        User foundUser = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                foundUser = key;
                break;
            }
        }
        if (foundUser == null) {
            throw new NullPointerException("Клиента с таким паспортом не найдено");
        }
        return foundUser;
    }

    // ищет счет пользователя по реквизитам.
    public Account findByRequisite(String passport, String requisite) throws NullPointerException {
        Account foundAccount = null;
        //ищем список счетов
        List<Account> foundList = users.get(findByPassport(passport)); //Нашли User по паспорту и использовали его в качестве key для получения его списка счетов
        if (foundList == null) {
            throw new NullPointerException("У клиента с таким паспортом не найдено счетов");
        }
        //ищем в списке счетов счёт с заданными реквизитами
        for (Account acc : foundList) {
            if (acc.getRequisite().equals(requisite)) {
                foundAccount = acc;
                break;
            }
        }
        if (foundAccount == null) {
            throw new NullPointerException("У клиента не найдено счетов с такими реквизитами");
        }
        return foundAccount;
    }

    //Метод для перечисления денег с одного счёта на другой счёт. ПО ПАСПОРТУ НАЙТИ ЮЗЕРА, У ЮЗЕРА - СПИСОК СЧЕТОВ, ИЗ СПИСКА СЧЕТОВ- СЧЁТ С НУЖНЫМ РЕКВИЗИТОМ.
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
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && destAcc != null //такие счета существуют
                && srcAcc.getBalance() >= amount
        ) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
