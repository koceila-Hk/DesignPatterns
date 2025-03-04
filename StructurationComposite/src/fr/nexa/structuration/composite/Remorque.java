package fr.nexa.structuration.composite;

public final class Remorque implements ICamionComposite {

	private int poids;

	public Remorque(int poids) {
		this.poids = poids;
	}

	@Override
	public int getPoids() {
		return poids;
	}

}
