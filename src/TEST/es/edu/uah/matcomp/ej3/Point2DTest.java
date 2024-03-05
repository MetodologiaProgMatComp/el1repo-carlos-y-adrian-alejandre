package es.edu.uah.matcomp.ej3;

import es.edu.uah.matcomp.ej3.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p1= new Point2D();
        assertEquals(0.0,p1.getX());
    }

    @Test
    void setX() {
        Point2D p1= new Point2D();
        p1.setX(1.0f);
        assertEquals(1.0,p1.getX());
    }

    @Test
    void getY() {
        Point2D p1= new Point2D();
        assertEquals(0.0,p1.getY());
    }

    @Test
    void setY() {
        Point2D p1= new Point2D();
        p1.setY(1.0f);
        assertEquals(1.0,p1.getY());
    }

    @Test
    void setXY() {
        Point2D p1= new Point2D();
        p1.setXY(1.0f,1.0f);
        float[] coord= new float[2];
        coord[0]=1.0f;
        coord[1]=1.0f;
        assertEquals(coord,p1.getXY());
    }


}