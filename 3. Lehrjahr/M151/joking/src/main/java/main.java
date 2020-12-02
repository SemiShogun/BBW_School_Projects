import java.sql.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] bruh) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionUrl = "jdbc:mysql://localhost/jokedb";
            Connection connection = DriverManager.getConnection(connectionUrl, "root", "");

            Statement stmt = connection.createStatement();
            ResultSet entries = stmt.executeQuery("SELECT * FROM joke");

            ArrayList<Joke> jokes = new ArrayList<Joke>();

            while (entries.next()) {
                jokes.add(Jokefiller.createJokeObject(entries));
            }

            JokeBook jokeBook = new JokeBook(jokes);
            System.out.println(jokeBook.toString());

            entries.close();
            stmt.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
