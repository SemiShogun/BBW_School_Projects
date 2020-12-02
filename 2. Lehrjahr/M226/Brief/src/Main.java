import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Document...");
        System.out.print("Document isn't instantiable, you dummy" + "\n\n");

        System.out.println("Letter...");
        Letter letter = new Letter();
        letter.setName("Hello world.");
        letter.send();

        System.out.print("\n" + "Enroll:" + "\n");
        Enroll enroll = new Enroll();
        enroll.setName("Enrolling to myself");
        enroll.whereArtThou();
        enroll.send();
        enroll.whereArtThou();
    }

}
