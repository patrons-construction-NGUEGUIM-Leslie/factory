package modifie;

public class OrangeMoneyFactory extends PaiementFactory {
    @Override
    protected Paiement createPaiement() {
        return new OrangeMoney();
    }
}