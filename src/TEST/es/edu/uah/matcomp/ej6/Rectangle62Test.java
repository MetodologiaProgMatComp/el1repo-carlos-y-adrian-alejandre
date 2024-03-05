package es.edu.uah.matcomp.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle62Test {

    @Test
    void getArea() {
        Rectangle62 r1 = new Rectangle62(1,1);
        assertEquals(1,r1.getArea());

    }

    @Test
    void getPerimeter() {
        Rectangle62 r1 = new Rectangle62(1,1);
        assertEquals(4,r1.getPerimeter());
    }
}