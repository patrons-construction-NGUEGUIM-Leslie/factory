package cours;

public class Client {
    public static void main(String[] args) {
        System.out.println("............ Methode 1 : Factory Method ............");
        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;

        produit = fabriqueproduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();
        produit = fabriqueproduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();

        try {
            produit = fabriqueproduit.createProduit("D");
            produit.methodeproduit();
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n............ Methode 2 : Factory ............");
        ProduitFactory produitfactoryA = new ProduitFactoryA();
        ProduitFactory produitfactoryB = new ProduitFactoryB();
        ProduitFactory produitfactoryC = new ProduitFactoryC();

        produit = produitfactoryA.getProduit();
        produit.methodeproduit();
        produit = produitfactoryB.getProduit();
        produit.methodeproduit();
        produit = produitfactoryC.getProduit();
        produit.methodeproduit();
    }
}