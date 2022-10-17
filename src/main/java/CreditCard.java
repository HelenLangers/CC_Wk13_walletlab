public class CreditCard extends PaymentCard implements IChargeable {

    private double availableCredit;

    public CreditCard(String cardNumber, String expiryDate, int securityNumber, double availableCredit){
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit(){
        return availableCredit;
    }

    public void charge(double paymentAmount){
        double purchaseAmount = paymentAmount + (paymentAmount*0.02);
        this.availableCredit -= purchaseAmount;
    }
}
