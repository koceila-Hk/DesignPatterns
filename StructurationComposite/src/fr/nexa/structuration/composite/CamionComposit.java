package fr.nexa.structuration.composite;

import java.util.ArrayList;
import java.util.List;

public final class CamionComposit implements ICamionComposite {

    List<ICamionComposite> composants;

    public CamionComposit() {
        this.composants = new ArrayList<ICamionComposite>();
    }

    public void ajouter(ICamionComposite composant) {
        if (composant instanceof Tracteur) {
            for (ICamionComposite camion : composants) {
                if (camion instanceof Tracteur) {
                    throw new IllegalArgumentException("Un tracteur est déjà présent.");
                }
            }
        } if (composant instanceof  Remorque) {
            int nbRemorque = 0;
            for (ICamionComposite camion : composants) {
                if (camion instanceof Remorque) {
                    nbRemorque ++;
                }
            }
            if (nbRemorque >= 2) {
                throw new IllegalArgumentException("Le camion posséde déjà 2 remorques");
            }
        }
        this.composants.add(composant);
    }

    public void retirer(ICamionComposite composant) {
        this.composants.remove(composant);
    }

    @Override
    public int getPoids() {
        int poidsTotal = 0;
        for (ICamionComposite composant : composants) {
            poidsTotal += composant.getPoids();
        }
        return poidsTotal;
    }

    public List<ICamionComposite> getComposants() {
        return composants;
    }

}
