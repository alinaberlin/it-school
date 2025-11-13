package com.github.alina.session25.homework.fifteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of books with attributes: title, author, and year of publication; use streams to find all the books published before the year 2000 and
// group them by author in a map where the key is the author and the value is a list of titles of their books.
public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
       bookList.add( new Book("Clean Code", "Robert C. Martin", "2008"));
       bookList.add(new Book("Design Patterns", "Erich Gamma et al.", "1994"));
       bookList.add(new Book("Effective Java", "Joshua Bloch", "2018"));
       bookList.add(new Book("Refactoring", "Martin Fowler", "1999"));
       System.out.println(getBookList(bookList));
    }
    public static Map<String, List<String>> getBookList(List <Book> bookList) {
        Map<String, List<String>> result = bookList.stream().
                filter(b -> Integer.parseInt(b.getPublicationYear()) < 2000)
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.mapping(Book::getTitle, Collectors.toList())));
        return result;
    }
}

