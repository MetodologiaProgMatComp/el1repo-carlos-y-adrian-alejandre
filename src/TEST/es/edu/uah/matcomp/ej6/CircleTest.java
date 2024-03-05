package es.edu.uah.matcomp.ej6;

import es.edu.uah.matcomp.ej6.Geometric.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getPerimeter() {
        Circle c1= new Circle(1);
        assertEquals(2*Math.PI,c1.getPerimeter());

    }

    @Test
    void getArea() {
        Circle c1= new Circle(1);
        assertEquals(Math.PI,c1.getArea());

    }
}