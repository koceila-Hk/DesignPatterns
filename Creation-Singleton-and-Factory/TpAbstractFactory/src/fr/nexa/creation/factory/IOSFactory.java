package fr.nexa.creation.factory;

public class IOSFactory extends MobileAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public IOSFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Mobile create() {
        return new Mobile("IOS", ram, hdd, cpu);
    }
}
