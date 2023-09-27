package org.example.service;

import org.example.entity.BookEntity;

import java.util.List;

public interface BookService {

    List<BookEntity> getAll();

    void add(int numberOfPage, String title, int releaseYear);

}
