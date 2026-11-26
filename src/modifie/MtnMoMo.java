package modifie;

public class MtnMoMo extends Paiement {
    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " FCFA via MTN Mobile Money");
    }
}