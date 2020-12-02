import java.util.ArrayList;

public class JokeBook {
    private final ArrayList<Joke> jokes;

    public JokeBook(ArrayList<Joke> jokes) {
        this.jokes = jokes;
    }

    @Override
    public String toString() {
        return "JokeBook{" +
                "jokes=" + jokes +
                '}';
    }
}
