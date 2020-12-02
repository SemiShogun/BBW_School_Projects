public class Application {

    public static void main(String[] args) {
        JokeTeller jokeTeller = new JokeTeller();
        Trucker trucker = new Trucker();
        Manager manager = new Manager();
        AnimalRightsActivist araara = new AnimalRightsActivist();

        jokeTeller.addObserver(trucker);
        jokeTeller.addObserver(araara);
        jokeTeller.addObserver(manager);

        jokeTeller.tellJokeA();
        jokeTeller.tellJokeB();
        jokeTeller.tellJokeC();


    }

}
