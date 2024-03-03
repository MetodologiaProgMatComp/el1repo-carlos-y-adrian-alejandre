package TEST.es.edu.uah.matcomp.ej3;

import es.edu.uah.matcomp.ej3.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void setRadius() {
        Circle c1= new Circle();
        c1.setRadius(2);
        assertEquals(2,c1.getRadius());

    }

    @Test
    void setColor() {
        Circle c1= new Circle();
        c1.setColor("blue");
        assertEquals("blue",c1.getColor());

    }





    @Test
    void getArea() {
        Circle c1= new Circle();
        assertEquals(Math.PI,c1.getArea());

    }
}