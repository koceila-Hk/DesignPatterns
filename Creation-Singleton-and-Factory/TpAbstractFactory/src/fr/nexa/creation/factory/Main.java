package fr.nexa.creation.factory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produit pc = ProduitAbstractFactory.getProduit(new PCFactory("64GB", "1", "i7"));
        Produit server = ProduitAbstractFactory.getProduit(new ServerFactory("32GB", "2", "Xxe"));
        Produit cd = ProduitAbstractFactory.getProduit(new CDFactory(2, 100));
        Produit dvd = ProduitAbstractFactory.getProduit(new DVDFactory(500, 100, 80));
        Produit android = ProduitAbstractFactory.getProduit(new AndroidFactroy("32GB", "2", "Xxe"));
        Produit ios = ProduitAbstractFactory.getProduit(new IOSFactory("64GB", "2", "Xxe"));

        System.out.println(pc);
        System.out.println(server);
        System.out.println(cd);
        System.out.println(dvd);
        System.out.println(android);
        System.out.println(ios);


    }
}