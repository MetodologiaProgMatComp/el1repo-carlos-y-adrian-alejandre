package TEST.es.edu.uah.matcomp.ej2;

import es.edu.uah.matcomp.ej2.Author;
import es.edu.uah.matcomp.ej2.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        assertEquals("Java Basics", b1.getName());


    }

    @Test
    void getAuthor() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        assertEquals(a1, b1.getAuthor());


    }

    @Test
    void getPrice() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        assertEquals(10, b1.getPrice());

    }

    @Test
    void getQty() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        assertEquals(0, b1.getQty());

    }



    @Test
    void setPrice() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        b1.setPrice(25);
        assertEquals(25, b1.getPrice());


    }

    @Test
    void setQty() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        b1.setQty(100);
        assertEquals(100, b1.getQty());

    }

    @Test
    void getAuthorNames() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        assertEquals("Pepe", b1.getAuthorNames());

    }

    @Test
    void getAuthorEmail() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        assertEquals("pepe@gmail", b1.getAuthorEmail());

    }

    @Test
    void getAuthorGender() {
        Author a1 = new Author("Pepe", "pepe@gmail", 'm');
        Book b1= new Book("Java Basics", a1, 10,0);
        assertEquals('m', b1.getAuthorGender());

    }
}