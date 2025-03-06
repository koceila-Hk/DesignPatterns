package fr.nexa.creation.factory;


public class PCFactory extends ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer create() {
        return new Computer("PC", ram, hdd, cpu);
    }
}
