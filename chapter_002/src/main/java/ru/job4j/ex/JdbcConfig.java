package ru.job4j.ex;

public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("URL could not be null");
        }
        //load jdbc
    }

    public static void main(String[] args) {
        String a = null; //left as null on purpose
        try {
            load(a);
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
