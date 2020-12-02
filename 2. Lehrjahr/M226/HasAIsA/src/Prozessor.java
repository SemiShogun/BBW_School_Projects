public class Prozessor {
    private String hersteller;

    public Prozessor(String hersteller) {
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return "Prozessor{" +
                "hersteller='" + hersteller + '\'' +
                '}';
    }
}
