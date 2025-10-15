package com.github.alina.session20.homework.execise9;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<LibraryBook>  books=  new ArrayList<>();
    List<Member>  members =  new ArrayList<>();
    void addBook(LibraryBook book) {
        books.add(book);
    }
    void removeBook(LibraryBook book) {
        books.remove(book);
    }
    void displayBooks() {
        for (LibraryBook book : books) {
            System.out.println(book);
        }
    }
    public LibraryBook getBookByTitle(String  title) {
       return books.stream().filter(b->b.book.title.equals(title)).findFirst().orElse(null);

    }
    void addMember(Member member) {
        members.add(member);
    }
    void removeMember(Member member) {
        members.remove(member);
    }
    public Member getMemberByName(String name) {
        return members.stream().filter(m-> m.getName().equals(name)).findFirst().orElse(null);
    }
    public Member getMemberById(int id) {
        return members.stream().filter(m->m.getId()==id).findFirst().orElse(null);
    }
    void displayMembers() {
        members.forEach(m->System.out.println(m));
    }
    public boolean checkAvailability(Book book) {
        var libraryBooks=  books.stream().filter(libraryBook ->  libraryBook.book.equals(book)).
                findFirst().orElse(null);
        if(libraryBooks==null) {
            return false;
        }else  {
            return libraryBooks.copies >0;
        }
    }
}
