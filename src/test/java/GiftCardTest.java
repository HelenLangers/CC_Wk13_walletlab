import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(50);
    }

    @Test
    public void hasBalance(){
        assertEquals(50, giftCard.getBalance(), 0.0);
    }

    @Test
    public void canReduceBalance(){
        giftCard.charge(10);
        assertEquals(40, giftCard.getBalance(), 0.0);
    }
}
