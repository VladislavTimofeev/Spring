package org.example.repository;

import org.example.entity.BookEntity;

import java.util.List;

public interface BookRepository {

    List<BookEntity> getAll();

    void add(BookEntity bookEntity);

}
