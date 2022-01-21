package com.example.ProjektJava.ProjektJava;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    public Book() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;


    @Column(nullable = false)
    private String title;

    private String author;

    private String ibsn;

    @Enumerated(EnumType.STRING)
    private BookType bookType;

    @Column(length = 600)
    private String description;

    public Book(String title, String author, String ibsn, BookType bookType, String description) {
        this.title = title;
        this.author = author;
        this.ibsn = ibsn;
        this.bookType = bookType;
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ibsn='" + ibsn + '\'' +
                ", bookType=" + bookType +
                ", description='" + description + '\'' +
                '}';
    }
}
