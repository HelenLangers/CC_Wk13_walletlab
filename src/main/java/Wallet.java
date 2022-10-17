import java.util.*;

public class Wallet {

    private ArrayList<IChargeable> wallet;

    public Wallet(){
        this.wallet = new ArrayList<>();
    }

    public int getNumberOfCards(){
        return wallet.size();
    }

    public void addCard(IChargeable card){
        wallet.add(card);
    }

    public void removeCard(){
        wallet.remove(0);
    }
}
