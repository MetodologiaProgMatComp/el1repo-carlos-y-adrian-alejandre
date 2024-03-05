package es.edu.uah.matcomp.ej2;

import es.edu.uah.matcomp.ej2.MyCircle;
import es.edu.uah.matcomp.ej2.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getCenter() {
        MyCircle c1= new MyCircle(1,1,1);
        MyPoint p1= new MyPoint();
        p1.setXY(1,1);

        assertEquals(p1,c1.getCenter());

    }

    @Test
    void setCenter() {
        MyCircle c1= new MyCircle(1,1,1);
        MyPoint p1= new MyPoint(0,0);
        c1.setCenter(p1);
        assertEquals(p1,c1.getCenter());
    }

    @Test
    void getCenterX() {
        MyCircle c1= new MyCircle(1,1,1);
        assertEquals(1,c1.getCenterX());
    }

    @Test
    void setCenterY() {
        MyCircle c1= new MyCircle(1,1,1);
        c1.setCenterY(0);
        assertEquals(0,c1.getCenterY());
    }

    @Test
    void getCenterY() {
        MyCircle c1= new MyCircle(1,1,1);
        assertEquals(1,c1.getCenterY());
    }

    @Test
    void setCenterX() {
        MyCircle c1= new MyCircle(1,1,1);
        c1.setCenterX(0);
        assertEquals(0,0);
    }

    @Test
    void getRadius() {
        MyCircle c1= new MyCircle(1,1,1);
        assertEquals(1,c1.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle c1= new MyCircle(1,1,1);
        c1.setRadius(2);
        assertEquals(2,c1.getRadius());
    }

    @Test
    void getArea() {
        MyCircle c1= new MyCircle(1,1,1);
        assertEquals(Math.PI,c1.getArea());
    }

    @Test
    void getCenterXY() {
        MyCircle c1= new MyCircle(1,1,1);
        int[] coord = new int[2];
        coord[1]=1;
        coord[0]=1;

        assertEquals(coord,c1.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyCircle c1= new MyCircle(1,1,1);
        c1.setCenterXY(1,1);
        assertEquals(1,1);
    }

    @Test
    void getCircumference() {
        MyCircle c1= new MyCircle(1,1,1);
        assertEquals(2*Math.PI,c1.getCircumference());
    }

    @Test
    void distance() {
        MyCircle c1= new MyCircle(1,1,1);
        MyCircle c2 = new MyCircle(2,2,2);
        assertEquals(1.4142135623730951,c1.distance(c2));
    }
}