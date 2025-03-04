package fr.nexa.creation.factory;

public class CDFactory extends DiskAbstractFactory {
    private int taille;
    private int vitesseLecture;

    public CDFactory(int taille, int vitesseLecture) {
        this.taille = taille;
        this.vitesseLecture = vitesseLecture;
    }

    @Override
    public Disk create() {
        return new Disk("CD", taille, true, vitesseLecture, 0);
    }
}
