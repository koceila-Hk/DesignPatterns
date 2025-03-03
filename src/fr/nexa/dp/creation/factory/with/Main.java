package fr.nexa.dp.creation.factory.with;


public class Main {

    public static void main(String[] args) {

        Computer pc = ComputerMetier.getComputer(new PcFactory(16, 1000, 2.4f));
        Computer server = ComputerMetier.getComputer(new ServerFactory(128, 3000, 3.5f));
        Computer pcPortable = ComputerMetier.getComputer(new PcPortableFactory(8, 512, 1.8f));

        System.out.println(pc);
        System.out.println(server);
        System.out.println(pcPortable);
    }

}