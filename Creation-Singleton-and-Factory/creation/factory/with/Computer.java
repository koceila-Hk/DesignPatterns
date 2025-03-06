package fr.nexa.dp.creation.factory.with;

public abstract class Computer {

    private String type;
    private int ram;
    private int hdd;
    private float cpu;

    protected Computer(String type, int ram, int hdd, float cpu) {
        this.type = type;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer [type=" + type + ", ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
    }
}