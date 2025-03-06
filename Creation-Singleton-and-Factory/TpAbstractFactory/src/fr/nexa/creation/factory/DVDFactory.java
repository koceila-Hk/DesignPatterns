package fr.nexa.creation.factory;

public class DVDFactory extends DiskAbstractFactory {
    private int taille;
    private int vitesseLecture;
    private int vitesseEcriture;

    public DVDFactory(int taille, int vitesseLecture, int vitesseEcriture) {
        this.taille = taille;
        this.vitesseLecture = vitesseLecture;
        this.vitesseEcriture = vitesseEcriture;
    }

    @Override
    public Disk create() {
        return new Disk("DVD", taille, false, vitesseLecture, vitesseEcriture);
    }
}
