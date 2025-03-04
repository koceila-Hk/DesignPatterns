package fr.nexa.correction.creation.factory.abstractfactory;

public final class ServerAbstractFactory extends ComputerAbstractFactory {

	public ServerAbstractFactory(int ram, int hdd, float cpu) {
		super.type = "Server";
		super.ram = ram;
		super.hdd = hdd;
		super.cpu = cpu;
	}
	
	@Override
	public Computer create() {
		return new Server(ram, hdd, cpu);
	}

}
