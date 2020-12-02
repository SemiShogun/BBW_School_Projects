import java.util.Observable;

public class JokeTeller extends Observable {

    public void tellJokeA() {
        String joke = "A man walks into the bar...";
        System.out.println("Joke: " + joke);
        setChanged();
        notifyObservers(joke);
    }

    public void tellJokeB() {
        String joke = "Two animals walk through the forest...";
        System.out.println("Joke: " + joke);
        setChanged();
        notifyObservers(joke);
    }

    public void tellJokeC() {
        String joke = "A blondie thinks...";
        System.out.println("Joke: " + joke);
        setChanged();
        notifyObservers(joke);
    }

}
