package fr.nexa.correction.creation.factory.abstractfactory;

public abstract class Mobile extends Produit {

	private String version;
	private float largeur;
	private float longueur;
	private float profondeur;
	
	protected Mobile(String type, String version, float largeur, float longueur, float profondeur) {
		super.type = type;
		this.version = version;
		this.largeur = largeur;
		this.longueur = longueur;
		this.profondeur = profondeur;
	}

	@Override
	public String toString() {
		return "Mobile [type=" + type + ", version=" + version + ", largeur=" + largeur + ", longueur=" + longueur
				+ ", profondeur=" + profondeur + "]";
	}
	
}
