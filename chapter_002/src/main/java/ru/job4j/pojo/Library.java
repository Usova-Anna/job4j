package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Koran. Clean code.", 313);
        Book book1 = new Book("The 7 Habits Of Highly Effective People", 190);
        Book book2 = new Book("How to Win Friends and Influence People", 230);
        Book book3 = new Book("The Lost World", 90);
        Book book4 = new Book("Clean code", 500);
        Book[] bookArray = new Book[5];
        bookArray[0] = book;
        bookArray[1] = book1;
        bookArray[2] = book2;
        bookArray[3] = book3;
        bookArray[4] = book4;
        System.out.println("_____________________\nALL LIBRARY:");
        for (int index = 0; index < bookArray.length; index++) {
            Book current = bookArray[index];
            System.out.println("Book #" + (index + 1) + " \"" + current.getTitle() + "\" " + current.getPages() + " pages");
        }
        System.out.println("_____________________\nREVERSE BOOK #0 AND BOOK #3");
        Book current = bookArray[2];
        bookArray[0] = bookArray[2];
        bookArray[2] = current;
        for (int index = 0; index < bookArray.length; index++) {
            current = bookArray[index];
            System.out.println("Book #" + (index + 1) + " \"" + current.getTitle() + "\" " + current.getPages() + " pages");
        }
        System.out.println("_____________________\n");
        System.out.println("BOOKS WITH THE TITLE \"Clean code\":");
        for (Book value : bookArray) {
            current = value;
            if (current.getTitle().equals("Clean code")) {
                System.out.println(" \"" + current.getTitle() + "\" " + current.getPages() + " pages");
            }
        }
    }
}
