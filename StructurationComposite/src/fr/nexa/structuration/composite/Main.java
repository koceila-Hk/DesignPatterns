package fr.nexa.structuration.composite;

public class Main {

	public static void main(String[] args) {

		CamionComposit camion = new CamionComposit();
		
		Tracteur t = new Tracteur(30);
		camion.ajouter(t);

//		Tracteur t1 = new Tracteur(30);
//		camion.ajouter(t1);
		
		Remorque r1 = new Remorque(10);
		camion.ajouter(r1);
		
		Remorque r2 = new Remorque(20);
		camion.ajouter(r2);

		Remorque r3 = new Remorque(20);
		camion.ajouter(r3);
		
		System.out.println("Poids total du camion = " + camion.getPoids());
		
	}

}
