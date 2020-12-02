/**
 * SoccerShoe.java
 *
 * @author Jamie Lam
 * @version 19.06.2020
 */
public class SoccerShoe extends SportsShoe {

    private boolean forSoccer;

    public SoccerShoe(int size, String sportArt, boolean forSoccer) {
        super(size, sportArt);
        this.forSoccer = forSoccer;
    }

    @Override
    public boolean forOutdoor() {
        return true;
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

}
