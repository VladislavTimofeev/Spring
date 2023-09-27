package org.example.service;

import org.example.entity.BookEntity;
import org.example.repository.BookRepository;
import org.example.repository.BookRepositoryImpl;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl() {
        this.bookRepository = new BookRepositoryImpl();
    }

    @Override
    public List<BookEntity> getAll() {
        return this.bookRepository.getAll();
    }

    @Override
    public void add(int numberOfPage, String title, int releaseYear) {

    }
}
