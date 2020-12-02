package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Person {
    private SimpleStringProperty aliasName;
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;

    private ObservableList<Person> employees;

    public Person(String aliasName, String firstName, String lastName) {
        this.aliasName = new SimpleStringProperty(aliasName);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        employees = FXCollections.observableArrayList();
    }

    public String getAliasName() {
        return aliasName.get();
    }

    public SimpleStringProperty aliasNameProperty() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName.set(aliasName);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public ObservableList<Person> getEmployees() {
        return employees;
    }

}
