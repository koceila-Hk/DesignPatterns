package fr.nexa.creation.factory;

public class Mobile extends Produit{

    private String ram;
    private String hdd;
    private String cpu;

    public Mobile(String type, String ram, String hdd, String cpu) {
        this.type = type;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Mobile{ type='" + type + "', ram='" + ram + "', hdd='" + hdd + "', cpu='" + cpu + "' }";
    }
}
