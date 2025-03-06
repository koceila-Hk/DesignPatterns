package fr.nexa.correction.creation.factory.abstractfactory;

public abstract class MobileAbstractFactory extends ProduitAbstractFactory
					implements IProduitAbstractFactory {

	protected String version;
	protected float largeur;
	protected float longueur;
	protected float profondeur;
	
	public abstract Produit create();

}
