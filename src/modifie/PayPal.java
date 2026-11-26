package modifie;

public class PayPal extends Paiement {
    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " FCFA via PayPal");
    }
}