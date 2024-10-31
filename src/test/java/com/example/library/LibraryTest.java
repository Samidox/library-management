package com.example.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testAddBook() {
        Library library = new Library();
        Book book = new Book("Java Programming", "Author Name");
        library.addBook(book);
        
        assertTrue(library.getAvailableBooks().contains(book));
    }

    @Test
    void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("Effective Java", "Joshua Bloch");
        library.addBook(book);

        assertTrue(library.borrowBook("Effective Java", 1));
        assertFalse(library.getAvailableBooks().contains(book));
    }

    @Test
    void testReturnBook() {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert Martin");
        library.addBook(book);
        library.borrowBook("Clean Code", 1);

        assertTrue(library.returnBook("Clean Code", 1));
        assertTrue(library.getAvailableBooks().contains(book));
    }
}

