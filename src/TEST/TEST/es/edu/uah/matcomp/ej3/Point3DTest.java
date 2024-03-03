package TEST.es.edu.uah.matcomp.ej3;

import es.edu.uah.matcomp.ej3.Point3D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p1= new Point3D();
        assertEquals(0.0f,p1.getZ());
    }

    @Test
    void setZ() {
        Point3D p1= new Point3D();
        p1.setZ(2.0f);
        assertEquals(2.0f,p1.getZ());
    }

    @Test
    void setXYZ() {
        Point3D p1= new Point3D();
        p1.setXYZ(1.0f,1.0f,1.0f);
        assertEquals(1.0f,p1.getXY());
    }

}