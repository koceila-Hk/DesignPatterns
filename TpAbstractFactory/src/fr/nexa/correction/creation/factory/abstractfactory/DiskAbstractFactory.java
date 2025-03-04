package fr.nexa.correction.creation.factory.abstractfactory;

public abstract class DiskAbstractFactory extends ProduitAbstractFactory
							implements IProduitAbstractFactory {

	protected int taille;
	protected boolean readOnly;
	protected int vitesseLecture;
	protected int vitesseEcriture;
	
	public abstract Disk create();
}
