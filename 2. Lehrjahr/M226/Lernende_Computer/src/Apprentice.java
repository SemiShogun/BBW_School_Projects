/**
 * Apprentice.java
 *
 * @author Jamie Lam
 * @version 25.10.2019
 */

public class Apprentice {

    private String name;
    private Laptop personalLaptop;
    private School mySchool;
    private Desktop mySchoolDesktop;

    public Apprentice(String name) {
        this.name = name;
        this.personalLaptop = new Laptop();
        this.mySchool = null;
        this.mySchoolDesktop = null;
    }

    public void setSchool(School mySchool) {
        this.mySchool = mySchool;
    }

    public void startWork() {
        mySchoolDesktop = mySchool.borrowDesktop();
    }

    public void endWork() {
        mySchool.returnDesktop(mySchoolDesktop);
        mySchoolDesktop = null;
    }

    public String toString() {
        return "Apprentice [name = " + name
                + ", Laptop = " + personalLaptop
                + ", Desktop = " + mySchoolDesktop
                + ", School = " + mySchool + "]";
    }

}
