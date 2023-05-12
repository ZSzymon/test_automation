package org.zywko.book_store.library_card;

import org.junit.Test;
import org.zywko.week_2.book_store.book.BookDTO;
import org.zywko.week_2.book_store.library_card.LibraryCardDTO;
import org.zywko.week_2.book_store.reader.ReaderDTO;
import org.zywko.week_2.book_store.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class LibraryCardDTOTest {

    @Test
    public void testAddBook() {
        // Create a new LibraryCardDTO
        LibraryCardDTO libraryCard = new LibraryCardDTO(Utils.getUUID());

        // Create a new BookDTO
        BookDTO book1 = new BookDTO("The Great Gatsby", "F. Scott Fitzgerald");

        // Add the BookDTO to the LibraryCardDTO
        libraryCard.addBook(book1);

        // Check that the BookDTO was added
        List<BookDTO> expectedBooks = new ArrayList<>();
        expectedBooks.add(book1);
        List<BookDTO> actualBooks = libraryCard.getBooks();
        assertEquals(expectedBooks, actualBooks);
    }

    @Test
    public void testRemoveBook() {
        // Create a new LibraryCardDTO
        LibraryCardDTO libraryCard = new LibraryCardDTO(Utils.getUUID());

        // Create a new BookDTO
        BookDTO book1 = new BookDTO("The Great Gatsby", "F. Scott Fitzgerald");

        // Add the BookDTO to the LibraryCardDTO
        libraryCard.addBook(book1);

        // Remove the BookDTO from the LibraryCardDTO
        libraryCard.removeBook(book1);

        // Check that the BookDTO was removed
        List<BookDTO> expectedBooks = new ArrayList<>();
        List<BookDTO> actualBooks = libraryCard.getBooks();
        assertEquals(expectedBooks, actualBooks);
    }

    @Test
    public void testSetAndGetCardNumber() {
        // Create a new LibraryCardDTO
        LibraryCardDTO libraryCard = new LibraryCardDTO(Utils.getUUID());

        // Set the card number
        String expectedCardNumber = "1234567890";
        libraryCard.setCardNumber(expectedCardNumber);

        // Get the card number
        String actualCardNumber = libraryCard.getCardNumber();

        // Check that the card number was set and retrieved correctly
        assertEquals(expectedCardNumber, actualCardNumber);
    }

    @Test
    public void testSetAndGetReader() {
        // Create a new LibraryCardDTO
        LibraryCardDTO libraryCard = new LibraryCardDTO(Utils.getUUID());

        // Create a new ReaderDTO
        ReaderDTO reader1 = new ReaderDTO("John Doe");

        // Set the ReaderDTO in the LibraryCardDTO
        libraryCard.setReader(reader1);

        // Get the ReaderDTO from the LibraryCardDTO
        ReaderDTO actualReader = libraryCard.getReader();

        // Check that the ReaderDTO was set and retrieved correctly
        assertEquals(reader1, actualReader);
    }
}
