package TEST.es.edu.uah.matcomp.ej3;

import es.edu.uah.matcomp.ej3.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test


    void getName() {
        Person p1= new Person();
        assertEquals("Pepe",p1.getName());

    }

    @Test
    void getAdress() {
        Person p1= new Person();
        assertEquals("Santiago Bernabeu",p1.getAdress());

    }

    @Test
    void setAdress() {
        Person p1= new Person();
        p1.setAdress("Wanda");
        assertEquals("Wanda",p1.getAdress());
    }
}