package fr.nexa.db.creation.factory;

public abstract class Disk {
    private String type;
    private int taille;
    private boolean readOnly;
    private int vitesseLecteure;
    private int vitesseEcriteure;

    public Disk(String type, int taille, boolean readOnly, int vitesseLecteure, int vitesseEcriteure) {
        this.type = type;
        this.taille = taille;
        this.readOnly = readOnly;
        this.vitesseLecteure = vitesseLecteure;
        this.vitesseEcriteure = vitesseEcriteure;
    }

    public int getTaille() {
        return taille;
    }

    public String getType() {
        return type;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public int getVitesseLecteure() {
        return vitesseLecteure;
    }

    public int getVitesseEcriteure() {
        return vitesseEcriteure;
    }
    @Override
    public String toString() {
        return "Disk{" +
                "type='" + type + '\'' +
                ", taille=" + taille +
                ", readOnly=" + readOnly +
                ", vitesseLecteure=" + vitesseLecteure +
                ", vitesseEcriteure=" + vitesseEcriteure +
                '}';
    }

}
