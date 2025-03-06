package fr.nexa.tp.video.state;

public class RetourAuDebut implements IVideoState{
    @Override
    public void action(Video video) {
        System.out.println("Retour au début de la vidéo");
    }
}
