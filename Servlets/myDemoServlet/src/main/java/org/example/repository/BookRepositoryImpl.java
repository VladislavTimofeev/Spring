package org.example.repository;

import org.example.entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private List<BookEntity> books = new ArrayList<>();

    public BookRepositoryImpl() {
        BookEntity book = new BookEntity(1L, 333, "Harry", 2001);
        books.add(book);
    }

    @Override
    public List<BookEntity> getAll() {
        return books;
    }

}
