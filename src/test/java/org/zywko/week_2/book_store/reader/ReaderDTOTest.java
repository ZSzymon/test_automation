package org.zywko.book_store.reader;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.zywko.book_store.library_card.LibraryCardDTO;
import org.zywko.book_store.reader.ReaderDTO;

public class ReaderDTOTest {
    private ReaderDTO reader;

    @Before
    public void setUp() {
        reader = new ReaderDTO("John Doe");
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", reader.getName());
    }

    @Test
    public void testGetLibraryCard() {
        LibraryCardDTO card = reader.getLibraryCard();
        assertNotNull(card);
        assertNull(card.getCardNumber());
        assertNull(card.getReader());
        assertNull(card.getBooks());
    }
}
