package ch.bbw.jl.motogp;

import java.util.Arrays;

public class Team {

    // Simple attributes.
    private String name;
    private String country;
    private String type;

    private MotorCycle[] motorCycle;

    private Driver firstDriver;
    private Driver secondDriver;

    public Team(String name, String country, String type) {
        // Creating the attributes for the team.
        this.name = name;
        this.country = country;
        this.type = type;

        this.motorCycle = new MotorCycle[] {
                // Manually assigning each motorcycle for this team.
                new MotorCycle("Motorcycle", "1", 1),
                new MotorCycle("Motorcycle", "2", 2),
                new MotorCycle("Motorcycle", "3", 3),
                new MotorCycle("Motorcycle", "4", 4)
        };
    }

    public void setDrivers(Driver firstDriver, Driver secondDriver) {
        // Assigning the drivers.
        this.firstDriver = firstDriver;
        this.secondDriver = secondDriver;

        // Giving the drivers their motorcycles.
        this.firstDriver.setMotorCycle(motorCycle[0], motorCycle[1]);
        this.secondDriver.setMotorCycle(motorCycle[2], motorCycle[3]);
    }

    public void resetDrivers() {
        // Resetting the driver's motorcycles.
        firstDriver.resetMotorCycle();
        secondDriver.resetMotorCycle();

        // Erasing the drivers out of existence.
        firstDriver = null;
        secondDriver = null;
    }

    public String toString() {

        // This is the broadcasted message.
        return name + ": Country: " + country + ", Type " + type
                + ", Motorcycles: " + Arrays.toString(motorCycle) + "\n\n" + "Drivers from " + name + ":" + "\n"
                + "First Driver - " + firstDriver + "\n" + "Second driver - " + secondDriver;
    }
}
