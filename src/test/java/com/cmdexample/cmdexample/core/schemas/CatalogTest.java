package com.cmdexample.cmdexample.core.schemas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class CatalogTest {

    private Catalog catalog;
    private List<Book> books;

    @BeforeEach
    public void setUp() {
        books = Arrays.asList(new Book("Title1", "Author1"), new Book("Title2", "Author2"));
        catalog = new Catalog();
        catalog.setBooks(books);
    }

    @Test
    public void testGetBooks() {
        List<Book> retrievedBooks = catalog.getBooks();
        assertNotNull(retrievedBooks);
        assertEquals(2, retrievedBooks.size());
        assertEquals("Title1", retrievedBooks.get(0).getTitle());
        assertEquals("Author1", retrievedBooks.get(0).getAuthor());
        assertEquals("Title2", retrievedBooks.get(1).getTitle());
        assertEquals("Author2", retrievedBooks.get(1).getAuthor());
    }
}