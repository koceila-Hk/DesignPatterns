package fr.nexa.correction.creation.factory.abstractfactory;

public class Main {

	public static void main(String[] args) {

		PC pc = (PC) ProduitAbstractFactory.getProduit(new PcAbstractFactory(16, 1000, 2.4f));
		System.out.println(pc);

		Server server = (Server) ProduitAbstractFactory.getProduit(new ServerAbstractFactory(16, 1000, 2.4f));
		System.out.println(server);
		
		CD cd = (CD) ProduitAbstractFactory.getProduit(new CdAbstractFactory(700, 180));
		System.out.println(cd);

		DVD dvd = (DVD) ProduitAbstractFactory.getProduit(new DvdAbstractFactory(1200, 180, 150));
		System.out.println(dvd);
		
		Android android = (Android) ProduitAbstractFactory.getProduit(new AndroidAbstractFactory("10.0.5", 6.2f, 10.5f, 0.5f));
		System.out.println(android);

		Ios ios = (Ios) ProduitAbstractFactory.getProduit(new IosAbstractFactory("6.2.0", 6.2f, 10.5f, 0.5f));
		System.out.println(ios);

	}

}
