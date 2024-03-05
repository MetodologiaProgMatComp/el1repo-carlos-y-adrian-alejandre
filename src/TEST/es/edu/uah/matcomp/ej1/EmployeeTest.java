package es.edu.uah.matcomp.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee e =new Employee();
        assertEquals(0,e.getId());

    }

    @Test
    void getFirsName() {
        Employee e =new Employee();
        assertEquals("...", e.getFirsName());
    }

    @Test
    void getLastName() {
        Employee e =new Employee();
        assertEquals("...", e.getLastName());
    }

    @Test
    void getName() {
        Employee e =new Employee();
        assertEquals(" ... ...", e.getName());
    }

    @Test
    void getSalary() {
        Employee e =new Employee();
        assertEquals(99999, e.getSalary());

    }

    @Test
    void getAnnualSalary() {
        Employee e =new Employee();
        assertEquals(99999*12, e.getAnnualSalary());
    }

    @Test
    void setSalary() {
        Employee e =new Employee();
        e.setSalary(0);
        assertEquals(0, e.getSalary());

    }

    @Test
    void raiseSalary() {
        Employee e =new Employee();
        e.raiseSalary(0);
        assertEquals(99999, e.getSalary());
    }
}

