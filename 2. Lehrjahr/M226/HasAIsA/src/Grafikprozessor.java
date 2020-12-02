public class Grafikprozessor extends Prozessor {
    private int gpuBoostTakt;

    public Grafikprozessor(String hersteller, int gpuBoostTakt) {
        super(hersteller);
        this.gpuBoostTakt = gpuBoostTakt;
    }

    @Override
    public String toString() {
        return "Grafikprozessor{" +
                super.toString() +
                "gpuBoostTakt=" + gpuBoostTakt +
                '}';
    }
}
