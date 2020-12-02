package DAO;

import Entity.Joke;
import Entity.JokeBook;

import java.sql.*;
import java.util.ArrayList;

public class DAOMDB implements DAO {

    @Override
    public void getAllJokes(ArrayList<Joke> jokes) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:ucanaccess://src/main/resources/JokeDBAccess2003.mdb");
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM joke");

            while (rs.next()) {
                jokes.add(JokeFillerMDB.createJokeObject(rs));
            }
        } catch (SQLException err) {
            err.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
