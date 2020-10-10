package com.company.solid.single_responsibility.good;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> getBooksByYear(Author author, int year) {
        List<Book> books = new ArrayList<>();
        for (Book book : author.books) {
            if (book.year == year) {
                books.add(book);
            }
        }
        return books;
    }

    public List<Book> getBooksContainsName(Author author, String name) {
        List<Book> books = new ArrayList<>();
        for (Book book : author.books) {
            if (book.name.contains(name)) {
                books.add(book);
            }
        }
        return books;
    }

    public List<Book> getBooksByGenre(Author author, String genre) {
        List<Book> books = new ArrayList<>();
        for (Book book : author.books) {
            if (book.name.equals(genre)) {
                books.add(book);
            }
        }
        return books;
    }
}
