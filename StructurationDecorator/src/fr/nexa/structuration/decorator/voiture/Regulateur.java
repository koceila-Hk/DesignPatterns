package fr.nexa.structuration.decorator.voiture;

public class Regulateur extends DecorateurVoiture {

    public Regulateur(Voiture voiture) {
        super(voiture);

        // Vérifier si la voiture posséde déjà l'option
        if (!ajoutOption("Regulateur")) {
            throw new IllegalArgumentException("Un régulateur est déjà installé !");
        }
        this.libelle = voiture.libelle + " Regulateur";
        this.prix = voiture.prix;
        this.poids = voiture.poids;
    }
}
