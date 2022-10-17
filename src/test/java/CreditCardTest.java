import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard("2039 1039 2000 3049", "08/23", 000, 1000);
    }

    @Test
    public void hasCardNumber(){
        assertEquals("2039 1039 2000 3049", creditCard.getCardNumber());
    }

    @Test
    public void hasExpiryDate(){
        assertEquals("08/23", creditCard.getExpiryDate());
    }

    @Test
    public void hasSecurityNumber(){
        assertEquals(000, creditCard.getSecurityNumber());
    }

    @Test
    public void hasAvailableCredit(){
        assertEquals(1000, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void canCharge(){
        creditCard.charge(300);
        assertEquals(694, creditCard.getAvailableCredit(), 0.0);
    }
}
