package ch.bbw.jl.motogp;

public class MotorCycle {
    private String label;
    private String type;
    private int number;

    public MotorCycle(String label, String type, int number) {
        this.label = label;
        this.type = type;
        this.number = number;
    }

    public String toString() {
        return "Motorcycles: " + label + ", type: " + type + ", number: " + number;
    }
}
