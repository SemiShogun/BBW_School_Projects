import java.util.*;

/**
 * Application.java
 *
 * @author Jamie Lam
 * @version 23.10.2020
 */
public class Application {
    public static void main(String[] args) {
        Beta firstBeta = new Beta(0.1, 100);
        Beta secondBeta = new Beta(0.2, 101);
        Beta thirdBeta = new Beta(0.3, 404);
        Alpha first = new Alpha("Pokemon",new Date(), firstBeta, "Adam");
        Alpha second = new Alpha("Human", new Date(), secondBeta, "Eva");
        Alpha third = new Alpha("Test", new Date(), thirdBeta, "Lilith");

        ArrayList<Alpha> values = new ArrayList<Alpha>();
        values.add(first);
        values.add(second);
        values.add(third);

        ArrayList<Beta> values2 = new ArrayList<Beta>();
        values2.add(firstBeta);
        values2.add(secondBeta);
        values2.add(thirdBeta);

        Collections.sort(values, new AlphaComparator());


        Collections.sort(values, new PersonalComparator());

        for (Alpha s : values)
        {
            System.out.println(s.toString());
        }
        Collections.sort(values2);
    }

}
