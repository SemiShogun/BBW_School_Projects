package entities;

import java.io.Serializable;

public class City implements Serializable {

    private String name;
    private int plz;

    public City(String name, int plz) {
        this.name = name;
        this.plz = plz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    @Override
    public String toString() {
        return "entities.City{" +
                "name='" + name + '\'' +
                ", plz=" + plz +
                '}';
    }
}