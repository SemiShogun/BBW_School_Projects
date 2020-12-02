/**
 * City.java
 * @author Jamie Lam
 * @date 04.10.2019
 *
 */

public class City {

    private CleanVehicle[] cleanVehicle;
    private Employee[] employees;

    /**
     * City Constructor
     * @param employees
     */
    public City(Employee[] employees) {
        this.employees = employees;

        cleanVehicle = new CleanVehicle[] {
                new CleanVehicle("Optimus Prime"),
                new CleanVehicle("Bumblebee"),
                new CleanVehicle("Cliffjumper"),
                new CleanVehicle("Wheeljack"),
                new CleanVehicle("Prowl")
        };

        for(int i=0; i < employees.length; i++) {
            employees[i].setCleanVehicle(cleanVehicle[i]);
        }

    }

    /**
     * This is a message that displays all the employees along with their cleaning vehicle.
     * @return
     */
    public String message() {
        StringBuilder message = new StringBuilder();
        System.out.print("This city currently has the following employees employed: \n");
        for(int i=0; i<employees.length; i++) {
            message.append("\tEmployee ").append(i).append(" - ").append(employees[i]).append("\n");
        }
        return message.toString();
    }

}
