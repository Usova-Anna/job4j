package ru.job4j.tracker;
//import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Управление пользовательским вводом, добавление данных в объект трекер
 */
public class StartUI {
    /**
     * Пользователь работает с меню
     */
    public void init() {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (exit == false) {
            //ЗАПРОС ВЫБОРА ПУНКТА МЕНЮ
            System.out.println("ВЫБЕРИТЕ ПУНКТ МЕНЮ:");
            System.out.println("0. Add new Item\n" +
                    "1. Show all items\n" +
                    "2. Edit item\n" +
                    "3. Delete item\n" +
                    "4. Find item by Id\n" +
                    "5. Find items by name\n" +
                    "6. Exit Program");
            int choice = Integer.valueOf(scanner.nextInt());
            scanner.nextLine();
            System.out.print("ВЫ ВЫБРАЛИ " + choice);
            Tracker tracker = new Tracker();
            //РАЗВЕТВЛЕНИЕ ЛОГИКИ В ЗАВИСИМОСТИ ОТ ВЫБРАННОГО ПУНКТА МЕНЮ
            switch (choice) {
                case 0: {
                    System.out.println(" - ДОБАВЛЕНИЕ ЗАЯВКИ.");
                    //ADD

                    System.out.println("Введите название заявки:");
                    String name = scanner.nextLine();
                    System.out.println("Введите описание заявки:");
                    Item item = new Item(name, scanner.nextLine(), System.currentTimeMillis());
                    tracker.add(item);
                    System.out.println("Заявка добавлена");
                    break;
                }
                case 1: {
                    System.out.println(" - ПОКАЗАТЬ ВСЕ ЗАЯВКИ");
                    //SHOW
                    tracker.findAll();
                    break;
                }
                case 2: {
                    System.out.println(" - РЕДАКТИРОВАТЬ ЗАЯВКУ");
                    //EDIT
                    System.out.println("Введите ID заявки, которую хотите заменить");
                    String id = scanner.nextLine();
                    System.out.println("Введите название и описание");
                    Item item = new Item(scanner.nextLine(), scanner.nextLine(), System.currentTimeMillis());
                    tracker.replace(id, item);
                    break;
                }
                case 3: {
                    System.out.println(" - УДАЛИТЬ ЗАЯВКУ");
                    //DELETE
                    String id = scanner.nextLine();
                    System.out.println("Введите Id");
                    tracker.delete(id);
                    break;
                }
                case 4: {
                    System.out.println(" - НАЙТИ ЗАЯВКУ ПО ID");
                    //FIND BY ID
                    String id = scanner.nextLine();
                    System.out.println("Введите Id");
                    tracker.findById(id);
                    break;
                }
                case 5: {
                    System.out.println(" - НАЙТИ ЗАЯВКУ ПО НАЗВАНИЮ");
                    //FIND BY NAME
                    System.out.println("Введите название заявки: ");
                    String find = scanner.nextLine();
                    tracker.findByName(find);
                    break;
                }
                case 6: {
                    System.out.println(" - ВЫХОДИМ");
                    //QUIT
                    exit = true;
                    break;
                }
                default:
                    System.out.println("Такого пункта меню нет. Введите номер пункта меню (от 0 до 6).");
            }
            Item[] items = tracker.findAll(); //Получаем массив заявок после применения действия пункта меню
            System.out.println("СПИСОК ЗАЯВОК ПОСЛЕ ВЫПОЛНЕНИЯ ПУНКТА МЕНЮ:");
            for (Item zayavka : items) {
                System.out.println(zayavka.getName() + " " + zayavka.getDesc());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Input input = new StubInput(new String[]{"create sub task"});
        StartUI startUI = new StartUI();
        startUI.init();
    }
}

