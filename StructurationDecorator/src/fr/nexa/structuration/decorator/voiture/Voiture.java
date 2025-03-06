package fr.nexa.structuration.decorator.voiture;

import java.util.HashSet;
import java.util.Set;

public abstract class Voiture {
    protected String libelle;
    protected int prix;
    protected int poids;
    protected Set<String> options = new HashSet<>();

    public Voiture(String libelle, int prix, int poids) {
        this.libelle = libelle;
        this.prix = prix;
        this.poids = poids;
    }

    public boolean ajoutOption(String option) {
        return options.add(option);
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "libelle='" + libelle + '\'' +
                ", prix=" + prix +
                ", poids=" + poids +
                '}';
    }
}
