package modifie;

public class ClientPaiement {
    public static void main(String[] args) {
        System.out.println("............ Methode 1 : Factory Method ............");
        FabriquePaiement fabrique = new FabriquePaiement();
        Paiement paiement = null;

        paiement = fabrique.createPaiement(FabriquePaiement.ORANGE_MONEY);
        paiement.payer(5000);
        paiement = fabrique.createPaiement(FabriquePaiement.MTN_MOMO);
        paiement.payer(10000);
        paiement = fabrique.createPaiement(FabriquePaiement.CARTE);
        paiement.payer(25000);
        paiement = fabrique.createPaiement(FabriquePaiement.PAYPAL);
        paiement.payer(15000);

        try {
            paiement = fabrique.createPaiement("BITCOIN");
            paiement.payer(1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n............ Methode 2 : Factory ............");
        PaiementFactory orange = new OrangeMoneyFactory();
        PaiementFactory mtn = new MtnMoMoFactory();
        PaiementFactory carte = new CarteBancaireFactory();
        PaiementFactory paypal = new PayPalFactory();

        orange.getPaiement().payer(5000);
        mtn.getPaiement().payer(10000);
        carte.getPaiement().payer(25000);
        paypal.getPaiement().payer(15000);
    }
}