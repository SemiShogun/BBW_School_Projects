public abstract class Document {
    private String name;

    public Document() {
        System.out.println("Document is being constructed.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Document receives the name:" + name);
    }
}
