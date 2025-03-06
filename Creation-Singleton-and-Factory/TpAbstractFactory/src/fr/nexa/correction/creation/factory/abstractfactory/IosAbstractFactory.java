package fr.nexa.correction.creation.factory.abstractfactory;

public class IosAbstractFactory extends MobileAbstractFactory{

	public IosAbstractFactory(String version, float largeur, float longueur, float profondeur) {
		super.type = "IOS";
		super.version = version;
		super.largeur = largeur;
		super.longueur = longueur;
		super.profondeur = profondeur;
	}

	@Override
	public Produit create() {
		return new Ios(version, largeur, longueur, profondeur);
	}

}
