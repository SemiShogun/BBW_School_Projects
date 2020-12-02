package application.hafenboote.model;

public class Segelboot extends Boot {
    private int segelflaeche;

    public Segelboot(String name, int laenge, int segelflaeche) {
        super(name, laenge);
        this.segelflaeche = segelflaeche;
    }

    @Override
    public String toString() {
        return "Segelboot [segelflaeche=" + segelflaeche +", " + super.toString() + "]";
    }

}
