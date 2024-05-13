package com.example.Blutraining2Hiba_hyani1.controller;

import com.example.Blutraining2Hiba_hyani1.entity.Book;
import com.example.Blutraining2Hiba_hyani1.repository.BookRepository;
import com.example.Blutraining2Hiba_hyani1.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    private final BookRepository bookRepository;

    public BookController(BookService bookService, BookRepository bookRepository) {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
    }
    @GetMapping
    public List<Book> findallbook(){
        return bookService.findallbook();
    }
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable("id")Long id) {
         return bookService.findById(id);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Book>> searchBooks(@RequestParam String keyword) {
        List<Book> matchingBooks = bookRepository.findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(keyword, keyword);
        return ResponseEntity.ok(matchingBooks);
    }


    @PostMapping
    public Book savebook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @PutMapping
    public Book updatebook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping
    public void deletebook(@PathVariable("id")Long id){
        bookService.delateBook(id); ;
    }

    @GetMapping
    public ResponseEntity<Page<Book>> getAllBooks(Pageable pageable) {
        Page<Book> booksPage = bookService.getAllBooks(pageable);
        return ResponseEntity.ok(booksPage);
    }
}
