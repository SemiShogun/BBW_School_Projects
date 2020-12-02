import java.util.Arrays;

/**
 * School.java
 *
 * @author Jamie Lam
 * @version 25.10.2019
 */

public class School {
    private String name;
    private Desktop[] desktops;

    public School(String name) {
        this.name = name;
        desktops = new Desktop[] {
                new Desktop(1),
                new Desktop(2),
                new Desktop(3),
                new Desktop(4)
        };
    }

    public Desktop borrowDesktop() {
        int i = 0;

        while ((i < desktops.length) && (desktops[i] != null) && (desktops[i].isBorrowed() == true)) {
            i++;
        }
        if (i<desktops.length) {
            desktops[i].setBorrowed(true);
        }

        return desktops[i];
    }

    public void returnDesktop(Desktop desktop) {
        if (desktop != null) {
            desktop.setBorrowed(false);
        }
    }

    public String toString() {
        return "School [Name = " + name
                + "Desktop = " + Arrays.toString(desktops) + "]";
    }

}
