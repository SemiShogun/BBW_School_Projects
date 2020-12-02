import java.util.Comparator;

public class AlphaComparator implements Comparator<Alpha> {

    @Override
    public int compare(Alpha arg0, Alpha arg1) {
        int typeCompare = arg0.getType().compareTo(arg1.getType());
        return typeCompare == 0 ? arg0.getChild().compareTo(arg1.getChild()): typeCompare;
    }
}
