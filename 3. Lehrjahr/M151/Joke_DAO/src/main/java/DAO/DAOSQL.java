package DAO;

import Entity.Joke;
import Entity.JokeBook;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOSQL implements DAO {

    @Override
    public void getAllJokes(ArrayList<Joke> jokes) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:ucanaccess://src/main/resources/JokeDB.accdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM joke");

            while (rs.next()) {
                jokes.add(JokeFillerSQL.createJokeObject(rs));
            }
        } catch (SQLException err) {
            err.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
