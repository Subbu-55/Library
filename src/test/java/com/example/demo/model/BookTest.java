package com.example.demo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.model.Book;
import com.example.demo.model.Author;
import com.example.demo.model.Publisher;

 class BookTest {

    @Test
    void testGettersAndSettersId() {
        Book book = new Book();
        Long id = 1L;
        book.setId(id);
        assertEquals(id, book.getId());
    }

    @Test
    void testGettersAndSettersTitle() {
        Book book = new Book();
        String title = "Harry Potter";
        book.setTitle(title);
        assertEquals(title, book.getTitle());
    }

    @Test
    void testGetAndSetPublicationDate() {
        Book book = new Book();
        String publicationDate = "2023-10-01";
        book.setPublicationDate(publicationDate);
        assertEquals(publicationDate, book.getPublicationDate());
    }

    @Test
    void testGetAndSetAuthor() {
        Book book = new Book();
        Author author = new Author();
        author.setId(1L);
        author.setName("Sharma");
        book.setAuthor(author);
        assertEquals(author, book.getAuthor());
    }

    @Test
    void testGettersAndSettersPublisher() {
        Book book = new Book();
        Publisher publisher = new Publisher();
        publisher.setId(1L);
        publisher.setName("Sai");
        book.setPublisher(publisher);
        assertEquals(publisher, book.getPublisher());
    }

    @Test
    void testToString() {
        Book book = new Book();
        book.setId(1L);
        book.setTitle("Harry Potter");
        book.setPublicationDate("2023-10-01");

        Author author = new Author();
        author.setId(1L);
        author.setName("Sharma");
        book.setAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setId(1L);
        publisher.setName("Sai");
        book.setPublisher(publisher);

        String expected = "Book [id=1, title=Harry Potter, publicationDate=2023-10-01, author=Author [id=1, name=Sharma], publisher=Publisher [id=1, name=Sai]]";
        assertEquals(expected, book.toString());
    }
}
