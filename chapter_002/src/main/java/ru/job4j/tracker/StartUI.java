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
                case 0: {
                    //ADD
                    Actions.add(scanner, tracker);
                    break;
                }
                case 1: {
                    //SHOW
                    Actions.show(tracker);
                    break;
                }
                case 2: {
                    //EDIT
                    Actions.edit(scanner, tracker);
                    break;
                }
                case 3: {
                    //DELETE
                    Actions.delete(scanner, tracker);
                    break;
                }
                case 4: {
                    //FIND BY ID
                    Actions.findById(scanner, tracker);
                    break;
                }
                case 5: {
                    //FIND BY NAME
                    Actions.findByName(scanner, tracker);
                    break;
                }
                case 6: {
                    //QUIT
                    run = Actions.quit();
                    break;
                }
                default:
                    System.out.println("Такого пункта меню нет. Введите номер пункта меню (от 0 до 6).");
            }
            Item[] items = tracker.findAll(); //Получаем массив заявок после применения действия пункта меню
            System.out.println("СПИСОК ЗАЯВОК ПОСЛЕ ВЫПОЛНЕНИЯ ПУНКТА МЕНЮ:");
            for (Item zayavka : items) {
                System.out.println(zayavka.getId() + " " + zayavka.getName() + " " + zayavka.getDesc());
                System.out.println();
            }
        }
    }

    private void showMenu() {
        System.out.println("ВЫБЕРИТЕ ПУНКТ МЕНЮ:");
        System.out.println("0. Add new Item\n" +
                "1. Show all items\n" +
                "2. Edit item\n" +
                "3. Delete item\n" +
                "4. Find item by Id\n" +
                "5. Find items by name\n" +
                "6. Exit Program");
    }

    public static void main(String[] args) {
        StartUI startUI = new StartUI();
        Input input = new ConsoleInput();
        startUI.init(input);
    }
}

