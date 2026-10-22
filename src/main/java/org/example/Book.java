package org.example;

public class Book{
    private String title;
    private String author;
    private int pages;
    private boolean isRead;

    public Book(String title, String author, int pages, boolean isRead){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isRead = isRead;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPages(){
        return pages;
    }

    public boolean getIsRead(){
        return isRead;
    }

    public void setIsRead(boolean isRead){
        this.isRead = isRead;
    }

    public String describe(){
        String descr = "Книга: %s автор %s, %d стр., прочитана: %b".formatted(title, author, pages, isRead);
        System.out.println(descr);
        return descr;
    }
}
