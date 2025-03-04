package fr.nexa.structuration.composite;

public final class Tracteur implements ICamionComposite {

	private int poids;

	public Tracteur(int poids) {
		this.poids = poids;
	}

	@Override
	public int getPoids() {
		return poids;
	}

}
