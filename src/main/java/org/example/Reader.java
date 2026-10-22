package org.example;

public class Reader {
    private String name;
    private String favoriteGenre;
    private Book lastBook;

    public Reader(String name, String favoriteGenre){
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    public void readBook(Book book){
        lastBook = book;
        book.setIsRead(true);
    }

    public String getLastBookInfo(){
        if(lastBook != null) {
            return lastBook.describe();
        }else {
            System.out.println("Пока ничего не читал");
            return "Пока ничего не читал";
        }
    }
}
