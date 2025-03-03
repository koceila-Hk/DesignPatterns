package fr.nexa.db.creation.factory;

public class CD extends Disk{
    private String prix;

    public CD(int taille, int vitesseLecteure, String prix) {
        super("CD", taille, true, vitesseLecteure, 0);
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "CD{" +
                "type='" + getType() + '\'' +
                ", taille=" + getTaille() +
                ", readOnly=" + isReadOnly() +
                ", vitesseLecteure=" + getVitesseLecteure() +
                ", vitesseEcriteure=" + getVitesseEcriteure() +
                ", prix='" + prix + '\'' +
                '}';
    }
}
