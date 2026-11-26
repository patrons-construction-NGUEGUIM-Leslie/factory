package cours;

public class ProduitFactoryC extends ProduitFactory {
    @Override
    protected Produit createProduit() {
        return new ProduitC();
    }
}