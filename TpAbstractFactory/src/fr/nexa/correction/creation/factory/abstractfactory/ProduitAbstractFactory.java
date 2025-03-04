package fr.nexa.correction.creation.factory.abstractfactory;

public abstract class ProduitAbstractFactory {

	protected String type;
	
	public static Produit getProduit(IProduitAbstractFactory factory) {
		return factory.create();
	}
}
