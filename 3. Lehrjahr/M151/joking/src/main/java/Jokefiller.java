import java.sql.ResultSet;
import java.sql.SQLException;

public class Jokefiller {

    private static void fillJoke(Joke joke, ResultSet entry) throws SQLException {
        entry.getInt("id");
        joke.setId(entry.getInt("id"));
        joke.setText(entry.getString("text"));
        joke.setRating(entry.getInt("rating"));
        joke.setInsertedDate(entry.getDate("date"));
    }

    public static Joke createJokeObject(ResultSet entry) throws SQLException {
        return new Joke(entry.getInt("id"),
                entry.getString("text"),
                entry.getInt("rating"),
                entry.getDate("date"));
    }
}
