package application.hafenboote.model;

public class Boot {
    private int laenge;
    private String name;

    public Boot(String name, int laenge) {
        super();
        this.laenge = laenge;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boot [name=" + name + ", laenge=" + laenge + "]";
    }
}
