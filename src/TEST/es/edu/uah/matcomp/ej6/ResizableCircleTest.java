package es.edu.uah.matcomp.ej6;

import es.edu.uah.matcomp.ej6.Geometric.ResizableCircle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void resize() {
        ResizableCircle r1= new ResizableCircle(2.0);
        r1.resize(25);
        assertEquals(Math.PI,r1.getPerimeter());
    }
}