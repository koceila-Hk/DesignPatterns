package fr.nexa.dp.creation.factory.with;

public final class PcPortableFactory extends ComputerFactory {

	public PcPortableFactory(int ram, int hdd, float cpu) {
		super.type = "PC Portable";
		super.ram = ram;
		super.hdd = hdd;
		super.cpu = cpu;
	}
	
	@Override
	protected Computer create() {
		return new PcPortable(ram, hdd, cpu);
	}

}
