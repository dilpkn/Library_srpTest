package org.example;

class addBookClass{ //добавляет книгу
    public void addBook(Library library, Book book){
        library.getBooks().add(book);
    }
}

class deleteBookClass { //удаляет книгу
    public void deleteBook(Library library, int id) {
        if(id<library.getBooks().size() && id>0) {
            library.getBooks().remove(id - 1);
        }else{
            System.out.println("Ошибка индекса! Повторите попытку!");
        }
    }
}

class giveBookClass {   //отдает книгу на руки
    public void giveBook(Library library, int id) {
        if(id<library.getBooks().size() && id>0) {
            if(library.getBooks().get(id - 1).getStatus()) {
                library.getBooks().get(id - 1).setStatus(false);
            }
        }else{
            System.out.println("Ошибка индекса! Повторите попытку!");
        }
    }
}

class nameSearchClass {     // поиск по имени
    public void nameSearch(Library library, String name) {
        for(Book book : library.getBooks()) {
            if(book.getName().contains(name)&&book.getStatus()) {
                System.out.println("Книга под названием "
                        + name + " есть в наличии");
            }else if(book.getName().contains(name)&&!book.getStatus()) {
                System.out.println("Книга под названием "
                        + name + " есть в библиотеке, но нет в наличии");
            } else if (book.getName().equals(library.getBooks().get(library.getBooks().size()-1).getName())) {
                System.out.println("Такой книги не существует в библиотеке!");
            }
        }
    }
}

class authorSearchClass {   //поиск по автору
    public void authorSearch(Library library, String author) {
        int count = 0;
        for(Book book : library.getBooks()) {
            if(book.getAuthor().contains(author)) {
                System.out.println(book);
                count++;
            }else if(count == 0) {
                System.out.println("Нет ни одной книги этого автора!");
            }
        }
    }
}

class statusSearchClass {     //поиск по статусу доступности
    public void statusSearch(Library library) {
        int count = 0;
        for(Book book : library.getBooks()) {
            if(book.getStatus()) {
                System.out.println(book);
                count++;
            }else if(count == 0) {
                System.out.println("Нет ни одной доступной книги в библиотеке!");
            }
        }
    }
}

class allBooksClass {       //вывод всех книг
    public void allBooks(Library library) {
        for(Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}

class booksStatisticClass {    //статистика по книгам
    public void booksStatus(Library library) {
        System.out.println("Всего книг в библиотеке: "
                + library.getBooks().size());
        countAvailableClass temp = new countAvailableClass();
        System.out.println("Всего доступных книг в библиотеке: "
                + temp.countAvailable(library));
        System.out.println("Всего книг, находящихся в данный момент на руках: " + (library.getBooks().size()-temp.countAvailable(library)));
    }
}

class countAvailableClass { //кол-во доступных книг
    public int countAvailable(Library library) {
        int count = 0;
        for(Book book : library.getBooks()) {
            if(book.getStatus()) {
                count++;
            }
        }
        return count;
    }
}