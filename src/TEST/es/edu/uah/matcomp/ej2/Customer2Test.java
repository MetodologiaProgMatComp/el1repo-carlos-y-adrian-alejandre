package es.edu.uah.matcomp.ej2;

import es.edu.uah.matcomp.ej2.Customer2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer2Test {

    @Test
    void getId() {
        Customer2 c1 = new Customer2(123,"Pepe",'m');
        assertEquals(123, c1.getId());

    }

    @Test
    void getName() {
        Customer2 c1 = new Customer2(123,"Pepe",'m');
        assertEquals("Pepe", c1.getName());
    }

    @Test
    void getGender() {
        Customer2 c1 = new Customer2(123,"Pepe",'m');
        assertEquals('m', c1.getGender());
    }
}