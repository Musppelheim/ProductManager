package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldMatchesByAuthor() {
        Book book = new Book(2, "The ultimate secret", 65, "Bernard Werber");
        assertTrue(book.matches("Bernard Werber"));
    }


    @Test
    void shouldMacthesByName() {
        Book book = new Book(2, "The ultimate secret", 65, "Bernard Werber");
        assertFalse(book.matches("Rich Dad Poor Dad"));
    }

}
