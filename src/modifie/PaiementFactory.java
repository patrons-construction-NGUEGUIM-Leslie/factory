package modifie;

public abstract class PaiementFactory {
    public Paiement getPaiement() {
        return createPaiement();
    }

    protected abstract Paiement createPaiement();
}