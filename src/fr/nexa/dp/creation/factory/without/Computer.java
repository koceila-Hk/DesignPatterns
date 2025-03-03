package fr.nexa.dp.creation.factory.without;

public abstract class Computer {
    private int ram;
    private int hdd;
    private float cpu;

    public Computer(int ram, int hdd, float cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", cpu=" + cpu +
                '}';
    }
}
