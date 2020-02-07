package ru.job4j.tracker;

/**
 * Управление пользовательским вводом, добавление данных в объект трекер
 */
public class StartUI {
    /**
     * Пользователь работает с меню
     */
    public void init(Input scanner) {
        boolean run = true;
        Tracker tracker = new Tracker();
        while (run) {
            //ЗАПРОС ВЫБОРА ПУНКТА МЕНЮ
            this.showMenu();
            int choice = scanner.askInt("Введите пункт меню");
            //scanner.nextLine(); закомментировано, т.к. метода nextLine больше нет у объекта scanner. Он стал объектом ConsoleInput
            System.out.print("ВЫ ВЫБРАЛИ " + choice);
            //РАЗВЕТВЛЕНИЕ ЛОГИКИ В ЗАВИСИМОСТИ ОТ ВЫБРАННОГО ПУНКТА МЕНЮ
            switch (choice) {
                //ADD
                case 0: StartUI.add(scanner, tracker); break;
                //SHOW
                case 1: StartUI.show(tracker); break;
                //EDIT
                case 2:  StartUI.edit(scanner, tracker); break;
                //DELETE
                case 3:     StartUI.delete(scanner, tracker); break;
                //FIND BY ID
                case 4: StartUI.findById(scanner, tracker); break;
                //FIND BY NAME
                case 5:  StartUI.findByName(scanner, tracker); break;
                    //QUIT
                case 6:     run = StartUI.quit(); break;

                default:
                    System.out.println("Такого пункта меню нет. Введите номер пункта меню (от 0 до 6).");
            }
            Item[] items = tracker.findAll(); //Получаем массив заявок после применения действия пункта меню
            System.out.println("СПИСОК ЗАЯВОК ПОСЛЕ ВЫПОЛНЕНИЯ ПУНКТА МЕНЮ:");
            for (Item zayavka : items) {
                System.out.println(zayavka.getId() + " " + zayavka.getName());
                System.out.println();
            }
        }
    }

    public static void add(Input scanner, Tracker tracker) {
        System.out.println(" - ДОБАВЛЕНИЕ ЗАЯВКИ.");
        String name = scanner.askString("Введите название заявки:");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Заявка добавлена");
    }

    private void showMenu() {
        System.out.println("ВЫБЕРИТЕ ПУНКТ МЕНЮ:");
        System.out.println("0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program");
    }

    public static void findByName(Input scanner, Tracker tracker) {
        System.out.println(" - НАЙТИ ЗАЯВКУ ПО НАЗВАНИЮ");
        String find = scanner.askString("Введите название заявки: ");
        Item[] array = tracker.findByName(find);
        System.out.println();
    }

    public static void show(Tracker tracker) {
        System.out.println(" - ПОКАЗАТЬ ВСЕ ЗАЯВКИ");
        tracker.findAll();
    }

    public static void findById(Input scanner, Tracker tracker) {
        System.out.println(" - НАЙТИ ЗАЯВКУ ПО ID");
        String id = scanner.askString("Введите Id");
        tracker.findById(id);
    }

    public static void delete(Input scanner, Tracker tracker) {
        System.out.println(" - УДАЛИТЬ ЗАЯВКУ");
        String id = scanner.askString("Введите Id");
        tracker.delete(id);
    }

    public static void edit(Input scanner, Tracker tracker) {
        System.out.println(" - РЕДАКТИРОВАТЬ ЗАЯВКУ");
        String id = scanner.askString("Введите ID заявки, которую хотите заменить");
        Item item = new Item(scanner.askString("Введите название"));
        item.setId(id);
        tracker.replace(id, item);
    }

    public static boolean quit() {
        System.out.println(" - ВЫХОДИМ");
        return false;
    }

    public static void main(String[] args) {
        StartUI startUI = new StartUI();
        Input input = new ConsoleInput();
        startUI.init(input);
    }
}

