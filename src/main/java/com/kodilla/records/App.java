package com.kodilla.records;

public class App {
    public static void main(String[] args) {

        Book book = new Book("John Novak", "Algorithms and other nightmares", 2018);
        int year = book.getYear();
        System.out.println(book);
        System.out.println(year);
    }
}
