package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User x : users) {
            if (x.getUsername().equals(login)) {
                result = x;
                break;
            }
        }
        if (result != null) {
            return result;
        } else {
            throw new UserNotFoundException("Пользователь не найден");
        }
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валиден или длина Username меньше 3х символов");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("Пользователь невалидный");
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден");
            e.printStackTrace();
        }
    }
}