package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public boolean borrowBook(String title, int memberId) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isBorrowed()) {
                book.borrow();
                System.out.println("Book borrowed: " + title);
                return true;
            }
        }
        System.out.println("Book not available: " + title);
        return false;
    }

    public boolean returnBook(String title, int memberId) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isBorrowed()) {
                book.returnBook();
                System.out.println("Book returned: " + title);
                return true;
            }
        }
        System.out.println("Book not found or not borrowed: " + title);
        return false;
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.isBorrowed()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}

