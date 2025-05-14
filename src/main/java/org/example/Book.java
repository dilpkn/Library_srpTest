package org.example;

public class Book {
    String name;
    String author;
    int date;
    boolean status; // true - в наличии, false - на руках

    public Book(String name, String author, int date, boolean status) {
        this.name = name;
        this.author = author;
        this.date = date;
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "'" + name + "'" + "(автор: " + author + "), " + "год издания: " + date + ", статус доступности: " + (status ? "в наличии": "нет в наличии");
    }
}
