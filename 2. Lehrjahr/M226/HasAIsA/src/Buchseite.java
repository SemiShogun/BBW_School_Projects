public class Buchseite {
    private String text;

    public Buchseite(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Buchseite{" +
                "text='" + text + '\'' +
                '}';
    }
}
