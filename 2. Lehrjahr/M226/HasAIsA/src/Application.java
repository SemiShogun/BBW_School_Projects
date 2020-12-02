public class Application {

    public static void main(String[] args) {

        // Processor
        Prozessor core = new Prozessor("Core i7");
        Grafikprozessor nvidia = new Grafikprozessor("NVIDIA GPU Boost 3.0", 1582);
        System.out.print("Prozessor" + "\n" + core + "\n" + nvidia + "\n\n");

        // Books and pages
        Buch buch = new Buch("1984", new Buchseite[] {
            new Buchseite("And so Winston partook in the brotherhood.."),
            new Buchseite("Oceania... Eastasia... Eurasia...")
        });
        System.out.print("Buch und Buchseiten" + "\n" + buch);

    }

}
