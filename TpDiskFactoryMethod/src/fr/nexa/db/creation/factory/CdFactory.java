package fr.nexa.db.creation.factory;

public final class CdFactory extends DiskFactory {

    private String prix;

    public CdFactory(int taille, int vitesseLecteure, String prix) {
        super.taille = taille;
        super.readOnly = true;
        super.vitesseLecteure = vitesseLecteure;
        super.vitesseEcriteure = 0;
        this.prix = prix;
    }

    @Override
    public Disk create() {
        return new CD(taille, vitesseLecteure, prix);
    }
}
