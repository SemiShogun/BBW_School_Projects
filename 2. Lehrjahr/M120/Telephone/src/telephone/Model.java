package telephone;

import javafx.collections.FXCollections;

/**
 * Model.java
 *
 * @author Jamie Lam
 * @version 08.11.2019
 */
public class Model {
    private String telephone = "";

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void add(String number) {
        String temp = telephone;
        telephone = temp + number;
        setTelephone(telephone);
    }
}
