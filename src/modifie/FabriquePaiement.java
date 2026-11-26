package modifie;

public class FabriquePaiement {
    public static final String ORANGE_MONEY = "ORANGE";
    public static final String MTN_MOMO = "MTN";
    public static final String CARTE = "CARTE";
    public static final String PAYPAL = "PAYPAL";

    public Paiement createPaiement(String type) {
        Paiement paiement = null;
        switch (type) {
            case ORANGE_MONEY:
                paiement = new OrangeMoney();
                break;
            case MTN_MOMO:
                paiement = new MtnMoMo();
                break;
            case CARTE:
                paiement = new CarteBancaire();
                break;
            case PAYPAL:
                paiement = new PayPal();
                break;
            default:
                throw new IllegalArgumentException("Moyen de paiement inconnu : " + type);
        }
        return paiement;
    }
}