/**
 * Employee.java
 * @author Jamie Lam
 * @date 04.10.2019
 *
 */

public class Employee {

    private String name;
    private CleanVehicle cleanVehicle;

    /**
     * Employee Constructor
     * @param name
     */
    public Employee(String name) {
        this.name = name;
    }

    /**
     * Assigns the cleaning vehicle for the employee.
     * @param cleanVehicle
     */
    public void setCleanVehicle(CleanVehicle cleanVehicle) {
        this.cleanVehicle = cleanVehicle;
    }

    /**
     * The cleaning vehicle will be assigned to no-one.
     */
    public void resetCleanVehicle() {
        this.cleanVehicle = null;
    }

    /**
     * A message that displays which employee has which cleaning vehicle.
     * @return employee's cleaning vehicle
     */
    public String toString() {
        return "Employee " + name + " is currently using " + cleanVehicle + " ";
    }

}
