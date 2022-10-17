import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class PaymentCard {

    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

//    private ArrayList<transaction> transactions;

    public PaymentCard(String cardNumber, String expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
//        this.transactions = new ArrayList<transaction>();
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    public int getSecurityNumber(){
        return securityNumber;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    public void setSecurityNumber(){
        this.securityNumber = securityNumber;
    }


}
