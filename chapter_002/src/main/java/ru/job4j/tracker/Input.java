package ru.job4j.tracker;

public interface Input {// будет определять работу класса по получению данных от пользователя в консоли.
String askString(String question);
int askInt(String question);
}
