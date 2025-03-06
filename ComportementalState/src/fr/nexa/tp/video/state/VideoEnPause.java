package fr.nexa.tp.video.state;

public class VideoEnPause implements IVideoState{
    @Override
    public void action(Video video) {
        System.out.println("La video est en pause");
    }
}
