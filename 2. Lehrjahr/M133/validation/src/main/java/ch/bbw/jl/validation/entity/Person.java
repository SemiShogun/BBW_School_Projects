package ch.bbw.jl.validation.entity;
import javax.validation.constraints.*;

public class Person {

    @NotEmpty(message = "Darf nicht leer sein.")
    @Size(min=2, max=8, message = "Die Länge des Namens muss zwischen 2 und 8 sein.")
    private String name;

    @Min(value = 10, message = "zu klein")
    @Max(value = 70, message = "zu gross")
    private Integer age;

    @DecimalMin(value = "1.0", message = "zu klein")
    @DecimalMax(value = "6.0", message = "zu gross")
    private Double grade;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }

}