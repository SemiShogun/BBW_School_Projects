import DAO.DAO;
import DAO.DAOMDB;
import DAO.DAOSQL;
import Entity.JokeBook;

public class Application {
    public static void main(String[] bruh) {
        System.out.println("Joke DB von Maria DB");
        System.out.println();

        DAO daoMDB = new DAOMDB();
        JokeBook first = new JokeBook(daoMDB);
        first.print();

        System.out.println("Joke DB von MySQL");
        System.out.println();
        DAO daoSQL = new DAOSQL();
        JokeBook second = new JokeBook(daoSQL);
        second.print();
    }
}
