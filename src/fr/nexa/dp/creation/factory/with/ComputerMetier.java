package fr.nexa.dp.creation.factory.with;

public abstract class ComputerMetier {
    public static Computer getComputer(ComputerFactory factory) {
        return factory.create();
    }
}
