package es.edu.uah.matcomp.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest2 {




    @Test
    void setRadius() {
        Circle c1= new Circle();
        c1.setRadius(3);
        assertEquals(3,c1.getRadius());
    }

    @Test
    void getArea() {
        Circle c1= new Circle();

        assertEquals(Math.PI,c1.getArea());

    }


    @Test
    void getPerimeter() {
        Circle c1= new Circle();

        assertEquals(2*Math.PI,c1.getPerimeter());

    }
}