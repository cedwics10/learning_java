package banque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCarteBleue {

    private CarteBleue carte;

    @BeforeEach
    void setUp() {
        // Initialize a new credit card before each test
        carte = new CarteBleue("1234567890123456", 2025, 1);
    }

    @Test
    void testGetId() {
        assertEquals(1, carte.getId());
    }

    @Test
    void testGetNumero() {
        assertEquals("1234567890123456", carte.getNumero());
    }

    @Test
    void testSetNumero() {
        carte.setNumero("9876543210987654");
        assertEquals("9876543210987654", carte.getNumero());
    }

    @Test
    void testGetAExp() {
        assertEquals(2025, carte.getAExp());
    }

    @Test
    void testSetAExp() {
        carte.setAExp(2030);
        assertEquals(2030, carte.getAExp());
    }

    @Test
    void testGetIdCompte() {
        assertEquals(1, carte.getIdCompte());
    }

    @Test
    void testSetIdCompte() {
        carte.setIdCompte(2);
        assertEquals(2, carte.getIdCompte());
    }


}
