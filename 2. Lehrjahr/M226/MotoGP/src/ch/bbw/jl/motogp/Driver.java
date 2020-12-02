package ch.bbw.jl.motogp;

import java.util.Date;

public class Driver {
    private String name;
    private String firstName;
    private String birthDate;

    MotorCycle firstMotorCycle;
    MotorCycle secondMotorCycle;

    public Driver(String name, String firstName, String birthDate) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;

        this.firstMotorCycle = null;
        this.secondMotorCycle = null;
    }

    public void setMotorCycle(MotorCycle firstMotorCycle, MotorCycle secondMotorCycle) {
        this.firstMotorCycle = firstMotorCycle;
        this.secondMotorCycle = secondMotorCycle;
    }

    public void resetMotorCycle() {
        firstMotorCycle = null;
        secondMotorCycle = null;
    }

    public String toString() {
        return "Driver: " + name + ", name: " + firstName + ", birthday: "
                + birthDate + ", Motorcycles: motorcycle nr.1 - " + firstMotorCycle
                +" motorcycle nr.2 - " + secondMotorCycle;

    }
}
