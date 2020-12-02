import java.util.Observable;
import java.util.Observer;

public class Manager implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String joke = (String) arg;
        if (joke.split(" ").length > 5) {
            System.out.println("Manager: <chirp>");
        } else {
            System.out.println("Manager: haha");
        }
    }
}
