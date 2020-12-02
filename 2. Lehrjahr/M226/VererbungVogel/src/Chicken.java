public class Chicken extends Bird {

    public Chicken(String name, String color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("Chicken " + name + " is swimming");
    }

}
