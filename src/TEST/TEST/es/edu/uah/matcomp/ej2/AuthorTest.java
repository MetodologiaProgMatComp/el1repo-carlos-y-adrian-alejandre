package TEST.es.edu.uah.matcomp.ej2;

import es.edu.uah.matcomp.ej2.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @Test
    void getName() {
        Author a1= new Author("Pepe", "pepe@gmail.com",'m');
        assertEquals("Pepe",a1.getName());


    }

    @Test
    void getEmail() {
        Author a1= new Author("Pepe", "pepe@gmail.com",'m');
        assertEquals("pepe@gmail.com",a1.getEmail());
    }

    @Test
    void getGender() {
        Author a1= new Author("Pepe", "pepe@gmail.com",'m');
        assertEquals('m',a1.getGender());

    }

    @Test
    void setEmail() {
        Author a1= new Author("Pepe", "pepe@gmail.com",'m');
        a1.setEmail("###");
        assertEquals("###",a1.getEmail());

    }
}