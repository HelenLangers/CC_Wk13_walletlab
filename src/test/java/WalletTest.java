import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;

    @Before
    public void before(){
        wallet = new Wallet();
        creditCard = new CreditCard("2000 1049 5555 3333", "01/23", 200, 1000);
        debitCard = new DebitCard("1111 0000 2222 8888", "02/23", 222, "1093 3847", "204", 500);
        giftCard = new GiftCard(100);
    }

    @Test
    public void walletStartsEmpty(){
        assertEquals(0, wallet.getNumberOfCards());
    }

    @Test
    public void canAddCard(){
        wallet.addCard(creditCard);
        assertEquals(1, wallet.getNumberOfCards());
    }

    @Test
    public void canRemoveCard(){
        wallet.addCard(creditCard);
        wallet.addCard(debitCard);
        wallet.removeCard();
        assertEquals(1, wallet.getNumberOfCards());
    }

    @Test
    public void canSelectCreditCard(){
        
    }

}
