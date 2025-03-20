package com.metaverse.risetogether.z_activity.lesson;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookServiceTests {
    private BookManager bookManager;

    @BeforeEach
    public void setUp() {
        bookManager = new BookManager();
        bookManager.addBook(new Book("Clean Code", "Robert C. Martin", 45.0));
        bookManager.addBook(new Book("Effective Java", "Joshua", 55.0));
    }

    @AfterEach
    void tearDown() {
        bookManager = null;
    }

    @Test
    public void testAddBook() {
        String list = bookManager.listBook();
        Assertions.assertTrue(list.contains("Clean Code"));
        Assertions.assertTrue(list.contains("Effective Java"));
    }

    @Test
    public void testRemoveBook() {
        boolean removed = bookManager.removeBook("Clean Code");
        Assertions.assertTrue(removed);

        String list = bookManager.listBook();
        Assertions.assertFalse(list.contains("Clean Code"));
    }
}
