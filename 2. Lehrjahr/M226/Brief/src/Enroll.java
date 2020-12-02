public class Enroll extends Letter implements Available {
    String destination = "No destination available...";

    public Enroll() {
        super();
        System.out.println("Enroll is being constructed.");
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void whereArtThou() {
        System.out.println(getName() + " I am currently here: " + destination);
    }
}