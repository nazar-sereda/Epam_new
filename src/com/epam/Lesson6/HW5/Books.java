package com.epam.Lesson6.HW5;

public class Books {
    private Book[] booksArray;
    private  int counter = 0;

    public Books(Book[] booksArray, int counter) {
        this.booksArray = booksArray;
        this.counter = counter;
    }


    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public Books(int booksQuantity){
        this.booksArray = new Book[booksQuantity];
    }

    public boolean addBook(Book book){
        if (counter == booksArray.length)
            return false;
        else {
            booksArray[counter] = book;
            setCounter(counter = counter +1);
            return true;
        }
    }

    public void printBooks(){
        if (counter == 0){
            System.out.println(" The shelf is empty, please add a book");
        }

        else {
            for (int i = 0; i<counter; i++){
                booksArray[i].viewBook();
            }
        }
    }

    public void priceChange(int perc){
        for (int i = 0; i <counter; i++){
            booksArray[i].setPrice(booksArray[i].getPrice() + (booksArray[i].getPrice()*perc/100));
        }
    }

    public  void searchBookByAuthor(String author){
        Books result = new Books(counter);
        for (int i = 0; i < counter ; i++) {
            if (booksArray[i].getAuthor().equalsIgnoreCase(author)){
                result.addBook(booksArray[i]);
            }

        }

        System.out.println("Result -> ");
        result.printBooks();

    }

    public void searchBookYear(int year){
        Books result = new Books(counter);
        for (int i = 0; i < counter; i++) {
            if (booksArray[i].getYear() > year){
                result.addBook(booksArray[i]);
            }
        }

        System.out.println("Result -> ");
        result.printBooks();
    }
}
