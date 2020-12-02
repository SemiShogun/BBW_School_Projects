package ch.bbw.jl.crowdfunding;

/**
 * Spende
 * @author Jamie Lam
 * @version 29.05.2020
 */
public class Spende {
    private String nickname;
    private Double betrag;

    public Spende() {
        super();
    }

    public Spende(String nickname, Double betrag) {
        super();
        this.nickname = nickname;
        this.betrag = betrag;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname= nickname;
    }

    public Double getBetrag() {
        return this.betrag;
    }

    public void setBetrag(Double betrag) {
        this.betrag = betrag;
    }

    @Override
    public String toString() {
        return "Spende [nickname=" + nickname+ ", betrag=" + betrag + "]";
    }
}
