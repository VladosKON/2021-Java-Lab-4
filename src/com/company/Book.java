package com.company;

public class Book {
    private String nameBook;
    private String autor;

    public Book() {
        nameBook = "";
        autor = "";
    }

    public Book(String nameBook, String autor) {
        this.nameBook = nameBook;
        this.autor = autor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAutor() {
        return autor;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return new String("Книга: " + nameBook + "\nАвтор: " + autor +"\n");
    }
}
