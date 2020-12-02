public class Application {

    public static void main(String[] args) {
        Bird Birdy = new Bird("Birdy", "Black");
        Chicken Helena = new Chicken("Helena", "White");
        Duck Quack = new Duck("Quack", "Yellow");
        Birdy.fly();
        Helena.fly();
        Quack.swim();

        Bird aBird = Birdy;
        aBird.fly();
        Bird anotherBird = Helena;
        anotherBird.fly();
        anotherBird.swim();

        // Casting a Bird to a Duck???
        // Duck Ede = new Bird("Ede", "Brown");
        Duck Emma = Quack;
        Emma.swim();

        // Is this downcasting???
        // Duck Elsa = (Duck) Birdy;
        // Elsa.swim();

        Bird Beate = new Duck("Beate", "Freckled");
        Beate.fly();
        Beate.swim();
        // vvvvv This is redundant...
        // ((Duck) Birdy).swim();
        // vvvvv This is also redundant...
        ((Duck) Beate).swim();


        // Super() creates the superclass constructor
        // Super(name, vorname) extracts the superclass' constructor with the name and vorname parameters
        // super().flattern calls the superclass' flattern method

    }

}
