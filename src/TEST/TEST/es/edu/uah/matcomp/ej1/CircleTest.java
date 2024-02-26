package TEST.es.edu.uah.matcomp.ej1;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c =new Circle();
        assertEquals(1.0,c.getRadius());

    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c =new Circle();
        assertEquals(Math.PI,c.getArea());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        Circle c =new Circle();
        assertEquals("red",c.getColor());
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c= new Circle();
        c.setRadius(1.1);
        assertEquals(1.1, c.getRadius());
    }

    @org.junit.jupiter.api.Test
    void setColor() {

        Circle c= new Circle();
        c.setColor("brown");
        assertEquals("brown", c.getColor());

    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circle c =new Circle();
        assertEquals(2*Math.PI,c.getCircumference());
    }
}