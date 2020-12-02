import java.util.Observable;
import java.util.Observer;

public class Trucker implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String joke = (String) arg;
        if (joke.contains("truck")) {
            System.out.println("Trucker: aha");
        } else {
            System.out.println("Trucker: <Chirp>");
        }
    }
}