package fr.nexa.correction.creation.factory.abstractfactory;

public final class PcAbstractFactory extends ComputerAbstractFactory {

	public PcAbstractFactory(int ram, int hdd, float cpu) {
		super.type = "PC";
		super.ram = ram;
		super.hdd = hdd;
		super.cpu = cpu;
	}
	
	@Override
	public Computer create() {
		return new PC(ram, hdd, cpu);
	}

}
