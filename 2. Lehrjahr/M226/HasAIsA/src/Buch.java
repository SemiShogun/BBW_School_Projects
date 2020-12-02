import java.util.Arrays;

public class Buch {
    private String titel;
    private Buchseite[] buchseiten;

    public Buch(String titel, Buchseite[] buchseiten) {
        super();
        this.titel = titel;
        this.buchseiten = buchseiten;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", buchseiten=" + Arrays.toString(buchseiten) +
                '}';
    }
}
