package banque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBanque {


    private Banque banque;

    @BeforeEach
    public void setUp() {
        banque = new Banque("Test Bank");
    }

    @Test
    public void testAddClient() {
    	
    	Scanner listMock = Mockito.mock(Scanner.class); doReturn(4).when(listMock).nextInt();

        banque.addClient();
        assertEquals(1, Banque.listeClients.size());
    }
//
//    @Test
//    public void testAddAccount() {
//        banque.addClient();
//        banque.addAccount();
//        assertEquals(1, Banque.listeComptes.size());
//    }
//
//    @Test
//    public void testAddCreditCard() {
//        banque.addClient();
//        banque.addAccount();
//        banque.addCreditCard();
//        assertEquals(1, Banque.listeCartesBleues.size());
//    }
//
//    @Test
//    public void testRemoveClient() {
//        banque.addClient();
//        banque.removeClient();
//        assertEquals(0, Banque.listeClients.size());
//    }
//
//    @Test
//    public void testRemoveAccount() {
//        banque.addClient();
//        banque.addAccount();
//        banque.removeAccount();
//        assertEquals(0, Banque.listeComptes.size());
//    }
//
//    @Test
//    public void testRemoveCreditCard() {
//        banque.addClient();
//        banque.addAccount();
//        banque.addCreditCard();
//        banque.removeCreditCard();
//        assertEquals(0, Banque.listeCartesBleues.size());
//    }
//
//    @Test
//    public void testIsAccountBelongsTo() {
//        banque.addClient();
//        banque.addAccount();
//        assertTrue(banque.isAccountBelongsTo(1, 1));
//        assertFalse(banque.isAccountBelongsTo(1, 2));
//    }
//
//    @Test
//    public void testGetUserIndex() {
//        banque.addClient();
//        assertEquals(0, banque.getUserIndex(1));
//        assertEquals(-1, banque.getUserIndex(2));
//    }
//
//    @Test
//    public void testGetAccountIndex() {
//        banque.addClient();
//        banque.addAccount();
//        assertEquals(0, banque.getAccountIndex(1));
//        assertEquals(-1, banque.getAccountIndex(2));
//    }
//
//    @Test
//    public void testGetCreditCardIndex() {
//        banque.addClient();
//        banque.addAccount();
//        banque.addCreditCard();
//        assertEquals(0, banque.getCreditCardIndex(1));
//        assertEquals(-1, banque.getCreditCardIndex(2));
//    }
}
