package com.example.Blutraining2Hiba_hyani1.repository;

import com.example.Blutraining2Hiba_hyani1.entity.Book;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String titleKeyword, String authorKeyword);
}

