package es.edu.uah.matcomp.ej4;

import es.edu.uah.matcomp.ej3.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point p1 = new Point(1,1);
        assertEquals(1,p1.getX());

    }

    @Test
    void getY() {
        Point p1 = new Point(1,1);
        assertEquals(1,p1.getY());

    }

    @Test
    void setX() {
        Point p1 = new Point(1,1);
        p1.setX(2);
        assertEquals(2,p1.getX());

    }

    @Test
    void setY() {
        Point p1 = new Point(1,1);
        p1.setY(2);
        assertEquals(2,p1.getY());

    }

    @Test
    void setXY() {
        Point p1 = new Point(1,1);
        p1.setXY(2,2);
        assertEquals(2,p1.getX());
        assertEquals(2,p1.getY());

    }
}