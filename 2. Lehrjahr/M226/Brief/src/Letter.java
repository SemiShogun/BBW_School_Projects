public class Letter extends Document implements Sendable {
    private String address;
    private String sender;
    private String description;

    public Letter() {
        super();
        System.out.println("Letter is being constructed.");
    }


    @Override
    public void send() {
        System.out.println(getName() + " is being sent.");
    }
}
