package TEST.es.edu.uah.matcomp.ej3;

import es.edu.uah.matcomp.ej3.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point p1= new Point();
        assertEquals(0,p1.getX());
    }

    @Test
    void getY() {
        Point p1= new Point();
        assertEquals(0,p1.getY());
    }

    @Test
    void setX() {
        Point p1= new Point();
        p1.setX(1.0f);
        assertEquals(1.0,p1.getX());
    }

    @Test
    void setY() {
        Point p1= new Point();
        p1.setY(1.0f);
        assertEquals(1.0,p1.getY());
    }

    @Test
    void setXY() {
        Point p1= new Point();
        p1.setXY(1.0f,1.0f);

        assertEquals(1.0f,p1.getXY());
    }

}