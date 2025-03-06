import fr.nexa.tp.eleve.observer.Eleve;
import fr.nexa.tp.eleve.observer.MatiereEnum;
import fr.nexa.tp.eleve.observer.NotesObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Eleve eleve = new Eleve();
        new NotesObserver(eleve);

        eleve.addOrUpdate(MatiereEnum.MATH.getValue(), 12F);
        eleve.addOrUpdate(MatiereEnum.PHYSIQUE.getValue(), 11F);
        eleve.addOrUpdate(MatiereEnum.SIENCES.getValue(), 10f);
        eleve.addOrUpdate(MatiereEnum.MATH.getValue(), 16f);

        System.out.println("La moyenne = " + eleve.getMoyenne());
    }
}