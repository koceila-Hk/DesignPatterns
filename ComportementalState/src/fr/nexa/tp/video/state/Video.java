package fr.nexa.tp.video.state;

public class Video {
    private IVideoState videoState;

    public void setState(IVideoState videoState) {
        this.videoState = videoState;
    }

    public void action() {
        videoState.action(this);
    }
}
