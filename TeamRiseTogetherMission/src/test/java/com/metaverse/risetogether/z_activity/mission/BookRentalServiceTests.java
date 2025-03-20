package com.metaverse.risetogether.z_activity.mission;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class BookRentalServiceTests {

    private RentalManager rentalManager;

    @BeforeEach
    public void setUp() {
        rentalManager = new RentalManager(new HashMap<>());
    }

    @AfterEach
    public void tearDown() {
        rentalManager = null;
    }

    @Test
    public void testRentBook() {
        Book book = new Book("Clean Code");
        Book book1 = new Book("Joshua");
        Book book2 = new Book("Joshua");

        rentalManager.rentBook("LM001",book);
        rentalManager.rentBook("LM002",book1);
        rentalManager.rentBook("LM001",book2);

        List<Book> listBooks = rentalManager.books.get("LM001");
        List<Book> listBooks1 = rentalManager.books.get("LM002");

        Assertions.assertEquals(2, listBooks.size());
        Assertions.assertTrue(listBooks.contains(book));
        Assertions.assertTrue(listBooks1.contains(book1));

        Assertions.assertEquals(1,listBooks1.size());
        Assertions.assertTrue(listBooks1.contains(book1));
    }
}
