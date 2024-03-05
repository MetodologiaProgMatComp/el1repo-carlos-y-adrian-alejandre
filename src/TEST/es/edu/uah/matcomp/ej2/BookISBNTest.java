package es.edu.uah.matcomp.ej2;

import es.edu.uah.matcomp.ej2.AuthorISBN;
import es.edu.uah.matcomp.ej2.BookISBN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookISBNTest {

    @Test
    void getQty() {
        AuthorISBN a1= new AuthorISBN("Pepe", "pepe@gmail");
        BookISBN b1= new BookISBN("123","Java",a1,199,0);
        assertEquals(0,b1.getQty());
    }

    @Test
    void getPrice() {
        AuthorISBN a1= new AuthorISBN("Pepe", "pepe@gmail");
        BookISBN b1= new BookISBN("123","Java",a1,199,0);
        assertEquals(199,b1.getPrice());
    }

    @Test
    void getIsbn() {
        AuthorISBN a1= new AuthorISBN("Pepe", "pepe@gmail");
        BookISBN b1= new BookISBN("123","Java",a1,199,0);
        assertEquals("123",b1.getIsbn());
    }

    @Test
    void getAuthor() {
        AuthorISBN a1= new AuthorISBN("Pepe", "pepe@gmail");
        BookISBN b1= new BookISBN("123","Java",a1,199,0);
        assertEquals(a1,b1.getAuthor());
    }

    @Test
    void getName() {
        AuthorISBN a1= new AuthorISBN("Pepe", "pepe@gmail");
        BookISBN b1= new BookISBN("123","Java",a1,199,0);
        assertEquals("Java",b1.getName());
    }

    @Test
    void setQty() {
        AuthorISBN a1= new AuthorISBN("Pepe", "pepe@gmail");
        BookISBN b1= new BookISBN("123","Java",a1,199,0);
        b1.setQty(1);
        assertEquals(1,b1.getQty());
    }

    @Test
    void setPrice() {
        AuthorISBN a1= new AuthorISBN("Pepe", "pepe@gmail");
        BookISBN b1= new BookISBN("123","Java",a1,199,0);
        b1.setPrice(200);
        assertEquals(200,b1.getPrice());

    }

    @Test
    void getAuthorName() {
        AuthorISBN a1= new AuthorISBN("Pepe", "pepe@gmail");
        BookISBN b1= new BookISBN("123","Java",a1,199,0);
        assertEquals("Pepe",b1.getAuthorName());
    }
}