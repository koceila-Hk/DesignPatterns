package fr.nexa.correction.creation.factory.abstractfactory;

public final class CD extends Disk {

	public CD(int taille, int vitesseLecture) {
		super("CD", taille, true, vitesseLecture, 0);
	}

}
