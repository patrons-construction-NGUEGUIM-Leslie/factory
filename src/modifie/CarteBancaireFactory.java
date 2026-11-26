package modifie;

public class CarteBancaireFactory extends PaiementFactory {
    @Override
    protected Paiement createPaiement() {
        return new CarteBancaire();
    }
}