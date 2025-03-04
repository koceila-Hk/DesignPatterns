package fr.nexa.creation.factory;

public abstract class Produit {
    protected String type;
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Produit{" +
                "type='" + type + '\'' +
                '}';
    }
}
