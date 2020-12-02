import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] NichtSOIAufgabe) {
        Person[] comparatorDataName = PersonData.getData();
        Arrays.sort(comparatorDataName, new PersonComparator());
        System.out.println("Comparator with firstname and lastname: " + Arrays.toString(comparatorDataName));

        Person[] comparatorDataAge = PersonData.getData();
        Arrays.sort(comparatorDataAge, new PersonComparatorAge());
        System.out.println("Comparator with age: " + Arrays.toString(comparatorDataAge));

        Person[] comparatorDataHeight = PersonData.getData();
        Arrays.sort(comparatorDataHeight, new PersonComparatorHeight());
        System.out.println("Comparator with height: " + Arrays.toString(comparatorDataHeight));

        Person[] comparatorDataShoesize = PersonData.getData();
        Arrays.sort(comparatorDataShoesize, new PersonComparatorShoesize());
        System.out.println("Comparator with shoesize: " + Arrays.toString(comparatorDataShoesize));

        PersonComparableName[] comparableDataName = PersonDataComparableName.getData();
        Arrays.sort(comparableDataName);
        System.out.println("Comparable with firstname and lastname: " + Arrays.toString(comparableDataName));

        PersonComparableAge[] comparableDataAge = PersonDataComparableAge.getData();
        Arrays.sort(comparableDataAge);
        System.out.println("Comparable with age: " + Arrays.toString(comparableDataAge));

        PersonComparableHeight[] comparableDataHeight = PersonDataComparableHeight.getData();
        Arrays.sort(comparableDataHeight);
        System.out.println("Comparable with Height: " + Arrays.toString(comparableDataHeight));

        PersonComparableShoesize[] comparableDataShoesize = PersonDataComparableShoesize.getData();
        Arrays.sort(comparableDataShoesize);
        System.out.println("Comparable with Shoesize in descending order: " + Arrays.toString(comparableDataShoesize));

        // Ai = 愛
        // Saki = 咲希
        // Itsuki = 樹
        // Megumi = 恵
        // Daisuke = 大輔
        // Hotaru = 螢
        // Nanami = 七海
        // Minoru = 実

        List<String> nihonNames = Arrays.asList(
                "愛", "樹", "大輔", "恵", "螢", "七海", "実", "咲希");
        Collections.sort(nihonNames, Collator.getInstance(Locale.forLanguageTag("ja")));
        System.out.println("Comparing different languages: " + nihonNames);

    }
}