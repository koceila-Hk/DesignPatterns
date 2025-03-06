package fr.nexa.tp.eleve.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Eleve {
    private List<Observer> observers;
    private Map<String, Float> notes;
    private float moyenne;

    public Eleve() {
        this.observers = new ArrayList<>();
        this.notes = new HashMap<>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void addOrUpdate(String matiere, Float note) {
        notes.put(matiere, note);
        notifyAllObservers();
    }

    // Notifier tous les observateurs
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.signal();
        }
    }
//    public void calculMoyenne() {
//        float sum = 0;
//        for (float note : notes) {
//            sum += note;
//        }
//        this.moyenne = sum / notes.size();
//    }

    public float getMoyenne() {
        return moyenne;
    }

    public List<Observer> getObservers() {
        return observers;
    }


    public Map<String, Float> getNotes() {
        return notes;
    }


    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

//    public List<Float> getNotes() {
//        return notes;
//    }
}
