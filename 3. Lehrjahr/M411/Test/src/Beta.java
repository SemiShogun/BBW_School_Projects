/**
 * Beta.java
 *
 * @author Jamie Lam
 * @version 23.10.2020
 */
public class Beta implements Comparable<Beta>{
    private double type;
    private int value;

    public Beta(double type, int value) {
        this.type = type;
        this.value = value;
    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Beta arg) {
        int test = 0;
        if (type > arg.getType()) {
            test = 1;
        } else if (type < arg.getType()) {
            test = -1;
        } else {
            test = 0;
        }

        if (test == 0) {
            return 0;
        } else if (value < arg.getValue()) {
            return -1;
        } else {
            return 1;
        }
    }
}
