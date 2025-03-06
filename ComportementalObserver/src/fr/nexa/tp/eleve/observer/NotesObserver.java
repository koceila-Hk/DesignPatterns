package fr.nexa.tp.eleve.observer;

import java.util.Map;

public class NotesObserver extends Observer{

    public NotesObserver(Eleve eleve) {
        super.eleve = eleve;
        super.eleve.attach(this);
    }

    @Override
    public void signal() {
        float moyenne = 0;
        for (Map.Entry<String, Float> entry: super.eleve.getNotes().entrySet()) {
            String matiere = entry.getKey();
            float note = entry.getValue();
            moyenne += note;
        }
        moyenne = moyenne / super.eleve.getNotes().size();
        super.eleve.setMoyenne(moyenne);
//        System.out.println("La moyenne " + super.eleve.getMoyenne());
    }
}
