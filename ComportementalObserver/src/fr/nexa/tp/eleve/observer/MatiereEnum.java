package fr.nexa.tp.eleve.observer;

public enum MatiereEnum {

    MATH ("Math"),
    PHYSIQUE ("Physique"),
    SIENCES ("Siences");

    MatiereEnum(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
