package fr.nexa.tp.video.state;

public class VideoEnLecteure implements IVideoState{
    @Override
    public void action(Video video) {
        System.out.println("La video est en lecteure");
    }
}
