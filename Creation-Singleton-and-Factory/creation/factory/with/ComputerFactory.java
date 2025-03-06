package fr.nexa.dp.creation.factory.with;

public abstract class ComputerFactory {
    protected String type;
    protected int ram;
    protected int hdd;
    protected float cpu;

    protected abstract Computer create();
}
