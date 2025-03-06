package fr.nexa.structuration.decorator.voiture;

public abstract class DecorateurVoiture extends Voiture{
    protected Voiture voiture;

    public DecorateurVoiture(Voiture voiture) {
        super(voiture.libelle, voiture.prix, voiture.poids);
        this.voiture = voiture;
    }

}
