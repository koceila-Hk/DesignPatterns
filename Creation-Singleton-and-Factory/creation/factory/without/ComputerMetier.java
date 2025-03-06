package fr.nexa.dp.creation.factory.without;

public abstract class ComputerMetier {
    public static Computer create(String type, int ram, int hdd, float cpu) {
        if (type.equalsIgnoreCase("PC")) {
            return new Pc(ram, hdd, cpu);
        }
        if (type.equalsIgnoreCase("Server")) {
            return new Server(ram, hdd, cpu);
        }
        throw new IllegalArgumentException("Le type " + type + "n'est pas pris en charge");
    }
}
