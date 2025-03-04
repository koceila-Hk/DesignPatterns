package fr.nexa.creation.factory;

public class Computer extends Produit {
    private String ram;
    private String hdd;
    private String cpu;

    public Computer(String type, String ram, String hdd, String cpu) {
        this.type = type;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{ type='" + type + "', ram='" + ram + "', hdd='" + hdd + "', cpu='" + cpu + "' }";
    }
}