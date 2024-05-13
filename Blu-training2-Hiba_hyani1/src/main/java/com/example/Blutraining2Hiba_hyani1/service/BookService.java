package com.example.Blutraining2Hiba_hyani1.service;

import com.example.Blutraining2Hiba_hyani1.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findallbook();

    Optional<Book> findById(Long id);

    Book saveBook(Book book);

    Book updateBook(Book book);

    void delateBook(Long id);

    List<Book> searchBooks(String keyword);

    Page<Book> getAllBooks(Pageable pageable);
}