package ru.job4j.tracker;

public class Actions {
    public static void add(Input scanner, Tracker tracker) {
        System.out.println(" - ДОБАВЛЕНИЕ ЗАЯВКИ.");
        String name = scanner.askString("Введите название заявки:");
        Item item = new Item(name, scanner.askString("Введите описание заявки:"), System.currentTimeMillis());
        tracker.add(item);
        System.out.println("Заявка добавлена");
    }

    public static void show(Tracker tracker) {
        System.out.println(" - ПОКАЗАТЬ ВСЕ ЗАЯВКИ");
        tracker.findAll();
    }

    public static void edit(Input scanner, Tracker tracker) {
        System.out.println(" - РЕДАКТИРОВАТЬ ЗАЯВКУ");
        String id = scanner.askString("Введите ID заявки, которую хотите заменить");
        Item item = new Item(scanner.askString("Введите название"), scanner.askString("и введите описание"), System.currentTimeMillis());
        tracker.replace(id, item);
    }

    public static void delete(Input scanner, Tracker tracker) {
        System.out.println(" - УДАЛИТЬ ЗАЯВКУ");
        String id = scanner.askString("Введите Id");
        tracker.delete(id);
    }

    public static void findById(Input scanner, Tracker tracker) {
        System.out.println(" - НАЙТИ ЗАЯВКУ ПО ID");
        String id = scanner.askString("Введите Id");
        tracker.findById(id);
    }

    public static void findByName(Input scanner, Tracker tracker) {
        System.out.println(" - НАЙТИ ЗАЯВКУ ПО НАЗВАНИЮ");
        String find = scanner.askString("Введите название заявки: ");
        tracker.findByName(find);
    }

    public static boolean quit() {
        System.out.println(" - ВЫХОДИМ");
        return false;
    }
}
