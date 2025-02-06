package Facade;

public class MovieFacad {
    Sound sound= new Sound();
    Video video= new Video();
    public void startMovie() {
        sound.playSound();
        video.playVideo();
    }

    public void stopMovie() {
        sound.stopSound();
        video.playVideo();
    }
}
