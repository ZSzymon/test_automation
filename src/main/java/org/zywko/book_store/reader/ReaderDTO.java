package org.zywko.book_store.reader;

import org.zywko.book_store.library_card.LibraryCardDTO;
import org.zywko.book_store.utils.Utils;

public class ReaderDTO {
    private String name;
    private LibraryCardDTO card;

    public ReaderDTO(String name) {
        this.name = name;
        this.card = new LibraryCardDTO(Utils.getUUID());
    }

    public String getName() {
        return this.name;
    }

    public LibraryCardDTO getLibraryCard() {
        return this.card;
    }
}
