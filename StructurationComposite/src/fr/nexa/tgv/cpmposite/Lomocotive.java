package fr.nexa.tgv.cpmposite;

public final class Lomocotive implements ITgvComposite{
    private int poids;

    public Lomocotive(int poids) {
        this.poids = poids;
    }

    @Override
    public int getPoids() {
        return poids;
    }
}
