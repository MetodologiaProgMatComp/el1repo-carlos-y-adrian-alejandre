package es.edu.uah.matcomp.ej4;

import es.edu.uah.matcomp.ej4.Line;
import es.edu.uah.matcomp.ej4.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void getBegin() {
        Line l1 = new Line();
        Point p1= new Point(0,0);
        assertEquals(p1,l1.getBegin());

    }

    @Test
    void getEnd() {
        Line l1 = new Line();
        Point p1= new Point(0,0);
        assertEquals(p1,l1.getEnd());
    }

    @Test
    void setBegin() {
        Line l1 = new Line();
        Point p1= new Point(0,0);
        Point p2= new Point(1,1);
        l1.setBegin(p2);
        assertEquals(p2,l1.getBegin());
    }

    @Test
    void setEnd() {
        Line l1 = new Line();

        Point p2= new Point(1,1);
        l1.setEnd(p2);
        assertEquals(p2,l1.getEnd());
    }

    @Test
    void getBeginX() {
        Line l1 = new Line();
        assertEquals(0,l1.getBeginX());
    }

    @Test
    void getBeginY() {
        Line l1 = new Line();

        assertEquals(0,l1.getBeginY());
    }

    @Test
    void getEndX() {
        Line l1 = new Line();
        assertEquals(0,l1.getEndX());
    }

    @Test
    void getEndY() {
        Line l1 = new Line();
        assertEquals(0,l1.getEndY());
    }

    @Test
    void setBeginX() {
        Line l1 = new Line();

        l1.setBeginX(2);
        assertEquals(2,l1.getBeginX());
    }

    @Test
    void setBeginY() {
        Line l1 = new Line();
        l1.setBeginY(2);
        assertEquals(2,l1.getBeginY());
    }

    @Test
    void setBeginXY() {
        Line l1 = new Line();

        l1.setBeginXY(2,3);
        assertEquals(2,l1.getBeginX());
        assertEquals(2,l1.getBeginY());
    }

    @Test
    void setEndX() {
        Line l1 = new Line();

        l1.setEndX(2);
        assertEquals(2,l1.getEndX());
    }

    @Test
    void setEndY() {
        Line l1 = new Line();
        l1.setEndY(2);
        assertEquals(2,l1.getEndY());
    }

    @Test
    void setEndXY() {
        Line l1 = new Line();

        l1.setEndXY(2,2);
        assertEquals(2,l1.getEndX());
        assertEquals(2,l1.getEndY());

    }

    @Test
    void getLength() {
        Line l1 = new Line();
        assertEquals(0,l1.getLength());
    }

    @Test
    void getGradient() {
        Line l1 = new Line();


        assertEquals(0,l1.getGradient());
    }
}