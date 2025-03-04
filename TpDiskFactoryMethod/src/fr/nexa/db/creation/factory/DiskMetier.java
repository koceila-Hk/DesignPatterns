package fr.nexa.db.creation.factory;

public abstract class DiskMetier {
    public static Disk getDisk(DiskFactory factory) {
        return factory.create();
    }
}
