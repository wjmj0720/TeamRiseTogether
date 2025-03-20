package com.metaverse.risetogether.z_activity.mission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalManager {

    Map<String, List<Book>> books = new HashMap<>();

    public RentalManager(Map<String, List<Book>> books) {
        this.books = books;
    }

    public List<Book> rentBook(String membershipId, Book book) {
        List<Book> rentBooks = books.getOrDefault(membershipId, new ArrayList<>());

        rentBooks.add(book);

        books.put(membershipId, rentBooks);
        return rentBooks;
    }

    public String getRentalList(String membershipId) {
        List<Book> rentBooks = books.get(membershipId);

        if (rentBooks == null || rentBooks.isEmpty()) {
            System.out.println("해당하는 ID " +  membershipId + " 는 도서 대여한 책 정보가 없습니다.");
        }
        return "회원 ID : " + membershipId + " -> 대여 도서 : " + rentBooks ;
    }

    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager(new HashMap<>());

        Book book = new Book("Clean Code");
        Book book1 = new Book("Joshua");
        Book book2 = new Book("Joshua");

        rentalManager.rentBook("LM001",book);
        rentalManager.rentBook("LM002",book1);
        rentalManager.rentBook("LM001",book2);

        System.out.println(rentalManager.getRentalList("LM001"));
        System.out.println(rentalManager.getRentalList("LM002"));
        System.out.println(rentalManager.getRentalList("LM003"));
    };
}
