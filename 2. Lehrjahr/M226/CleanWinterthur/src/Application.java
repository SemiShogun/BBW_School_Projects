/**
 * Application.java
 * An application class for a somewhat cleaner... Winterthur.
 * @author Jamie Lam
 * @date 04.10.2019
 *
 */

public class Application {
    private City winterthur;
    private Employee people;

    /**
     * Main Constructor
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Composition:
         * - Applikation besitzt Stadt
         * - Applikation besitzt Angestellter
         * - Stadt besitzt Wischfahrzeug
         *
         * Aggregation:
         * - Stadt beschäftigt Angestellter
         * - Angestellter fahrt Wischfahrzeug
         */

        Employee[] employees = new Employee[] {
            new Employee("Sarah"),
            new Employee("Matthias"),
            new Employee("Serena"),
            new Employee("Samuel"),
            new Employee("Jamie")
        };

        City winterthur = new City(employees);

        System.out.println(winterthur.message());
    }

}
