/**
 * Shoe.java
 *
 * @author Jamie Lam
 * @version 19.06.2020
 */
public class Shoe implements UseCase {

    private int size;

    protected Shoe(int size) {
        this.size = size;
    }

    protected String[] materials() {
        String[] materials = new String[] {
                "Shoelace",
                "Shoesoles"
        };
        return materials;
    }

    @Override
    public boolean forOutdoor() {
        return false;
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

}
