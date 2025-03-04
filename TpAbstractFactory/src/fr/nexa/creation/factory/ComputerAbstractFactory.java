package fr.nexa.creation.factory;

public abstract class ComputerAbstractFactory implements IFactory {
    @Override
    public abstract Computer create();
}
