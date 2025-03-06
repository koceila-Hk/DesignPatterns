package fr.nexa.structuration.decorator.voiture;

public class Gps extends DecorateurVoiture {
    public Gps(Voiture voiture) {
        super(voiture);

        // Vérifier si la voiture posséde déjà l'option
        if (voiture.options.contains(Gps.class.getSimpleName())) {
            throw new IllegalArgumentException("Un GPS est déjà installé !");
        }
        voiture.options.add(Gps.class.getSimpleName());
        this.libelle = voiture.libelle + " " + Gps.class.getSimpleName();
        this.prix = voiture.prix;
        this.poids = voiture.poids;
    }
}
