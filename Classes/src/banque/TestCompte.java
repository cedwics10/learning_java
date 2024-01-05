package banque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCompte {
	
    private Compte compte;

    @BeforeEach
    void setUp() {
        compte = new Compte("123456789", 1000.0, 1);
    }

    @Test
    void testGetId() {
        assertEquals(1, compte.getId());
    }

    @Test
    void testGetRib() {
        assertEquals("123456789", compte.getRib());
    }

    @Test
    void testSetRib() {
        compte.setRib("987654321");
        assertEquals("987654321", compte.getRib());
    }

    @Test
    void testGetSolde() {
        assertEquals(1000.0, compte.getSolde());
    }

    @Test
    void testSetSolde() {
        compte.setSolde(1500.0);
        assertEquals(1500.0, compte.getSolde());
    }

    @Test
    void testGetClientId() {
        assertEquals(1, compte.getClientId());
    }

    @Test
    void testSetClientId() {
        compte.setClientId(2);
        assertEquals(2, compte.getClientId());
    }

}
