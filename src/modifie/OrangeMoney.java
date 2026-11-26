package modifie;

public class OrangeMoney extends Paiement {
    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + " FCFA via Orange Money");
    }
}