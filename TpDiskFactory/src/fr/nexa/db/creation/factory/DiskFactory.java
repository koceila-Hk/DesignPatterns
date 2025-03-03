package fr.nexa.db.creation.factory;

public abstract class DiskFactory {

    protected String type;
    protected int taille;
    protected boolean readOnly;
    protected int vitesseLecteure;
    protected int vitesseEcriteure;

    protected abstract Disk create();
}
