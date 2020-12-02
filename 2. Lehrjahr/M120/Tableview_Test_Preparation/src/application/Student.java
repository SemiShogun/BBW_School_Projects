package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Student {
    private SimpleStringProperty firstName;
    private SimpleStringProperty surName;
    private SimpleStringProperty age;
    private SimpleStringProperty hobby;
    private SimpleStringProperty anime;

    private ObservableList<Student> students;

    public Student(String firstName, String surName, String age, String hobby, String anime) {
        this.firstName = new SimpleStringProperty(firstName);
        this.surName = new SimpleStringProperty(surName);
        this.age = new SimpleStringProperty(age);
        this.hobby = new SimpleStringProperty(hobby);
        this.anime = new SimpleStringProperty(anime);

        students = FXCollections.observableArrayList();
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

    public String getSurName() {
        return surName.get();
    }

    public SimpleStringProperty surNameProperty() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName.set(surName);
    }

    public String getAge() {
        return age.get();
    }

    public SimpleStringProperty ageProperty() {
        return age;
    }

    public void setAge(String age) {
        this.age.set(age);
    }

    public String getHobby() {
        return hobby.get();
    }

    public SimpleStringProperty hobbyProperty() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby.set(hobby);
    }

    public String getAnime() {
        return anime.get();
    }

    public SimpleStringProperty animeProperty() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime.set(anime);
    }

    public ObservableList<Student> getStudents() {
        return students;
    }

}
