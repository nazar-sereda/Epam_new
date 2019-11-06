package com.epam.Lesson6.HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Books shelf = new Books(15);
        shelf.printBooks();
        System.out.println(shelf.addBook(new Book("Java",
                "Shevchenko",
                "British",
                1986,
                709,
                67)));
//        shelf.printBooks();
        System.out.println("*******");
        shelf.addBook(new Book("Java2",
                "Tomas",
                "British",
                1946,
                209,
                27));

        shelf.addBook(new Book("Java4",
                "Kaunas",
                "Britishs",
                1446,
                609,
                67));

        shelf.addBook(new Book("Methods",
                "Tomas",
                "UA",
                1989,
                269,
                22));
        shelf.addBook(new Book("Patterns",
                "Kevin",
                "BL",
                1246,
                567,
                789));

        shelf.printBooks();
        shelf.priceChange(getPercent());
        System.out.println("**********");
        shelf.printBooks();
        System.out.println("*********");
        shelf.searchBookByAuthor(getAuthor());
        shelf.searchBookYear(getYear());


    }

    public static int getPercent() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int percent = Integer.parseInt(reader.readLine());
        System.out.println("Enter percent -> ");
        return percent;

    }


    public static String getAuthor() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter author -> ");
        String author = reader.readLine();
        return author;
    }

    public static int getYear() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter year of book");
        int year = Integer.parseInt(reader.readLine());

        return year;
    }
}



