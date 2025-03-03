package fr.nexa.dp.creation.factory.with;

public final class ServerFactory extends ComputerFactory {


    public ServerFactory(int ram, int hdd, float cpu) {
        super.type = "Server";
        super.ram = ram;
        super.hdd = hdd;
        super.cpu = cpu;
    }

    @Override
    protected Computer create() {
        return new Server(ram, hdd, cpu);
    }
}
