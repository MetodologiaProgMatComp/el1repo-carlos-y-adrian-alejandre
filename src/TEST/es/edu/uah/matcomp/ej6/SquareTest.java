package es.edu.uah.matcomp.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {



    @Test
    void setSide() {
        Square s1 = new Square();
        s1.setSide(2);
        assertEquals(2,s1.getSide());
    }
}