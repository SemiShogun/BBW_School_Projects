import java.util.Observable;
import java.util.Observer;

public class AnimalRightsActivist implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String joke = (String) arg;
        if (joke.contains("animal")) {
            System.out.println("AnimalRightsActivist: :(");
        } else {
            System.out.println("AnimalRightsActivist: :)");
        }
    }
}
