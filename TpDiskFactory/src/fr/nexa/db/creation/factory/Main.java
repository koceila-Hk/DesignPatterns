package fr.nexa.db.creation.factory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Disk cd = DiskMetier.getDisk(new CdFactory(2,  100, "40 euro"));
        Disk dvd = DiskMetier.getDisk(new DvdFactory(500, 111, 87));
        System.out.println(cd);
        System.out.println(dvd);
    }
}