package application.hafenboote.model;

public class Motorboot extends Boot{
    private double leistung;

    public Motorboot(String name, int laenge, double leistung) {
        super(name, laenge);
        this.leistung = leistung;
    }

    @Override
    public String toString() {
        return "Motorboot [leistung=" + leistung + ", toString()=" + super.toString() + "]";
    }
}
