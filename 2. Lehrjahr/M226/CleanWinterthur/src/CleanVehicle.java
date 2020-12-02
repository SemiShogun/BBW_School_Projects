/**
 * CleanVehicle.java
 * @author Jamie Lam
 * @date 04.10.2019
 *
 */

public class CleanVehicle {

    private String cleanVehicle;

    /**
     * CleanVehicle Constructor
     * @param cleanVehicle
     */
    public CleanVehicle(String cleanVehicle) {
        this.cleanVehicle = cleanVehicle;
    }

    /**
     * Message that displays the cleaning vehicle.
     * @return cleaning vehicle name
     */
    public String toString() {
        return cleanVehicle;
    }
}
