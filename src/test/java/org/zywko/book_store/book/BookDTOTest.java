package org.zywko.book_store.book;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookDTOTest {

    @Test
    public void testGetTitle() {
        String expectedTitle = "Test Book";
        String author = "John Doe";
        BookDTO book = new BookDTO(expectedTitle, author);

        String actualTitle = book.getTitle();

        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testGetAuthor() {
        String title = "Test Book";
        String expectedAuthor = "John Doe";
        BookDTO book = new BookDTO(title, expectedAuthor);

        String actualAuthor = book.getAuthor();

        assertEquals(expectedAuthor, actualAuthor);
    }

    @Test
    public void testConstructor() {
        String expectedTitle = "Test Book";
        String expectedAuthor = "John Doe";
        BookDTO book = new BookDTO(expectedTitle, expectedAuthor);

        String actualTitle = book.getTitle();
        String actualAuthor = book.getAuthor();

        assertEquals(expectedTitle, actualTitle);
        assertEquals(expectedAuthor, actualAuthor);
    }
}