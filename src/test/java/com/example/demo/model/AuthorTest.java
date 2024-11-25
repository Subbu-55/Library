package com.example.demo.model;

import org.junit.jupiter.api.Test;

import com.example.demo.model.Author;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class AuthorTest {

    @Test
    void testGettersAndSettersId() {
        Author author = new Author();
        Long id = 1L;
        author.setId(id);
        assertEquals(id, author.getId());
    }

    @Test
    void testGettersAndSettersName() {
        Author author = new Author();
        String name = "Sai";
        author.setName(name);
        assertEquals(name, author.getName());
    }
    
    @Test
    void testGettersAndSettersis_Deleted() {
        // Create an instance of Author
        Author author = new Author();
        
        // Set the isDeleted property to "true"
        author.setIsDeleted("true");
        
        // Assert that the getter returns the expected value
        assertEquals("true", author.getIsDeleted(), "The isDeleted property should be 'true'");
        
        // Set the isDeleted property to "false"
        author.setIsDeleted("false");
        
        // Assert that the getter returns the expected value
        assertEquals("false", author.getIsDeleted(), "The isDeleted property should be 'false'");
    }

    @Test
    void testToString() {
        Author author = new Author();
        author.setId(1L);
        author.setName("Sripada");
        String expected = "Author [id=1, name=Sripada]";
        assertEquals(expected, author.toString());
    }
}
