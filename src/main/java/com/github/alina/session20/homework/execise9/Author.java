package com.github.alina.session20.homework.execise9;
//The Author class should have
//        attributes such as name, nationality, and date of birth.
//It should also have methods to add or remove books, and to display author information.

import java.util.ArrayList;

public class Author {
    private String firstName;
    private String nationality;
    private String dateOfBirth;
    ArrayList<Book> books= new ArrayList<>();

    public Author(String firstName, String nationality, String dateOfBirth) {
        this.firstName = firstName;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    void addBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        books.remove(book);
    }
    public Book getBookById(int id) {
        return books.stream().filter(b->b.author.equals(b.author)).findFirst().orElse(null);
    }
}
