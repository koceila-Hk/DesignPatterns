package fr.nexa.correction.creation.factory.abstractfactory;

public abstract class ComputerAbstractFactory extends ProduitAbstractFactory
							implements IProduitAbstractFactory {

	protected int ram;
	protected int hdd;
	protected float cpu;
	
	public abstract Computer create();
}
