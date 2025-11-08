package MINIPROJECT;

import java.io.*;
import java.util.*;

public class Library {
    private HashMap<String, Book> books = new HashMap<>();
    private HashMap<String, String> issuedBooks = new HashMap<>(); // bookId -> memberId
    private PrintWriter logWriter;

    public Library() {
        try {
            logWriter = new PrintWriter(new FileWriter("library_log.txt", true));
        } catch (IOException e) {
            System.out.println("Error initializing log file.");
        }
    }

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
        log("Book added: " + book);
    }

    public void issueBook(String bookId, Member member) throws Exception {
        Book book = books.get(bookId);
        if (book == null) throw new Exception("Book not found!");
        if (book.isIssued()) throw new Exception("Book already issued!");

        book.setIssued(true);
        issuedBooks.put(bookId, member.getMemberId());
        log("Book issued: " + book.getTitle() + " to " + member.getName());
    }

    public void returnBook(String bookId, int lateDays) throws LateReturnException {
        Book book = books.get(bookId);
        if (book == null || !book.isIssued()) throw new LateReturnException("Invalid return!");

        book.setIssued(false);
        issuedBooks.remove(bookId);

        double fine = lateDays > 0 ? lateDays * 5.0 : 0.0;
        log("Book returned: " + book.getTitle() + " | Fine: ₹" + fine);
        System.out.println("Book returned successfully. Fine: ₹" + fine);
    }

    // Added getter method to safely access books
    public Collection<Book> getAllBooks() {
        return books.values();
    }

    private void log(String message) {
        logWriter.println(new Date() + " - " + message);
        logWriter.flush();
    }
}
