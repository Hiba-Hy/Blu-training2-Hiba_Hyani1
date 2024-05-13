package com.example.Blutraining2Hiba_hyani1.entity;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id" )
    private Long id;
    @Column(name = "title" )
    private String title;
    @Column(name = "author" )
    private String author;
    @Column(name = "genre" )
    private String genre;
    @Column(name = "publicationYear" )
    private int publicationYear;
    @Column(name = "price" )
    private double price;



    public Book() {
    }

    public Book(double price, int publicationYear, String genre, String author, String title, Long id) {
        this.price = price;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.author = author;
        this.title = title;
        this.id = id;
    }
    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}