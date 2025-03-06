package fr.nexa.correction.creation.factory.abstractfactory;

public class CdAbstractFactory extends DiskAbstractFactory {

	public CdAbstractFactory(int taille, int vitesseLecture) {
		
		super.type = "CD";
		super.taille = taille;
		super.readOnly = true;
		super.vitesseLecture = vitesseLecture;
		super.vitesseEcriture = 0;
	}
	
	@Override
	public Disk create() {
		return new CD(taille, vitesseLecture);
	}

}
