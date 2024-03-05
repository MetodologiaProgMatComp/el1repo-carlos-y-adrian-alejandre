package es.edu.uah.matcomp.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle62Test {


    @Test
    void getArea() {
        Circle62 c1 = new Circle62(1);
        assertEquals(Math.PI,c1.getArea());

    }

    @Test
    void getPerimeter() {
        Circle62 c1 = new Circle62(1);
        assertEquals(2*Math.PI,c1.getPerimeter());

    }
}