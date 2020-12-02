public class Duck extends Bird {

    public Duck(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println("Chicken " + name + " is flying");
    }

}
