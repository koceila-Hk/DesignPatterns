package fr.nexa.dp.creation.factory.without;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerMetier.create("PC",16, 1000, 2.4f);
        Computer server = ComputerMetier.create("Server",18, 1000, 2.4f);
        Computer portable = ComputerMetier.create("Saaa",18, 1000, 2.4f);
        System.out.println(pc);
        System.out.println(server);
        System.out.println(portable);
    }
}
