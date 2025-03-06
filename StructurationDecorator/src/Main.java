import fr.nexa.structuration.decorator.voiture.*;

public class Main {
    public static void main(String[] args) {
        Voiture vCorsa = new Corsa("Corsa", 5000, 1500);
        System.out.println(vCorsa);

        Voiture vC2 = new C2("C2",4000, 1001);
        System.out.println(vC2);

        Voiture vCorsaReg = new Regulateur(vCorsa);
        System.out.println(vCorsaReg);

        Voiture vC2GPS = new Regulateur(vC2);
        System.out.println(vC2GPS);

        // Corsa
        Voiture vCorsa1 = new Corsa("Corsa",8200, 1536);
        Voiture vCorsa2 = new Gps(vCorsa1);
        Voiture vCorsa3 = new Regulateur(vCorsa2);
        Voiture vCOrsa4 = new ToitOuvrant(vCorsa3);
        Voiture vCorsa5 = new Regulateur(vCOrsa4);
        System.out.println(vCorsa5);

        // C2
        Voiture vC1 = new C2("C2",7200, 1036);
        Voiture v_C2 = new Gps(vC1);
        Voiture vC3 = new Regulateur(v_C2);
        Voiture vC4 = new ToitOuvrant(vC3);
        Voiture vC5 = new Gps(vC4);
        System.out.println(vC5);
    }
}