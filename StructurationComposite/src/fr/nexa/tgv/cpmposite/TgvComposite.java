package fr.nexa.tgv.cpmposite;

import java.util.ArrayList;
import java.util.List;

public class TgvComposite implements ITgvComposite {

    List<ITgvComposite> composants;

    public TgvComposite() {
        this.composants = new ArrayList<ITgvComposite>();
    }

    public void ajouter(ITgvComposite composant) throws Exception {
        if (composant instanceof Voiture) {
            int nbVoitures = 0;
            for (ITgvComposite tgv : composants) {
                if (tgv instanceof Voiture) {
                    nbVoitures ++;
                }
            }
            if (nbVoitures >= nbVoituresMax) {
                throw new Exception("Le TGV ne doit pas avoir plus de " + nbVoituresMax);
            } else {
                this.composants.add(composant);
            }
        }
        if (composant instanceof Lomocotive) {
            int nbLomocotives = 0;
            for (ITgvComposite tgv : composants) {
                if (tgv instanceof Lomocotive) {
                    nbLomocotives ++;
                }
            }
            if (nbLomocotives >= 2) {
                throw new Exception("Le TGV ne doit pas avoir plus de 2 lomocotives !");
            }
            this.composants.add(composant);
        }
    }

    public  void retirer(ITgvComposite composant) {

    }

    @Override
    public int getPoids() {
        int poidsTotal = 0;
        for (ITgvComposite composant : composants) {
            poidsTotal += composant.getPoids();
        }
        return poidsTotal;
    }

}
