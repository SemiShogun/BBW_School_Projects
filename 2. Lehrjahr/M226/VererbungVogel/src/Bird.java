public class Bird {
    protected String name;
    protected String color;

    public Bird(String name, String color) {
        super();
        this.name = name;
        this.color = color;
    }

    public void swim() {
        System.out.println("Bird " + name + " is swimming");
    }

    public void fly() {
        System.out.println("Bird " + name + " is flying");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}