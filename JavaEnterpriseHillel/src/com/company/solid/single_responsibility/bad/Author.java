package com.company.solid.single_responsibility.bad;

import java.util.ArrayList;
import java.util.List;

public class Author {
    String name;
    int age;
    List<Book> books;

    public List<Book> getBooksByYear(int year) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (book.year == year) {
                books.add(book);
            }
        }
        return books;
    }

    public List<Book> getBooksContainsName(String name) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (book.name.contains(name)) {
                books.add(book);
            }
        }
        return books;
    }

    public List<Book> getBooksByGenre(String genre) {
        List<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (book.name.equals(genre)) {
                books.add(book);
            }
        }
        return books;
    }
}
