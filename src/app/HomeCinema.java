package app;

public class HomeCinema {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeCinema() {
        this.amplifier = new Amplifier("Top-O-Line Amplifier");
        this.tuner = new Tuner("Top-O-Line AM/FM Tuner", this.amplifier);
        this.dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", this.amplifier);
        this.cdPlayer = new CdPlayer("Top-O-Line CD Player", this.amplifier);
        this.projector = new Projector("Top-O-Line Projector", this.dvdPlayer);
        this.lights = new TheaterLights("Theater Ceiling Lights");
        this.screen = new Screen("Theater Screen");
        this.popper = new PopcornPopper("Popcorn Popper");
    }

    public void watchMovie(String title) {
        this.popper.on();
        this.popper.pop();
        this.lights.dim(0);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amplifier.on();
        this.dvdPlayer.play(title);
        this.amplifier.setSurroundSound();
        this.amplifier.setVolume(5);
        this.dvdPlayer.on();
        this.dvdPlayer.play(0);
    }

    public void stopMovie() {
        this.popper.off();
        this.lights.dim(100);
        this.screen.up();
        this.projector.off();
        this.amplifier.off();
        this.dvdPlayer.stop();
        this.dvdPlayer.eject();
        this.dvdPlayer.off();
    }

    public void playMusic(String title) {
        this.lights.on();
        this.amplifier.on();
        this.amplifier.setVolume(5);
        this.amplifier.setCd(this.cdPlayer);
        this.amplifier.setStereoSound();
        this.cdPlayer.on();
        this.cdPlayer.play(title);
    }

    public void stopMusic() {
        this.amplifier.off();
        this.amplifier.setCd(this.cdPlayer);
        this.cdPlayer.stop();
        this.cdPlayer.eject();
        this.cdPlayer.off();
    }

    public void playRadio(Double frequency) {
        this.tuner.on();
        this.tuner.setFrequency(frequency);
        this.amplifier.on();
        this.amplifier.setVolume(5);
        this.amplifier.setTuner(this.tuner);
    }

    public void stopRadio() {
        this.tuner.off();
        this.amplifier.off();
    }
}