package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    public void removeBook(String bookTitle) {
        books.remove(bookTitle);
    }

    public int getTotalBooks() {
        return books.size();
    }

    public boolean isBookAvailable(String bookTitle) {
        return books.contains(bookTitle);
    }

    public List<String> getAllBooks() {
        return new ArrayList<>(books);
    }

    public void borrowBook(String bookTitle) {
        // Simulate book borrowing logic
    }

    public void returnBook(String bookTitle) {
        // Simulate book return logic
    }

    public void reserveBook(String bookTitle) {
        // Simulate book reservation logic
    }

    public boolean isBookReserved(String bookTitle) {
        // Simulate book reservation check logic
        return false;
    }

    public void checkoutBook(String bookTitle) {
        // Simulate book checkout logic
    }

    public boolean isBookOverdue(String bookTitle) {
        // Simulate book overdue check logic
        return false;
    }
}
