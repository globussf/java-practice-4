package org.example;


import java.util.List;

public class Main {
    static void main() {
        Library library = new Library();
        Book book1 = new Book("Книга1", "Ктото", 200, false);
        Book book2 = new Book("Книга2", "Чтото", 400, false);
        Book book3 = new Book("Книга3", "Ктото", 340, false);

        Reader reader1 = new Reader("Артём", "смешинка");
        Reader reader2 = new Reader("Олег", "не смешинка");

        book1.describe();
        book2.describe();
        book3.describe();

        reader1.readBook(book2);
        reader2.readBook(book3);

        System.out.println("--------------------------------------------------------------------------");

        reader1.getLastBookInfo();
        reader2.getLastBookInfo();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("--------------------------------------------------------------------------");

        System.out.println(library.getTotalPages());

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Книги по автору:");
        List<Book> booksByAuthor = library.findByAuthor("Ктото");
        for (Book book:booksByAuthor){
            book.describe();
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Не прочитаные книги:");
        List<Book> UnreadBooks = library.getUnreadBooks();
        for (Book book:UnreadBooks){
            book.describe();
        }
    }
}

