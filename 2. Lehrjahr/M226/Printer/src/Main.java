import entities.Fax;
import entities.Kombidevice;
import entities.Laserprinter;

public class Main {
    public static void main(String[] args) {
        Laserprinter laserprinter = new Laserprinter();
        Fax fax = new Fax();
        Kombidevice combi = new Kombidevice();
        laserprinter.print("This is a test");
        fax.send("This is a test");
        combi.print("This is a test");
        combi.send("This is a test");
    }
}