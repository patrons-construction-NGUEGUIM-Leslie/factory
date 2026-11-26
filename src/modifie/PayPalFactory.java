package modifie;

public class PayPalFactory extends PaiementFactory {
    @Override
    protected Paiement createPaiement() {
        return new PayPal();
    }
}