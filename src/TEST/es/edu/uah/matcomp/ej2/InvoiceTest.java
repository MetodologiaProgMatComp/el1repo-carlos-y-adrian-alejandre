package es.edu.uah.matcomp.ej2;

import es.edu.uah.matcomp.ej2.Customer1;
import es.edu.uah.matcomp.ej2.Invoice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer1 c1= new Customer1(123,"Pepe",2);
        Invoice i1= new Invoice(1,c1,2.2);
        assertEquals(1,i1.getId());

    }

    @Test
    void getCliente() {
        Customer1 c1= new Customer1(123,"Pepe",2);
        Invoice i1= new Invoice(1,c1,2.2);
        assertEquals(c1,i1.getCliente());

    }

    @Test
    void setCliente() {
        Customer1 c1= new Customer1(123,"Pepe",2);
        Customer1 c2= new Customer1(1234,"Jose",2);
        Invoice i1= new Invoice(1,c1,2.2);
        i1.setCliente(c2);
        assertEquals(c2,i1.getCliente());

        assertEquals(1,i1.getId());
    }

    @Test
    void getAmount() {
        Customer1 c1= new Customer1(123,"Pepe",2);
        Invoice i1= new Invoice(1,c1,2.2);
        assertEquals(2.2, i1.getAmount());
    }

    @Test
    void setAmount() {
        Customer1 c1= new Customer1(123,"Pepe",2);
        Invoice i1= new Invoice(1,c1,2.2);
        i1.setAmount(3.3);
        assertEquals(3.3,i1.getAmount());
    }

    @Test
    void getCustomerId() {
        Customer1 c1= new Customer1(123,"Pepe",2);
        Invoice i1= new Invoice(1,c1,2.2);
        assertEquals(123,i1.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Customer1 c1= new Customer1(123,"Pepe",2);
        Invoice i1= new Invoice(1,c1,2.2);
        assertEquals("Pepe",i1.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Customer1 c1= new Customer1(123,"Pepe",2);
        Invoice i1= new Invoice(1,c1,2.2);
        assertEquals(2, i1.getCustomerDiscount());
    }




}