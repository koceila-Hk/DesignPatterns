package fr.nexa.correction.creation.factory.abstractfactory;

public class AndroidAbstractFactory extends MobileAbstractFactory{

	public AndroidAbstractFactory(String version, float largeur, float longueur, float profondeur) {
		super.type = "Android";
		super.version = version;
		super.largeur = largeur;
		super.longueur = longueur;
		super.profondeur = profondeur;
	}

	@Override
	public Produit create() {
		return new Android(version, largeur, longueur, profondeur);
	}

}
