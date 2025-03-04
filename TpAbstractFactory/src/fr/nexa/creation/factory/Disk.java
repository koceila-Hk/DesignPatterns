package fr.nexa.creation.factory;

public class Disk extends Produit {
    private int taille;
    private boolean readOnly;
    private int vitesseLecture;
    private int vitesseEcriture;

    public Disk(String type, int taille, boolean readOnly, int vitesseLecture, int vitesseEcriture) {
        this.type = type;
        this.taille = taille;
        this.readOnly = readOnly;
        this.vitesseLecture = vitesseLecture;
        this.vitesseEcriture = vitesseEcriture;
    }

    @Override
    public String toString() {
        return "Disk{ type='" + type + "', taille=" + taille + ", readOnly=" + readOnly + ", vitesseLecture=" + vitesseLecture + ", vitesseEcriture=" + vitesseEcriture + " }";
    }
}
