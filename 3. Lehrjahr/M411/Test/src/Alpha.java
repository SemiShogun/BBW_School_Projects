import java.util.Date;

/**
 * Alpha.java
 *
 * @author Jamie Lam
 * @version 23.10.2020
 */
public class Alpha {
    private String type;
    private Date date;
    private Beta child;
    private String name;

    public Alpha(String type, Date date, Beta child, String name) {
        this.type = type;
        this.date = date;
        this.child = child;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Beta getChild() {
        return child;
    }

    public void setChild(Beta child) {
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alpha{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", child=" + child +
                ", name='" + name + '\'' +
                '}';
    }
}
