package org.zywko.book_store.book;

public class BookDTO {
    private String title;
    private String author;

    public BookDTO(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
