package entities;

public class Laserprinter implements Printable {

    public Laserprinter() {
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
