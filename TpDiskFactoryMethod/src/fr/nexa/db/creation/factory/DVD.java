package fr.nexa.db.creation.factory;

public final class DVD extends Disk{
    public DVD(int taille,int vitesseLecteure, int vitesseEcriteure) {
        super("DVD", taille,false, vitesseLecteure, vitesseEcriteure);
    }
}
