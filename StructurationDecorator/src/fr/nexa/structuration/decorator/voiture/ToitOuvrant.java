package fr.nexa.structuration.decorator.voiture;

public class ToitOuvrant extends DecorateurVoiture {

    public ToitOuvrant(Voiture voiture) {
        super(voiture);

        // Vérifier si la voiture posséde déjà l'option
        if (!ajoutOption("Toit ouvrant")) {
            throw new IllegalArgumentException("Un toit ouvrant déjà existant !");
        }

        this.libelle = voiture.libelle + " Toit ouvrant";
        this.prix = voiture.prix;
        this.poids = voiture.poids;
    }
}
