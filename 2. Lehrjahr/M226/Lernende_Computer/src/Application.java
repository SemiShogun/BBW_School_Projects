/**
 * Application.java
 *
 * @author Jamie Lam
 * @version 25.10.2019
 */
public class Application {

    public static void main(String[] args) {
        School school = new School("BBWInformatik");

        Apprentice hans = new Apprentice("Hans");
        hans.setSchool(school);

        Apprentice paula = new Apprentice("Paula");
        paula.setSchool(school);

        System.out.println("------------------------------");
        System.out.println("BBW, Apprentices and Computers: ");
        System.out.println("------------------------------");
        System.out.println(school);
        System.out.println(hans);
        System.out.println(paula);

        System.out.println("------------------------------");
        System.out.println("Working with Desktops: ");
        System.out.println("------------------------------");
        hans.startWork();
        paula.startWork();
        System.out.println(hans);
        System.out.println(paula);

        System.out.println("------------------------------");
        System.out.println("Finished working with Desktops: ");
        System.out.println("------------------------------");
        hans.endWork();
        paula.endWork();
        System.out.println(hans);
        System.out.println(paula);
        System.out.println();

    }
}
