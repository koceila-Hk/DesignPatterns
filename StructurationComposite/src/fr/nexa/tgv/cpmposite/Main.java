package fr.nexa.tgv.cpmposite;

public class Main {
    public static void main(String[] args) throws Exception {

        TgvComposite tgv = new TgvComposite();

        for (int i = 0; i < 20; i++) {
            Voiture v1 = new Voiture(10);
            tgv.ajouter(v1);
        }

        Lomocotive l1 = new Lomocotive(2);
        tgv.ajouter(l1);

        System.out.println("Poids total de TGV est de : " + tgv.getPoids());
        System.out.println("Nombres de voitures : " + ITgvComposite.nbVoituresMax);
    }
}
