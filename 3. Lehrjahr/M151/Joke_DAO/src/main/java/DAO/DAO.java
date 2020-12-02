package DAO;

import Entity.Joke;

import java.util.ArrayList;

public interface DAO {

    void getAllJokes(ArrayList<Joke> jokes);
}
