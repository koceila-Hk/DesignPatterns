package fr.nexa.correction.creation.factory.abstractfactory;

public final class DVD extends Disk {

	public DVD(int taille, int vitesseLecture, int vitesseEcriture) {
		super("DVD", taille, false, vitesseLecture, vitesseEcriture);
	}

}
