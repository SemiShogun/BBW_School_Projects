import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * PersonalComparator.java
 *
 * @author Jamie Lam
 * @version 23.10.2020
 */
public class PersonalComparator implements Comparator<Alpha> {

    @Override
    public int compare(Alpha o1, Alpha o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        return nameCompare == 0 ? o1.getDate().compareTo(o2.getDate()): nameCompare;
    }


}
