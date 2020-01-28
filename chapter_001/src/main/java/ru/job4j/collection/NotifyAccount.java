package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/*
Модели данных и HashSet. [#218530]
 */
public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account line : accounts) {
            rsl.add(line);
        }
        return rsl;
    }
}