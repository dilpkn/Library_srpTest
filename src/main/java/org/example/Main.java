package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Преступление и наказание",
                "Фёдор Достоевский",
                1866,
                true
        );
        Book book2 = new Book(
                "1984",
                "Джордж Оруэлл",
                1949,
                false
        );
        Book book3 = new Book(
                "Тонкое искусство пофигизма",
                "Марк Мэнсон",
                2016,
                true
        );
        Book book4 = new Book(
                "Гарри Поттер и философский камень",
                "Джоан Роулинг",
                1997,
                false
        );
        Book book5 = new Book(
                "Чистый код",
                "Роберт Мартин",
                2008,
                true
        );
        List<Book> booksList = new ArrayList<>(List.of(book1,book2,book3,book4));
        Library library = new Library(booksList);

    }
}
