package modifie;

public class CarteBancaire extends Paiement {
    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " FCFA par carte bancaire");
    }
}