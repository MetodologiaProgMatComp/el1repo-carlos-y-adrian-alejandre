package es.edu.uah.matcomp.ej2;

import es.edu.uah.matcomp.ej2.MyLine;
import es.edu.uah.matcomp.ej2.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void setEnd() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(3,3);
        l1.setEnd(p1);
        assertEquals(p1,l1.getEnd());

    }

    @Test
    void setBegin() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(3,3);
        l1.setBegin(p1);
        assertEquals(p1,l1.getBegin());

    }

    @Test
    void getEnd() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(2,2);
        assertEquals(p1,l1.getEnd());
    }

    @Test
    void getBegin() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(1,1);
        assertEquals(p1,l1.getBegin());

    }

    @Test
    void getBeginX() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(3,3);
        assertEquals(1,l1.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(3,3);
        assertEquals(1,l1.getBeginY());

    }

    @Test
    void setBeginX() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(3,3);
        l1.setBeginX(3);
        assertEquals(3,l1.getBeginX());
    }

    @Test
    void setBeginY() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(3,3);
        l1.setBeginY(3);
        assertEquals(3,l1.getBeginY());

    }

    @Test
    void getENdX() {
        MyLine l1= new MyLine(1,1,2,2);
        MyPoint p1= new MyPoint(3,3);
        l1.setEndY(3);
        assertEquals(3,l1.getEndY());


    }

    @Test
    void getEndY() {
    }

    @Test
    void setEndX() {
    }

    @Test
    void setEndY() {
    }

    @Test
    void getLength() {

    }

    @Test
    void getBeginXY() {
    }

    @Test
    void setBeginXY() {
    }

    @Test
    void getEndXY() {
    }

    @Test
    void setEndXY() {
    }

    @Test
    void getGradients() {
    }
}