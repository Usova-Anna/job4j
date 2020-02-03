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
if(users.get(owner).indexOf(account)==-1) { //если у этого клиента в его списке счетов отсутствует добавляемый счёт
            users.get(owner).add(account);
    System.out.println("Новый счёт добавлен для клиента "+ owner.getUsername());
        }

    }


    // ищет пользователя по номеру паспорта.
    public User findByPassport(String passport) {
User foundUser = null;

        for (User key:users.keySet()) {
            if (key.getPassport().equals(passport)) {
                foundUser = key;
            }
        }
        return foundUser;
    }

    // ищет счет пользователя по реквизитам.
    public Account findByRequisite(String requisite) {

        Account foundAccount = null;
        for (List<Account> val: users.values()) {
            for (Account currentAcc:val) {
                if (currentAcc.getRequisite().equals(requisite)) {
                    foundAccount = currentAcc;
                    break;
                }
            }
        }

        return foundAccount;
    }

    //ищет User'а по Account
    public User findUserByRequisite(String requisite) {
        User user = null;
        for (Map.Entry<User, List<Account>> entry:users.entrySet()) {
            for (int i=0;i<entry.getValue().size();i++) {
                if (entry.getValue().get(i).equals(requisite)){
                    user = entry.getKey();
                }
            }
        }
        return user;
    }


    //ищет паспорт клиента по реквизиту счёта
    public String findPassportByRequisite(String requisite) {
        User foundUser=null;
        String foundPassport = null;
        for (List<Account> acc:users.values()) {
            for(Account currentAcc:acc) {
                if(currentAcc.getRequisite().equals(requisite)) {
                    foundUser = findUserByRequisite(requisite);
                    foundPassport = foundUser.getPassport();
                    break;
                }

            }
        }

        return foundPassport;
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
        Account srcAcc = findByRequisite(srcRequisite);
        Account destAcc = findByRequisite(destRequisite);
        //if паспорта совпадают с паспортами владельцев счетов и такие реквизиты !=0 и остаток на srcсчету больше, чем amount
        String passportOfTheSrcAccountOwner =  findPassportByRequisite(srcRequisite);
        String passportOfTheDestAccountOwner =  findPassportByRequisite(destRequisite);
     if(
             srcAcc!=null && destAcc!=null //такие счета существуют
            && srcPassport.equals(passportOfTheSrcAccountOwner) //предъявляемый паспорт является паспортом владельца счёта списания
     && destPassport.equals(passportOfTheDestAccountOwner) //указываемый паспорт является паспортом владельца счёта начисления
             && srcAcc.getBalance()>amount
     ) {
        srcAcc.setBalance(srcAcc.getBalance() - amount);
        destAcc.setBalance(destAcc.getBalance() + amount);
    }
        return rsl;
    }




}
