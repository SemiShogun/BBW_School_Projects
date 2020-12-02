import entities.City;
import entities.FileSerializer;
import entities.Person;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void Main(String[] args) {
        final String filepath = "C:\\tmp";
        FileSerializer objectIO = new FileSerializer();

        Person person = new Person("Johnny","Test",45, new City("Test",8400));
        System.out.println(person);

        List<Person> myPersons = Arrays.asList(
                new Person("Johnny","Frost",45, new City("Test",8400)),
                new Person("Johnny","Bruh",45, new City("Test",8400))
        );


        objectIO.WriteObjectToFile(filepath, myPersons);
        myPersons.get(0).setFirstName("Brick");
        System.out.println(myPersons);

        myPersons = (List<Person>) objectIO.ReadObjectFromFile(filepath);
        System.out.println(myPersons);
    }
}
