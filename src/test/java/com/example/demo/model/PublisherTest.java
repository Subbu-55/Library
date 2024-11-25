package com.example.demo.model;

import org.junit.jupiter.api.Test;

import com.example.demo.model.Publisher;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class PublisherTest {

    @Test
    void testGettersAndSettersId() {
        Publisher publisher = new Publisher();
        Long id = 1L;
        publisher.setId(id);
        assertEquals(id, publisher.getId());
    }

    @Test
    void testGettersAndSettersName() {
        Publisher publisher = new Publisher();
        String name = "Sharma";
        publisher.setName(name);
        assertEquals(name, publisher.getName());
    }
    
    @Test
    void testGettersAndSettersis_Deleted() {
     
        Publisher publisher = new Publisher();
        
        // Set the isDeleted property to "true"
        publisher.setIsDeleted("true");
        
        // Assert that the getter returns the expected value
        assertEquals("true", publisher.getIsDeleted(), "The isDeleted property should be 'true'");
        
        // Set the isDeleted property to "false"
        publisher.setIsDeleted("false");
        
        // Assert that the getter returns the expected value
        assertEquals("false", publisher.getIsDeleted(), "The isDeleted property should be 'false'");
    }


    @Test
    void testToString() {
        Publisher publisher = new Publisher();
        publisher.setId(1L);
        publisher.setName("Subbu");
        String expected = "Publisher [id=1, name=Subbu]";
        assertEquals(expected, publisher.toString());
    }
}
