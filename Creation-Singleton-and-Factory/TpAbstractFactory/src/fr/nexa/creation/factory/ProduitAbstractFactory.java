package fr.nexa.creation.factory;

public class ProduitAbstractFactory {

    public static Produit getProduit(IFactory factory) {
        return factory.create();
    }
}
