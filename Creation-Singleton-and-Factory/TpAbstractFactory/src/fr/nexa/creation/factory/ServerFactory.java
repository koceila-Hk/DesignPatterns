package fr.nexa.creation.factory;

public class ServerFactory extends ComputerAbstractFactory{

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer create() {
        return new Computer("Server", ram, hdd, cpu);
    }
}
