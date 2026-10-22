package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> findByAuthor(String author){
        List<Book> booksWithAuthor = new ArrayList<>();
        for(Book book:books){
            if(book.getAuthor().equals(author)){
                booksWithAuthor.add(book);
            }
        }
        return booksWithAuthor;
    }

    public int getTotalPages(){
        int pages = 0;
        for(Book book:books){
            pages += book.getPages();
        }
        return pages;
    }

    public List<Book> getUnreadBooks(){
        List<Book> unreadBooks = new ArrayList<>();

        for(Book book:books){
            if(book.getIsRead() == false){
                unreadBooks.add(book);
            }
        }
        return unreadBooks;
    }
}
