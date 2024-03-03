package TEST.es.edu.uah.matcomp.ej3;

import es.edu.uah.matcomp.ej3.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c1= new Cylinder();
        assertEquals(1.0,c1.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder c1= new Cylinder();
        assertEquals(1.0,c1.getHeight());

    }


}