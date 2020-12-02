import java.util.Date;

public class Joke {
    private int id;
    private String text;
    private int rating;
    private Date insertedDate;

    public Joke(int id, String text, int rating, Date insertedDate) {
        this.id = id;
        this.text = text;
        this.rating = rating;
        this.insertedDate = insertedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(Date insertedDate) {
        this.insertedDate = insertedDate;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                ", insertedDate=" + insertedDate +
                '}';
    }
}
