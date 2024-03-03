package TEST.es.edu.uah.matcomp.ej3;

import es.edu.uah.matcomp.ej3.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student s1= new Student("Adrian","Bernabeu","MatComp",1,2000);
        assertEquals("MatComp",s1.getProgram());

    }

    @Test
    void setProgram() {
        Student s1= new Student("Adrian","Bernabeu","MatComp",1,2000);
        s1.setProgram("Magisterio");
        assertEquals("Magisterio",s1.getProgram());

    }

    @Test
    void getYear() {
        Student s1= new Student("Adrian","Bernabeu","MatComp",1,2000);
        assertEquals(1,s1.getYear());

    }

    @Test
    void setYear() {
        Student s1= new Student("Adrian","Bernabeu","MatComp",1,2000);
        s1.setYear(2);
        assertEquals(2,s1.getYear());

    }

    @Test
    void getFee() {
        Student s1= new Student("Adrian","Bernabeu","MatComp",1,2000);
        assertEquals(2000,s1.getFee());

    }

    @Test
    void setFee() {
        Student s1= new Student("Adrian","Bernabeu","MatComp",1,2000);
        s1.setFee(3000);
        assertEquals(3000,s1.getFee());

    }
}