package org.zywko.week_2.book_store.library_card;

import org.zywko.week_2.book_store.reader.ReaderDTO;
import org.zywko.week_2.book_store.book.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class LibraryCardDTO {
    private String cardNumber;
    private ReaderDTO readerDTO;
    private List<BookDTO> bookDTOS;

    public LibraryCardDTO(String cardNumber) {
        this.cardNumber = cardNumber;
        this.bookDTOS = new ArrayList<>();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ReaderDTO getReader() {
        return readerDTO;
    }

    public void setReader(ReaderDTO readerDTO) {
        this.readerDTO = readerDTO;
    }

    public List<BookDTO> getBooks() {
        return bookDTOS;
    }

    public void setBooks(List<BookDTO> bookDTOS) {
        this.bookDTOS = bookDTOS;
    }
    public void addBook(BookDTO bookDTO){
        this.bookDTOS.add(bookDTO);
    }
    public void removeBook(BookDTO bookDTO){
        this.bookDTOS.remove(bookDTO);
    }
}
