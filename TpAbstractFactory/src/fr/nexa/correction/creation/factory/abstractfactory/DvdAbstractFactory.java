package fr.nexa.correction.creation.factory.abstractfactory;

public class DvdAbstractFactory extends DiskAbstractFactory {

	public DvdAbstractFactory(int taille, int vitesseLecture, int vitesseEcriture) {
		
		super.type = "DVD";
		super.taille = taille;
		super.readOnly = false;
		super.vitesseLecture = vitesseLecture;
		super.vitesseEcriture = 0;
		super.vitesseEcriture = vitesseEcriture;
	}
	
	@Override
	public Disk create() {
		return new DVD(taille, vitesseLecture, vitesseEcriture);
	}

}
