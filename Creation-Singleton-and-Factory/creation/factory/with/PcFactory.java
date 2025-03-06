package fr.nexa.dp.creation.factory.with;

public final class PcFactory extends ComputerFactory {

    public PcFactory(int ram, int hdd, float cpu) {
        super.type = "PC";
        super.ram = ram;
        super.hdd = hdd;
        super.cpu = cpu;
    }

    @Override
    protected Computer create() {
        return new Pc(ram, hdd, cpu);
    }

}

