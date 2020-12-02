package entities;

public class Kombidevice implements Printable, Faxable {

    public Kombidevice() {
    }

    @Override
    public void send(String text) {
        System.out.println(text);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
