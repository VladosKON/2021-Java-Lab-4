package com.company;

public class Reader {
    private String nameReader;
    private Book bookReader;
    private int day;
    private int month;

    public Reader(){
        nameReader = "";
        bookReader = new Book();
        day = 0;
        month = 0;
    }

    public Reader(String nameReader, Book bookReader, int day, int month){
        this.nameReader = nameReader;
        this.bookReader = bookReader;
        this.day = day;
        this.month = month;
    }

    public String getNameReader() {
        return nameReader;
    }

    public Book getBookReader() {
        return bookReader;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setNameReader(String nameReader) {
        this.nameReader = nameReader;
    }

    public void setBookReader(Book bookReader) {
        this.bookReader = bookReader;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String inTime(int inputMonth, int inputDay){
        if (inputMonth < this.getMonth()){
            return "Книга сдана вовремя";
        } else if ((inputMonth == this.getMonth()) && (inputDay < this.getDay())){
            return "Книга сдана вовремя";
        } else {
            return "Книга сдана не вовремя";
        }
    }

    @Override
    public String toString(){
        return new String("\nФамилия: " + nameReader + "\n" + bookReader + "до " + day + "." + month);
    }
}
