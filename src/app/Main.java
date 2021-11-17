package app;

public class Main {
    public static void main(String[] args) {
        HomeCinema homeCinema = new HomeCinema();

        homeCinema.watchMovie("Shrek 5");
        homeCinema.stopMovie();
        homeCinema.playMusic("Rick Astley - Never gonna give you up");
        homeCinema.stopMusic();
        homeCinema.playRadio(101.20);
        homeCinema.stopRadio();
    }
}