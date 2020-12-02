/**
 * SportsShoe.java
 *
 * @author Jamie Lam
 * @version 19.06.2020
 */
public class SportsShoe extends Shoe {

    private String sportArt;

    public SportsShoe(int size, String sportArt) {
        super(size);
        this.sportArt = sportArt;
    }

    public void setSportArt(String sportArt) {
        this.sportArt = sportArt;
    }

    @Override
    public boolean forOutdoor() {
        return true;
    }

    @Override
    public boolean isWaterProof() {
        return true;
    }

}
