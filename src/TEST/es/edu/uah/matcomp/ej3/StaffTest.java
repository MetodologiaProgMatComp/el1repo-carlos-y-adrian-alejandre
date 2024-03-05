package es.edu.uah.matcomp.ej3;

import es.edu.uah.matcomp.ej3.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff s1= new Staff();
        assertEquals("San Gabriel",s1.getSchool());


    }

    @Test
    void setSchool() {
        Staff s1= new Staff();
        s1.setSchool("Alborada");
        assertEquals("Alborada",s1.getSchool());

    }

    @Test
    void getPay() {
        Staff s1= new Staff();
        assertEquals(25,s1.getPay());

    }

    @Test
    void setPay() {
        Staff s1= new Staff();
        s1.setPay(30);
        assertEquals(30,s1.getPay());

    }
}