/**
 * Desktop.java
 *
 * @author Jamie Lam
 * @version 25.10.2019
 */
public class Desktop {
    private String typ;
    private int desktop;
    private boolean isBorrowed;

    public Desktop(int desktop) {
        this.desktop = desktop;
        typ = "Desktop";
        this.isBorrowed = false;
    }

    public Boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String toString() {
        return "Computer [Type = " + typ
                + ", Number = " + desktop
                + ", Status = " + isBorrowed;
    }


}
