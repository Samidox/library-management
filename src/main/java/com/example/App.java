package com.example;

import com.example.library.Book;
import com.example.library.Library;
import com.example.library.Member;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Member member = new Member("Alice", 1);

        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert Martin");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member);

        System.out.println("Available books: " + library.getAvailableBooks().size());
        
        library.borrowBook("Effective Java", member.getMemberId());
        System.out.println("After borrowing 'Effective Java': " + library.getAvailableBooks().size());

        library.returnBook("Effective Java", member.getMemberId());
        System.out.println("After returning 'Effective Java': " + library.getAvailableBooks().size());
    }
}

