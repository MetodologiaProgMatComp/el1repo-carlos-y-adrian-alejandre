package TEST.es.edu.uah.matcomp.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account a = new Account();
        assertEquals(111, a.getId());
    }

    @Test
    void getName() {
        Account a = new Account();
        assertEquals("Pepe", a.getName());

    }

    @Test
    void getBalance() {
        Account a = new Account();
        assertEquals("999", a.getBalance());
    }

    @Test
    void credit() {
        Account a = new Account();
        assertEquals(1000, a.credit(1));
    }

    @Test
    void debit() {
        Account a = new Account();
        assertEquals(1098, a.credit(99));

    }

    @Test
    void transferTo() {
        Account a= new Account();

        assertEquals(999, a.transferTo(new Account(),0));

    }
}