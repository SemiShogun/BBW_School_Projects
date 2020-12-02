import java.util.Comparator;

public class PersonComparatorShoesize implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getShoeSize() - o2.getShoeSize();
    }
}
