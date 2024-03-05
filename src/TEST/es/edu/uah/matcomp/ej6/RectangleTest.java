package es.edu.uah.matcomp.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {




    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle();
        r1.setWidth(2);
        assertEquals(2,r1.getWidth());
    }

    @Test

    void setLength() {
        Rectangle r1 = new Rectangle();
        r1.setLength(2);
        assertEquals(2,r1.getLength());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle();

        assertEquals(1,r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle();

        assertEquals(4,r1.getPerimeter());
    }
}