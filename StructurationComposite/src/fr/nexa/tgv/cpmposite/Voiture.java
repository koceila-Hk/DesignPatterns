package fr.nexa.tgv.cpmposite;

public final class Voiture implements ITgvComposite{
    private int poids;

    public Voiture(int poids) {
        this.poids = poids;
    }

    @Override
    public int getPoids() {
        return poids;
    }
}
