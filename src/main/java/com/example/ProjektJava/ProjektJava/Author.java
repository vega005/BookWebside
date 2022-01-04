//package com.example.ProjektJava.ProjektJava;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//public class Author {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long Id;
//
//    private String name;
//
//    private String surname;
//
//    @OneToMany
//    @JoinColumn(name = "author_id")
//    private Set<Book> bookSet;
//
//
//    public Author() {
//    }
//
//    public Long getId() {
//        return Id;
//    }
//
//    public void setId(Long id) {
//        Id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public Set<Book> getBookSet() {
//        return bookSet;
//    }
//
//    public void setBookSet(Set<Book> bookSet) {
//        this.bookSet = bookSet;
//    }
//
//    @Override
//    public String toString() {
//        return "Author{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", bookSet=" + bookSet +
//                '}';
//    }
//}
