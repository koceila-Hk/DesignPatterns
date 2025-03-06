package fr.nexa.db.creation.factory;

public final class DvdFactory extends DiskFactory {

    public DvdFactory(int taille, int vitesseLecteure, int vitesseEcriteure) {
        super.taille = taille;
        super.readOnly = false;
        super.vitesseLecteure = vitesseLecteure;
        super.vitesseEcriteure = vitesseEcriteure;
    }

    @Override
    public Disk create() {
        return new DVD(taille, vitesseLecteure, vitesseEcriteure);
    }
}
