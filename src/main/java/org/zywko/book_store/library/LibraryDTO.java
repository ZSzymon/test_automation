package org.zywko.book_store.library;

import org.zywko.book_store.library_card.LibraryCardDTO;
import org.zywko.book_store.reader.ReaderDTO;
import org.zywko.book_store.book.BookDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryDTO {
    private List<ReaderDTO> readerDTOS;
    private List<BookDTO> bookDTOS;
    private Map<LibraryCardDTO, List<BookDTO>> borrowedBooks;

    public LibraryDTO() {
        this.readerDTOS = new ArrayList<>();
        this.bookDTOS = new ArrayList<>();
        this.borrowedBooks = new HashMap<>();
    }

    public void addReader(ReaderDTO readerDTO) {
        this.readerDTOS.add(readerDTO);
    }

    public void removeReader(ReaderDTO readerDTO) {
        this.readerDTOS.remove(readerDTO);
    }

    public void addBook(BookDTO bookDTO) {
        this.bookDTOS.add(bookDTO);
    }

    public void removeBook(BookDTO bookDTO) {
        this.bookDTOS.remove(bookDTO);
    }

    public void borrowBook(ReaderDTO readerDTO, BookDTO bookDTO) {
        if (!this.readerDTOS.contains(readerDTO) || !this.bookDTOS.contains(bookDTO)) {
            throw new IllegalArgumentException("Reader or book not found in library");
        }

        LibraryCardDTO card = readerDTO.getLibraryCard();
        List<BookDTO> borrowed = this.borrowedBooks.getOrDefault(card, new ArrayList<>());

        if (borrowed.contains(bookDTO)) {
            throw new IllegalStateException("Book already borrowed by this reader");
        }

        borrowed.add(bookDTO);
        this.borrowedBooks.put(card, borrowed);
    }

    public void returnBook(ReaderDTO readerDTO, BookDTO bookDTO) {
        if (!this.readerDTOS.contains(readerDTO) || !this.bookDTOS.contains(bookDTO)) {
            throw new IllegalArgumentException("Reader or book not found in library");
        }

        LibraryCardDTO card = readerDTO.getLibraryCard();
        List<BookDTO> borrowed = this.borrowedBooks.getOrDefault(card, new ArrayList<>());

        if (!borrowed.contains(bookDTO)) {
            throw new IllegalStateException("Book not borrowed by this reader");
        }

        borrowed.remove(bookDTO);
        this.borrowedBooks.put(card, borrowed);
    }
}

