package Entity;

import DAO.DAO;

import java.util.ArrayList;

public class JokeBook {
    private ArrayList<Joke> jokes;

    public JokeBook(DAO dao) {
        super();
        jokes = new ArrayList<Joke>();
        dao.getAllJokes(jokes);
    }

    public void print() {
        jokes.stream().forEach(joke -> joke.print());
    }
}
