import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard("2948 5018 0194 1999", "12/22", 203, "10294029", "22-94-85", 100);
    }

    @Test
    public void hasCardNumber(){
        assertEquals("2948 5018 0194 1999", debitCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate(){
        assertEquals("12/22", debitCard.getExpiryDate());
    }

    @Test
    public void hasSecurityNumber(){
        assertEquals(203, debitCard.getSecurityNumber());
    }

    @Test
    public void hasAccountNumber(){
        assertEquals("10294029", debitCard.getAccountNumber());
    }

    @Test
    public void hasSortCode(){
        assertEquals("22-94-85", debitCard.getSortCode());
    }

    @Test
    public void hasBalance(){
        assertEquals(100, debitCard.getBalance(), 0.0);
    }

    @Test
    public void canCharge(){
        debitCard.charge(50);
        assertEquals(50, debitCard.getBalance(), 0.0);
    }
}
