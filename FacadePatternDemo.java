// Facade Pattern Example from Head First Design Patterns

class Amplifier {
    public void on() { System.out.println("Amplifier on"); }
    public void off() { System.out.println("Amplifier off"); }
}
class DvdPlayer {
    public void on() { System.out.println("DVD Player on"); }
    public void play() { System.out.println("DVD Player playing"); }
    public void off() { System.out.println("DVD Player off"); }
}
class TheaterLights {
    public void dim() { System.out.println("Theater Lights dimming"); }
}

class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private TheaterLights lights;
    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, TheaterLights lights) {
        this.amp = amp;
        this.dvd = dvd;
        this.lights = lights;
    }
    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        lights.dim();
        amp.on();
        dvd.on();
        dvd.play();
    }
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        amp.off();
        dvd.off();
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        TheaterLights lights = new TheaterLights();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, lights);
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}

