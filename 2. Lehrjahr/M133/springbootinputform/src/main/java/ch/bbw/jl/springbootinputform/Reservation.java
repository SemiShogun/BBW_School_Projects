package ch.bbw.jl.springbootinputform;

/** Reservation.java
 *
 * @author Jamie Lam
 * @version 06.03.2020
 */
public class Reservation {
    private long id;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Reservation [id=" + id + ", content=" + content + "]";
    }
}
