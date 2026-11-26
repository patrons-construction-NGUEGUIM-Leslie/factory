package cours;

public class ProduitFactoryA extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        return new ProduitA();
    }
}