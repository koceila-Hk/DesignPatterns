import fr.nexa.tp.video.state.RetourAuDebut;
import fr.nexa.tp.video.state.Video;
import fr.nexa.tp.video.state.VideoEnLecteure;
import fr.nexa.tp.video.state.VideoEnPause;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setState(new VideoEnLecteure());
        video.action();
        video.setState(new VideoEnPause());
        video.action();
        video.setState(new RetourAuDebut());
        video.action();

    }
}