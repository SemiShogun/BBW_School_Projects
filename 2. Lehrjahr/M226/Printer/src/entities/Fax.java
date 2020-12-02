package entities;

public class Fax implements Faxable {

    public Fax() {
    }

    @Override
    public void send(String text) {
        System.out.println(text);
    }
}
