package com.epam.Lesson6.HW5;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private static int nextId = 1;

    public int getId() {
        id = nextId;
        nextId++;
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getNextId() {
        return nextId;
    }

//    public static void setNextId(int nextId) {
//        Book.nextId = nextId;
//    }

    public Book( String name, String author, String publisher, int year, int pages, int price) {
        this.id = getId();
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }



    public void viewBook() {
        System.out.println("Book ID = " + id + ", name= " + name + ", author=" + author + ", publisher=" + publisher + ", year =" + year + ", pages =" + pages + ", price = " + price);
    }


}
