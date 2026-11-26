package modifie;

public class MtnMoMoFactory extends PaiementFactory {
    @Override
    protected Paiement createPaiement() {
        return new MtnMoMo();
    }
}