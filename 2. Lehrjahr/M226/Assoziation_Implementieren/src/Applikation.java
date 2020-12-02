
public class Applikation {
    private Team[] teams;
    private Fahrer[] fahrer;

    public void main(String args[]) {
        fahrer = new Fahrer[] {
                new Fahrer("Hans"),
                new Fahrer("Paul")
        };
        teams = new Team[] {
                new Team(fahrer[0],
                        fahrer[1])
        };
    }
}