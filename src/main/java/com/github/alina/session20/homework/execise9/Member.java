package com.github.alina.session20.homework.execise9;
//The Member class should have attributes such as name,
//        address, and contact information.
//It should also have methods to borrow and return books,
//to display borrowed books, and to check if a member has overdue books.

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class Member {
   private String name;
   private int id;
   List<BorrowBook> borrowBooks = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    void borrowBook(BorrowBook borrowBook) {
        borrowBooks.add(borrowBook);
    }
    void returnBook(BorrowBook borrowBook) {
        borrowBooks.remove(borrowBook);
    }
    public List<Book> getOverDueBooks() {
       return  borrowBooks.stream().
               filter(b->b.dueDate.
                       isAfter(Instant.now().atOffset(ZoneOffset.
                               of("UTC")).toLocalDate())).
               map(borrowBook -> borrowBook.book).toList();
    }
}
