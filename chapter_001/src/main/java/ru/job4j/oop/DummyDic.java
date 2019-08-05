package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String input = "Неизвестное слово ";
        input = input.concat(eng);
        return input;
    }

    public static void main(String[] args) {
        DummyDic dummydic = new DummyDic();
        dummydic.engToRus("labourers");
    }
}
