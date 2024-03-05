package es.edu.uah.matcomp.ej2;

import es.edu.uah.matcomp.ej2.Account;
import es.edu.uah.matcomp.ej2.Customer2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer2 c1 = new Customer2(123,"Pepe",'m' );
        Account a1 = new Account(123,c1,2.2);
        assertEquals(123, a1.getId());
    }

    @Test
    void getCustomer2() {
        Customer2 c1 = new Customer2(123,"Pepe",'m' );
        Account a1 = new Account(123,c1,2.2);
        assertEquals(c1, a1.getCustomer2());

    }

    @Test
    void getBalance() {
        Customer2 c1 = new Customer2(123,"Pepe",'m' );
        Account a1 = new Account(123,c1,2.2);
        assertEquals(2.2, a1.getBalance());
    }

    @Test
    void setBalance() {
        Customer2 c1 = new Customer2(123,"Pepe",'m' );
        Account a1 = new Account(123,c1,2.2);
        a1.setBalance(2.3);
        assertEquals(2.3, a1.getBalance());
    }

    @Test
    void getCustomerName() {
        Customer2 c1 = new Customer2(123,"Pepe",'m' );
        Account a1 = new Account(123,c1,2.2);
        assertEquals("Pepe", a1.getCustomerName());
    }

    @Test
    void deposit() {
        Customer2 c1 = new Customer2(123,"Pepe",'m' );
        Account a1 = new Account(123,c1,2.2);
        assertEquals(3.0, a1.deposit(0.8));
    }
}