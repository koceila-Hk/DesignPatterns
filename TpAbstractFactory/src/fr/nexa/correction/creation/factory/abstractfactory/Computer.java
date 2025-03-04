package fr.nexa.correction.creation.factory.abstractfactory;

public abstract class Computer extends Produit {

	private int ram;
	private int hdd;
	private float cpu;
	
	protected Computer(String type, int ram, int hdd, float cpu) {
		super.type = type;
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Computer [type=" + type + ", ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}
}
